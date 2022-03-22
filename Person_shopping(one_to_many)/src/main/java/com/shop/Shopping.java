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
	
	private int shop_Id;
	private String shop_Name,shop_Location,item;
	
	
	public int getShop_Id() {
		return shop_Id;
	}
	public void setShop_Id(int shop_Id) {
		this.shop_Id = shop_Id;
	}
	public String getShop_Name() {
		return shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getShop_Location() {
		return shop_Location;
	}
	public void setShop_Location(String shop_Location) {
		this.shop_Location = shop_Location;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
}
