package hibernate;

import hibernate.entities.Course;
import hibernate.entities.Employee;
import hibernate.entities.Instructor;
import hibernate.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToManyDemoApp {

    public static void main(String... args)
    {
        try(SessionFactory sessionFactory = prepareSessionFactory())
        {
            persistExampleInstructor(sessionFactory);
            readExampleInstructor(sessionFactory);
        }
    }

    private static void persistExampleInstructor(SessionFactory sessionFactory) {
        try(Session session = sessionFactory.getCurrentSession())
        {
            Instructor instructor = new Instructor("Adam","1. Kowalski","adam@kowal.pl");
            instructor.setInstructorDetails(new InstructorDetails("Czanel","Spanie"));

            session.beginTransaction();
            System.out.println("instructor before persisting = " + instructor);

            session.save(instructor);
            System.out.println("Persisted");

            session.getTransaction().commit();
        }
    }

    private static void readExampleInstructor(SessionFactory sessionFactory) {
        try(Session session = sessionFactory.getCurrentSession())
        {
            session.beginTransaction();

            List<Instructor> instructor = session.createQuery("from Instructor").getResultList();

            instructor.forEach(e -> System.out.println("Fetched ins: "+e));
            session.getTransaction().commit();
        }
    }

    public static SessionFactory prepareSessionFactory()
    {
        System.out.println("Creating session...");
        return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).
                addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();
    }
}
