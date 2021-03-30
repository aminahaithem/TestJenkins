package com.sip.testJenkins.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_article")
	private int idArticle;
	@Column(name = "designation")
	private String designation;
	@Column(name = "qte")
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
	public Article(String designation, double qte) {
		
		this.designation = designation;
		this.qte = qte;
	}

	
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
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
