package com.tka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobId;
	private String brandName;
	private double mobcost;
	
	public Mobile(int mobId, String brandName, double mobcost) {
		super();
		this.mobId = mobId;
		this.brandName = brandName;
		this.mobcost = mobcost;
	}

	public Mobile(int mobId) {
		super();
		this.mobId = mobId;
	}

	public Mobile() {
		super();
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getMobcost() {
		return mobcost;
	}

	public void setMobcost(double mobcost) {
		this.mobcost = mobcost;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandName=" + brandName + ", mobcost=" + mobcost + "]";
	}
	
	
	

}
