package iterasyonUc;

import javax.persistence.EntityManager;

public class EntityManagerAC implements AutoCloseable {

	private EntityManager entityManager;
	
	public EntityManagerAC(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void close() throws Exception {
		if(entityManager != null) {
			if(entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			entityManager.close();
		}
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

}
