package com.app.pojos;

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
@Table(name = "issuerecord")
public class IssueRecord 
{
	private Integer issueRecordId;
	private Copies copyId;
	private User memberId;
	private Date issueDate;
	private Date returnDueDate;
	private Date returnDate;
	private double fineAmount;
	
	public IssueRecord() {
	System.out.println("in issuerecord pojo");
	}

	public IssueRecord(Copies copyId, User memberId, Date issueDate, Date returnDueDate, Date returnDate,
			double fineAmount) {
		super();
		this.copyId = copyId;
		this.memberId = memberId;
		this.issueDate = issueDate;
		this.returnDueDate = returnDueDate;
		this.returnDate = returnDate;
		this.fineAmount = fineAmount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIssueRecordId() {
		return issueRecordId;
	}

	public void setIssueRecordId(Integer issueRecordId) {
		this.issueRecordId = issueRecordId;
	}
    @ManyToOne
	@JoinColumn(name = "copy_id")
	public Copies getCopyId() {
		return copyId;
	}

	public void setCopyId(Copies copyId) {
		this.copyId = copyId;
	}

	@JoinColumn(name = "member_id")
	@ManyToOne
	public User getMemberId() {
		return memberId;
	}

	public void setMemberId(User memberId) {
		this.memberId = memberId;
	}

	@Temporal(TemporalType.DATE)
	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getReturnDueDate() {
		return returnDueDate;
	}

	public void setReturnDueDate(Date returnDueDate) {
		this.returnDueDate = returnDueDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Column(length = 50)
	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
	
}
