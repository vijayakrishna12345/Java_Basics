package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Ticket;
import com.rakuten.prj.service.TicketService;

public class DisplayOpenTickets {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketService.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.register(EmployeeDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();
		TicketService os = ctx.getBean("ticketService", TicketService.class);

		
		List<Ticket> t = os.getNotResolvedTickets();
		for (Ticket c : t) {

			System.out.println(t);

		}

	}

}
