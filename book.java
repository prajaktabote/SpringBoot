package com.ask.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book_info")
public class book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Bid;
	String title;
	int publishedYear;
	

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="aid")
	author at;
	
	public book() {
		super();
	}

	public book(int bid, String title, int publishedYear) {
		super();
		Bid = bid;
		this.title = title;
		this.publishedYear = publishedYear;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public author getAt() {
		return at;
	}

	public void setAt(author at) {
		this.at = at;
	}

	
}

	