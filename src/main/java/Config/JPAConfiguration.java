package Config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConfiguration {
    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager entityManager = factory.createEntityManager();


    public static EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void shutdown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }
}
