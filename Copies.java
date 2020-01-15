package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "copies")
public class Copies {
	private Integer copyId;
	private Books copyBookId;
	private String copyRack;
	private String copyStatus;
	public Copies() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Copies [copyId=" + copyId + ", copyBookId=" + copyBookId + ", copyRack=" + copyRack + ", copyStatus="
				+ copyStatus + "]";
	}
	
}
