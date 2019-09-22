package ruslan.zhezlo.demo;

import ruslan.zhezlo.demo.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DomoApplication {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("blablabla");

        EntityManager em = factory.createEntityManager();

      Car car = new Car(5L, "Audi a8", 2000L, 3.0, true);
      em.getTransaction().begin();
      em.persist(car);

      em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
