package com.yuriyb.hibernate.tps_a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contract_employees_tps_a")
@PrimaryKeyJoinColumn(name = "id")
public class ContractEmployee extends Employee {

	@Column(name = "hourlypay")
	private float hourlyPay;

	@Column(name = "contract_duration")
	private String contractDuration;

	public float getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
}