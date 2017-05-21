package com.DzGeeks.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 电影类
 */
@Entity
@Table(name = "Film")
public class Film {

	private int filmId; // 电影id
	private String name; // 电影名
	private double score; // 评分
	private int duration; // 维度2D/3D
	private int year; // 上映年度
	private String director; // 导演名字
	private String description; // 电影描述

	public Film() {
	}

	public Film(String name, double score, int duration, int year, String director, String description) {
		this.name = name;
		this.score = score;
		this.duration = duration;
		this.year = year;
		this.director = director;
		this.description = description;
	}

	@Id
	@Column(name = "filmId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="score", nullable = false)
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Column(name="duration", nullable = false)
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name="year", nullable = false)
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Column(name = "director", nullable = false, length = 45)
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Column(name = "description", nullable = false, length = 200)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", name=" + name + ", score=" + score + ", duration=" + duration + ", year="
				+ year + ", director=" + director + ", description=" + description + "]";
	}

}
