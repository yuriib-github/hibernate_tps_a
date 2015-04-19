package com.yuriyb.hibernate.tps_a;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		Session session = cfg.configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Donald Trump");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Aleksandr Maslyakov");
		e2.setSalary(30000);
		e2.setBonus(3);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("John Reed");
		e3.setHourlyPay(1000);
		e3.setContractDuration("12 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("The data has been created successfully");
	}
}