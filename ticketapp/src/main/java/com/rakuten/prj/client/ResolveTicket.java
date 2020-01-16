package com.rakuten.prj.client;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Employee;
import com.rakuten.prj.entity.Ticket;
import com.rakuten.prj.service.TicketService;

public class ResolveTicket {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketService.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.register(EmployeeDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();
		TicketService os = ctx.getBean("ticketService", TicketService.class);
		
//		Ticket t = new Ticket();
//		String text="RAM cleared";
//		t.setResolvedText(text);
//        Employee e = new Employee();
//        e.setEmployeeId(1);
//        t.setResolvedBy(e);
		
		
		 Employee e1 = new Employee();
	     e1.setEmployeeId(1);	
		 Employee e2 = new Employee();
	     e2.setEmployeeId(2);
	     String text="RAM cleared";
	     os.resolveTicket(1,1,e1,e2, text);
	     
	     
	     System.out.println("Resolved Ticket Confirmed!!!");
        
        

	}

}
