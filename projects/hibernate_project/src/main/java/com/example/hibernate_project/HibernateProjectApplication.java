package com.example.hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HibernateProjectApplication {


    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                                                            .configure()
                                                            .addAnnotatedClass(Instructor.class)
                                                            .addAnnotatedClass(InstructorDetails.class)
                                                            .addAnnotatedClass(Course.class)
                                                            .addAnnotatedClass(Review.class)
                                                            .addAnnotatedClass(Student.class)
                                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


      try {
          session.beginTransaction();

          Course course = new Course("JavaScript Full Stack");

          Student student = session.get(Student.class, 6);

          student.addCourseList(course);

          session.save(course);

          session.getTransaction().commit();

      }catch (Exception exception) {
          session.close();
          session.getTransaction().rollback();

      }finally {
          sessionFactory.close();

      }

        SpringApplication.run(HibernateProjectApplication.class, args);
    }
}
