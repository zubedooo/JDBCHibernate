package com;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cms.deloitte.model.AmazonCustomer;
import com.cms.deloitte.model.CardDetail;

public class OneToOneAmazonTest {
	public static void main(String[] args) {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		org.hibernate.Transaction transaction = session.beginTransaction();
		
		AmazonCustomer amazonCustomer = new AmazonCustomer();
		amazonCustomer.setCustomerName("Zubin");
		amazonCustomer.setEmailId("Zubin@gmail.com");
		
		session.save(amazonCustomer);
		
		CardDetail cardDetail1 = new CardDetail();
		cardDetail1.setBankName("CITI");
		cardDetail1.setAmazonCustomer(amazonCustomer);
		
		session.save(cardDetail1);
				
		transaction.commit();
		session.close();
		System.out.println("Done");
	}
}
