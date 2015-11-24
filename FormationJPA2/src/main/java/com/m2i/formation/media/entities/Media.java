package com.m2i.formation.media.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int category;

	@Temporal(TemporalType.DATE)
	private Date dateParution;

	private int id_Publisher;

	private String langue;

	private int nbPages;

	private int nbTracks;

	private int numISBN;

	private float price;

	private String title;

	public Media() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getDateParution() {
		return this.dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public int getId_Publisher() {
		return this.id_Publisher;
	}

	public void setId_Publisher(int id_Publisher) {
		this.id_Publisher = id_Publisher;
	}

	public String getLangue() {
		return this.langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public int getNbPages() {
		return this.nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public int getNbTracks() {
		return this.nbTracks;
	}

	public void setNbTracks(int nbTracks) {
		this.nbTracks = nbTracks;
	}

	public int getNumISBN() {
		return this.numISBN;
	}

	public void setNumISBN(int numISBN) {
		this.numISBN = numISBN;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}