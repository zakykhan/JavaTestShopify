package com.CRUD.onetoonedemo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "variant")
public class Variant implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String price;
	@Column
	private Long position;
	@Column
	private String barcode;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
	
	public Variant() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Variant(Long id,String price, Long position, String barcode) {
		this.id = id;
		this.price = price;
		this.position = position;
		this.barcode = barcode;
	}

}
