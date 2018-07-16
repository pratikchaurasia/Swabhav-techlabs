package com.techlabs.lineitem;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.techlabs.order.Orders;
import com.techlabs.product.Product;

@Entity
public class LineItem {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "lineid", unique = true)
	private UUID id;
	private double totalCost;
	private int quantity;

	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@ManyToOne
	@JoinColumn
	private Orders order;
	
	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public double calculateItemCost() {
		totalCost = product.getPrice() * quantity;
		return totalCost;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void addQuantity(int quant) {
		quantity = quantity + quant;
	}

}
