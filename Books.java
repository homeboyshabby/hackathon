package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private String bookSubject;
	private double bookPrice;
	private List<Copies> copiesList = new ArrayList<>();
	private long bookIsbn;
	public Books() {
		System.out.println("in books pojo");
	}
	public Books(String bookName, String bookAuthor, String bookSubject, double bookPrice, long bookIsbn) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookSubject = bookSubject;
		this.bookPrice = bookPrice;
		this.bookIsbn = bookIsbn;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	@Column(name = "name")
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Column(name = "author")
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Column(name = "subject")
	public String getBookSubject() {
		return bookSubject;
	}
	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}
	@Column(name = "price")
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Column(name = "isbn")
	public long getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(long bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	@OneToMany(mappedBy = "copyBookId",orphanRemoval = true,cascade = CascadeType.ALL)
	public List<Copies> getcopiesList() {
		return copiesList;
	}
	public void setcopiesList(List<Copies> copies) {
		this.copiesList = copies;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookSubject="
				+ bookSubject + ", bookPrice=" + bookPrice + ", bookIsbn=" + bookIsbn + "]";
	}
	
	
}
