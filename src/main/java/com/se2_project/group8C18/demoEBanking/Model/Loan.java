package com.se2_project.group8C18.demoEBanking.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table
@Entity
@PrimaryKeyJoinColumn(name = "loanId")
public class Loan extends InvestType{

	
	
	@Column(nullable = false)
	private double rate;
	
	@Column(nullable = false)
	private int duration;
	
	@Column
	private long amount;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
}
