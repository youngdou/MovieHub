package com.DzGeeks.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * 电影院类
 */
@Entity
@Table(name = "Cinema")
public class Cinema {

	private int cinemaId;
	private String name;
	private int addressId;
	private String phone;
	
}
