package com.rakuten.prj.dao;

import java.util.Date;
import java.util.List;

import com.rakuten.prj.entity.Ticket;

public interface TicketDao {
	
	void addTicket(Ticket p);
	List<Ticket> getOpenTickets();
	List<Ticket> getAllTickets();
	void resolveTicket(Ticket t);
	Ticket findId(int id);
	

}
