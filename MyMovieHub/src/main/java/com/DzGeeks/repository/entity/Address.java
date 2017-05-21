package com.DzGeeks.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 地址表
 */
@Entity
@Table(name = "Address")
public class Address {

	private int addressId; // 地址id
	private String city; // 城市名
	private String district; // 区名

	public Address() {
	}

	public Address(String city, String district) {
		this.city = city;
		this.district = district;
	}

	@Id
	@Column(name = "addressId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "city", nullable = false, length = 200)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "district", nullable = false, length = 200)
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", district=" + district + "]";
	}

}
