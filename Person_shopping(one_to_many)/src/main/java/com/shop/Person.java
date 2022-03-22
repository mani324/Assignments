package com.shop;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int person_Id;
	private String name;
	@OneToMany(targetEntity=Shopping.class,cascade=CascadeType.ALL)
	@JoinColumn(name="person_Id")
	private List<Shopping>shop;
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Shopping> getShop() {
		return shop;
	}
	public void setShop(List<Shopping> shop) {
		this.shop = shop;
	}
    
}
