package com.entities.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Categorie;
import com.entities.services.IserviceCat;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("Beans.xml");

		IserviceCat	pm= (IserviceCat) ctx2.getBean("servicecat");
		Categorie c=new Categorie();
		c.setLibelle("alpha");
		pm.AddCategorie(c);
	}

}
