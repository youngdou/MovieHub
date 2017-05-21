package com.DzGeeks.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 演员类
 */
@Entity
@Table(name = "Actor")
public class Actor {

	private int actorId; // 演员id
	private String name; // 演员姓名

	public Actor() {
	}

	public Actor(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "actorId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", name=" + name + "]";
	}

}
