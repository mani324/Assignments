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
	private int person_id;
	private String name;
	@OneToMany(targetEntity=Shopping.class,cascade=CascadeType.ALL)
	@JoinColumn(name="person_id")
	private List<Shopping>shop;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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
