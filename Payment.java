package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Id;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payments")
public class Payment {
	private Integer paymentId;
	private double amount;
	private Type type;
	private Date transactionDate;
	private Date nextTransactionDate;
	private User user;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(double amount, Type type, Date transactionDate, Date nextTransactionDate, User user) {
		super();
		this.amount = amount;
		this.type = type;
		this.transactionDate = transactionDate;
		this.nextTransactionDate = nextTransactionDate;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getNextTransactionDate() {
		return nextTransactionDate;
	}

	public void setNextTransactionDate(Date nextTransactionDate) {
		this.nextTransactionDate = nextTransactionDate;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", type=" + type + ", transactionDate="
				+ transactionDate + ", nextTransactionDate=" + nextTransactionDate + ", user=" + user + "]";
	}
	
	
}
