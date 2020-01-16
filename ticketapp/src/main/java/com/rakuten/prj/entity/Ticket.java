package com.rakuten.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int ticketId;
	
	@ManyToOne
	@JoinColumn(name="raised_by")
	private Employee raisedBy;
	
	@Column(name = "ticket_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketDate = new Date();
	
	@Column(name="ticket_desc")
	private String ticketDesc;
	
	@ManyToOne
	@JoinColumn(name="resolved_by")
	private Employee resolvedBy;
	
	@Column(name = "resolved_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate = new Date();
	
	@Column(name = "resolved_text")
	private String resolvedText;

	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * @return the raisedBy
	 */
	public Employee getRaisedBy() {
		return raisedBy;
	}

	/**
	 * @param raisedBy the raisedBy to set
	 */
	public void setRaisedBy(Employee raisedBy) {
		this.raisedBy = raisedBy;
	}

	/**
	 * @return the ticketDate
	 */
	public Date getTicketDate() {
		return ticketDate;
	}

	/**
	 * @param ticketDate the ticketDate to set
	 */
	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}

	/**
	 * @return the resolvedBy
	 */
	public Employee getResolvedBy() {
		return resolvedBy;
	}

	/**
	 * @param resolvedBy the resolvedBy to set
	 */
	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	/**
	 * @return the resolvedDate
	 */
	public Date getResolvedDate() {
		return resolvedDate;
	}

	/**
	 * @param resolvedDate the resolvedDate to set
	 */
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	/**
	 * @return the resolvedText
	 */
	public String getResolvedText() {
		return resolvedText;
	}

	/**
	 * @param resolvedText the resolvedText to set
	 */
	public void setResolvedText(String resolvedText) {
		this.resolvedText = resolvedText;
	}

	/**
	 * @return the ticketDesc
	 */
	public String getTicketDesc() {
		return ticketDesc;
	}

	/**
	 * @param ticketDesc the ticketDesc to set
	 */
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
	
	
	
}
