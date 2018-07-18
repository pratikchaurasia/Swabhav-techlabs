package com.techlabs.entity;



import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;



@Entity
public class Customer {
	@Id
	@Column(columnDefinition = "BINARY(16)", name = "custid", unique = true )
	private UUID custid;
	private String name;
	private String password;
	

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Orders> orders;
	
	public UUID getCustid() {
		return custid;
	}

	public void setCustid(UUID custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}

	public String getPassword() {
		return password;
	}
	
	
}
