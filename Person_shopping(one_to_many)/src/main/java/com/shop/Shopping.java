package com.shop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Shopping")
public class Shopping {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	private int shop_id;
	private String shop_name,shop_location,item;
	
	
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_location() {
		return shop_location;
	}
	public void setShop_location(String shop_location) {
		this.shop_location = shop_location;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
}
