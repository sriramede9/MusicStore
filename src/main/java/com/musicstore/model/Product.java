package com.musicstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String productname;

	private String productCategory;

	private String productDescription;

	private double productPrice;

	private String productCondition;

	private String productStatus;

	private int unitsInStock;

	private String productManufacturer;

//	@Transient
//	private MultipartFile productImage;

//	public MultipartFile getProductImage() {
//		return productImage;
//	}
//
//	public void setProductImage(MultipartFile productImage) {
//		this.productImage = productImage;
//	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", productCategory=" + productCategory
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice
				+ ", productCondition=" + productCondition + ", productStatus=" + productStatus + ", unitsInStock="
				+ unitsInStock + ", productManufacturer=" + productManufacturer + "]";
	}

}
