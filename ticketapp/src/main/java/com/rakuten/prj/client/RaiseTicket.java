package com.rakuten.prj.client;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Employee;
import com.rakuten.prj.entity.Ticket;
import com.rakuten.prj.service.TicketService;

public class RaiseTicket {

	public static void main(String[] args) {
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		
        ctx.register(TicketService.class);
        ctx.register(TicketDaoJpaImpl.class);
        ctx.register(EmployeeDaoJpaImpl.class);
        ctx.register(AppConfig.class);
        ctx.refresh();
        TicketService os = ctx.getBean("ticketService",TicketService.class);
        
        
        Ticket t = new Ticket();
        t.setTicketId(0);
        Employee e = new Employee();
        e.setEmployeeId(1);
        t.setRaisedBy(e);
        t.setTicketDesc("Reboots");
        Date d=new Date();
        t.setTicketDate(d);
        os.insertTicket(t);
        
        System.out.println("Raise Ticket Confirmed!!!");
        

	}

}
