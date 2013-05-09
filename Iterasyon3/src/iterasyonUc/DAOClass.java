package iterasyonUc;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import entities.KisiTable;

public class DAOClass {
	
	
	
	
	public static String QUERY = "select b from KisiTable b ";

	public static String QUERY_ALL = "select b from KisiTable b";
	
	public static <T> T save(Class<T> entityClass, T entity) throws Exception {		
		int id = (int)entity.getClass().getDeclaredMethod("getId").invoke(entity);
		
		
		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
			entityManagerAC.getEntityManager().getTransaction().begin();
			if(id <= 0) {
				entityManagerAC.getEntityManager().persist(entity);
			}
			else {
				entity = entityManagerAC.getEntityManager().merge(entity);
			}
			entityManagerAC.getEntityManager().getTransaction().commit();
		}
		
		return entity;
	}



	public static <T> void delete(Class<T> entityClass, T entity) throws Exception {	
		int id = (int)entity.getClass().getDeclaredMethod("getId").invoke(entity);

		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
			T entityToDelete = entityManagerAC.getEntityManager().find(entityClass, id);

			if(entityToDelete == null) {
				throw new Exception("Cannot delete, no record exists with this id.");
			}

			entityManagerAC.getEntityManager().getTransaction().begin();
			entityToDelete.getClass().getDeclaredMethod("setDeleted", Boolean.TYPE).invoke(entityToDelete, Boolean.TRUE);
			entityManagerAC.getEntityManager().persist(entityToDelete);
			entityManagerAC.getEntityManager().getTransaction().commit();
		}
	}



//	public static <T> T retrieve(Class<T> class1,java.util.Date date) throws Exception{
//
//
//		T entiti = null;
//
//		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
//			TypedQuery<T> query = entityManagerAC.getEntityManager().createQuery(QUERY, class1);
//			query.setParameter("date", date);
//
//			List<T> result = query.getResultList();
//
//			if(result != null && result.size() > 0){
//				entiti = result.get(0);
//			
//			}
//		}
//
//		return entiti;
//
//
//	}

	public static <T> List<T> retrieveAll(Class<T> class1) throws Exception{


		List<T> entities = null;

		
		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
			TypedQuery<T> query = entityManagerAC.getEntityManager().createQuery(QUERY_ALL, class1);

			entities = query.getResultList();

		}
		catch(Exception ex)
		{
			
			
		}

		return entities;

	}
	
	public static <T> T retrieveEntityById(Class<T> entityClass, int id) throws Exception {
		T entity = null;

		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
			entity = entityManagerAC.getEntityManager().find(entityClass, id);
		}

		return entity;
	}

	public static <T> List<T> retrieveAllEntities(Class<T> entityClass, String orderBy, List<Object []> andPredicates) throws Exception {
		List<T> entities = null;
		
		try(EntityManagerAC entityManagerAC = PersistenceManager.INSTANCE.getEntityManager()) {
			CriteriaQuery<T> criteriaQuery = entityManagerAC.getEntityManager().getCriteriaBuilder().createQuery(entityClass);
			Root<T> typeRoot = criteriaQuery.from(entityClass);
			criteriaQuery.select(typeRoot);
			
			if(andPredicates != null && andPredicates.size() > 0) {
				Predicate []predicates = new Predicate[andPredicates.size()];
				for(int i=0 ; i<predicates.length ; i++) {
					predicates[i] = entityManagerAC.getEntityManager().getCriteriaBuilder().equal(typeRoot.get((String)andPredicates.get(i)[0]),andPredicates.get(i)[1]);
				}
				criteriaQuery.where(entityManagerAC.getEntityManager().getCriteriaBuilder().and(predicates));
			}
			
			if(orderBy != null) {
				criteriaQuery.orderBy(entityManagerAC.getEntityManager().getCriteriaBuilder().asc(typeRoot.get(orderBy)));			
			}
			TypedQuery<T> typedQuery = entityManagerAC.getEntityManager().createQuery(criteriaQuery);
			entities = typedQuery.getResultList();
		}
		
		return entities;
	}
	
	
	
	

}
