package com.techlabs.order;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.techlabs.customer.Customer;
import com.techlabs.lineitem.LineItem;

@Entity
public class Orders {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "orderid", unique = true)
	private UUID orderid;
	private Date date;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL , fetch=FetchType.EAGER)
	private Set<LineItem> items;
	
	@ManyToOne
	@JoinColumn
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private double totalPrice = 0;
	
	public Set<LineItem> getItems() {
		return items;
	}

	public void setItems(Set<LineItem> items) {
		this.items = items;
	}
	public void checkoutPrice() {
		for (LineItem item : items) {
			this.totalPrice = totalPrice + item.getTotalCost();
		}	
	}

	


	public UUID getOrderid() {
		return orderid;
	}

	public void setOrderid(UUID orderid) {
		this.orderid = orderid;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
