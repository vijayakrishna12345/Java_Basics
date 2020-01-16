package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Employee;
import com.rakuten.prj.service.TicketService;

public class InsertEmployee {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		
        ctx.register(TicketService.class);
        ctx.register(TicketDaoJpaImpl.class);
        ctx.register(EmployeeDaoJpaImpl.class);
        ctx.register(AppConfig.class);
        ctx.refresh();
        TicketService os = ctx.getBean("ticketService",TicketService.class);
        
//    	Employee[] emp = new Employee[2];
//		emp[0] = new Employee(0,"vijay12345@gmail.com", "Vijay","S");
//		emp[1] = new Employee(0,"karthi22@gmail.com", "Karthik","L");
        Employee emp1 = new Employee();
        emp1.setEmail("vijay12345@gmail.com");
        emp1.setFirstName("Vijay");
        emp1.setLastName("S");
        os.insertEmployee(emp1);
        Employee emp2 = new Employee();
        emp2.setEmail("karthi@gmail.com");
        emp2.setFirstName("Karthi");
        emp2.setLastName("L");
        os.insertEmployee(emp2);

//		for (Employee c : emp) {
//
//			os.insertEmployee(c);
//
//		}
        
        

		System.out.println("Employees inserted!!!");

	}

}
