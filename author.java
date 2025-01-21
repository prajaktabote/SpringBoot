package com.ask.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="author_info")
public class author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int aid;
	String name;
	String country;
	
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL, orphanRemoval=true)
	List<book> bk=new ArrayList<book>();

	public author() {
		super();
	}
	public author(int aid, String name, String country) {
		super();
		this.aid = aid;
		this.name = name;
		this.country = country;
	}
	public int getAId() {
		return aid;
	}
	public void setAId(int aid) {
		this.aid = aid;
	}
	public List<book> getBk() {
		return bk;
	}
	public void setBk(List<book> bk) {
		this.bk = bk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
