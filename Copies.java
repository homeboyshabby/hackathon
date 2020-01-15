package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "copies")
public class Copies {
	private Integer copyId;
	private Books copyBookId;
	private String copyRack;
	private String copyStatus;
	private List<IssueRecord> issueRecordList ;
	public Copies() {
		System.out.println("in copies pojo");
	}
	public Copies(Books copyBookId, String copyRack, String copyStatus) {
		super();
		this.copyBookId = copyBookId;
		this.copyRack = copyRack;
		this.copyStatus = copyStatus;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getCopyId() {
		return copyId;
	}
	public void setCopyId(Integer copyId) {
		this.copyId = copyId;
	}
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	public Books getCopyBookId() {
		return copyBookId;
	}
	public void setCopyBookId(Books copyBookId) {
		this.copyBookId = copyBookId;
	}
	@Column(name = "rack")
	public String getCopyRack() {
		return copyRack;
	}
	public void setCopyRack(String copyRack) {
		this.copyRack = copyRack;
	}
	@Column(name = "status")
	public String getCopyStatus() {
		return copyStatus;
	}
	public void setCopyStatus(String copyStatus) {
		this.copyStatus = copyStatus;
	}
	
	@OneToMany(mappedBy = "copyId" ,cascade = CascadeType.ALL, orphanRemoval = true)
	public List<IssueRecord> getIssueRecordList() {
		return issueRecordList;
	}
	public void setIssueRecordList(List<IssueRecord> issueRecordList) {
		this.issueRecordList = issueRecordList;
	}
	@Override
	public String toString() {
		return "Copies [copyId=" + copyId + ", copyBookId=" + copyBookId + ", copyRack=" + copyRack + ", copyStatus="
				+ copyStatus + "]";
	}
	
}
