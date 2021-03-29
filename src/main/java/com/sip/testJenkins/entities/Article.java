package com.sip.testJenkins.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idArticle;
	private String designation;
	private double qte;
	/**
	 * 
	 */
	 
	 //Hello
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idArticle
	 * @param designation
	 * @param qte
	 */
	public Article(long idArticle, String designation, double qte) {
		this.idArticle = idArticle;
		this.designation = designation;
		this.qte = qte;
	}

	public long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", designation=" + designation + ", qte=" + qte + "]";
	}
	
}
