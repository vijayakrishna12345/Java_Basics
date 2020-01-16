package com.rakuten.prj.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.EmployeeDao;
import com.rakuten.prj.dao.TicketDao;
import com.rakuten.prj.entity.Employee;
import com.rakuten.prj.entity.Ticket;

@Service
@Transactional
public class TicketService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Autowired
	private TicketDao ticketDao;
	
	public void insertEmployee(Employee p)
	{
		employeeDao.addEmployee(p);
	}

	
	public List<Ticket> getAllTickets()

	{
		return ticketDao.getAllTickets();
	}
	
	public List<Ticket> getNotResolvedTickets()

	{
		return ticketDao.getOpenTickets();
	}
	
	public void insertTicket(Ticket p)
	{
		p.setRaisedBy(employeeDao.findById(p.getRaisedBy().getEmployeeId()));
		ticketDao.addTicket(p);
	}
	

	
	public void resolveTicket(int id,int tid,Employee e1,Employee e2,String text)
	{
		Ticket t = ticketDao.findId(tid);
		Employee emp = employeeDao.findById(id);
		
		
		
        t.setRaisedBy(emp);
		t.setResolvedText(text);
        t.setResolvedBy(e2);
        Date d=new Date();
        t.setResolvedDate(d);
        t.setResolvedText("RAM Cleared");
        ticketDao.resolveTicket(t);
	
	}

}
