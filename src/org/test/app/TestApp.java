package org.test.app;

import org.dao.sregion.DaoImpl;
import org.modelo.sregion.S_Region;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	
	public static void addS_Region() { 
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		dao.addS_Region(new S_Region(36, "REGION SPRING"));
	}

	public static void updateS_Region() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		dao.addS_Region(new S_Region(45, "APIZACO"));
	}

	public static void deleteS_Region() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		dao.addS_Region(new S_Region(36));
	}
	
	
	public static void selectByIdS_Region() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl daoImpl = context.getBean("daoImpl", DaoImpl.class);
		S_Region region = daoImpl.getS_RegionById(1);
		System.out.println(region.getId()+","+region.getName());
	}
	
	
	public static void createTableAutomovil() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl daoImpl = context.getBean("daoImpl", DaoImpl.class);
		daoImpl.createTableAutomovil();
	}

	
	
	

	
			public static void main(String[] args) {

				// addS_Region();
				// updateS_Region
				//deleteS_Region();
				//selectByIdS_Region();
				createTableAutomovil();
				
			}			
}
