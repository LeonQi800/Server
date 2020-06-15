package com.lioenix.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;



@Entity
@Table(name="users")
public class HulkUser implements Serializable{

	private static final long serialVersionUID = -1892848928419076521L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String email;
	  
	private Integer gender; 
  
	@Column(nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	@Column(nullable = false)
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	@Column(nullable = false)
	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}
	  
	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
}
