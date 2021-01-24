package com.CRUD.onetoonedemo.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "vendor")
	private String vendor;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
	private Variant variant;
  
	// Hibernate requires a no-arg constructor
	public Product() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Variant getVariant() {
		return variant;
	}

	public void setVariant(Variant variant) {
		this.variant = variant;
	}
	
	
	public Product(String title, String vendor) {
		this.title = title;
		this.vendor = vendor;	
	}
	
}
