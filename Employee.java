package com.app.pojos;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "dac_employees")
@JsonIgnoreProperties(value = {"image"})
public class Employee 
{
	@JsonProperty(value = "no")
	private Integer id;
	private String name,address;
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "IST")
	private Date hireDate;
	private byte[] image;
	public Employee() {
	System.out.println("in pojo ctor");
	}
	public Employee(String name, String address, Date hireDate, byte[] image) {
		super();
		this.name = name;
		this.address = address;
		this.hireDate = hireDate;
		this.image = image;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "hire_date")
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Lob
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", hireDate=" + hireDate + ", image="
				+ Arrays.toString(image) + "]";
	}
}
