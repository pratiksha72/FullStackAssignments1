package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {
	@Override
	public String toString() {
		return "CreditCard [credit_card_num=" + credit_card_num + ", acc_num=" + acc_num + ", cust_id=" + cust_id
				+ ", password=" + password + ", debit_card_num=" + debit_card_num + "]";
	}


	@Id
	
	private int credit_card_num;
	
	
	private int acc_num;
	
	
	private  int cust_id;
	
	private String password;
	
	
	private  int debit_card_num;


	public int getCredit_card_num() {
		return credit_card_num;
	}


	public void setCredit_card_num(int credit_card_num) {
		this.credit_card_num = credit_card_num;
	}


	public int getAcc_num() {
		return acc_num;
	}


	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getDebit_card_num() {
		return debit_card_num;
	}


	public void setDebit_card_num(int debit_card_num) {
		this.debit_card_num = debit_card_num;
	}

	
}
