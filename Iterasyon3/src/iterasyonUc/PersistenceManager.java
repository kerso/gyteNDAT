package iterasyonUc;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {
	INSTANCE;
	
	private EntityManagerFactory entityManagerFactory;
	
	private PersistenceManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Iterasyon3");
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public EntityManagerAC getEntityManager() {
		EntityManagerAC entityManagerAC = new EntityManagerAC(entityManagerFactory.createEntityManager());
		return entityManagerAC;
	}
}
