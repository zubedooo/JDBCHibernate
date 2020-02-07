package com;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cms.deloitte.model.Employee;
import com.cms.deloitte.model.Project;

public class OneToManyEmp {
	public static void main(String[] args) {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEmpid(1);
		employee.setEmpName("Zubin");
		employee.setMobileNumber("7353402999");
		employee.setEmailid("Zubin@gmail.com");
		
		session.save(employee);
		
		Project project = new Project();
		project.setProjectId(3401);
		project.setProjectName("Cloud Computing");
		project.setProjectLocation("Bangalore");
		project.setEmployee(employee);
		
		session.save(project);
		
		Project project1 = new Project();
		project1.setProjectId(3402);
		project1.setProjectName("Data Science");
		project1.setProjectLocation("Gurgaon");
		project1.setEmployee(employee);
		
		session.save(project1);
				
		transaction.commit();
		session.close();
		System.out.println("Done");
	}
}
