package com.DzGeeks.repository.dao.impl;

import org.hibernate.Session;

import com.DzGeeks.repository.entity.*;
import com.DzGeeks.util.DBSessionUtil;


public class TestDao {

	//添加验证码
	public boolean test(Film a) {
		Session session = DBSessionUtil.getSession();
		session.save(a);
		DBSessionUtil.closeSession(session);
		return true;
	}
	
	public static void main(String[] args) {
		TestDao t = new TestDao();
//		Actor a = new Actor("Gordan");
//		Address a = new Address("Jieyang", "Dongshan");
		Film a = new Film("a", 4.7, 1, 1233, "Gordan", "good");
		System.out.println(t.test(a));
	}
	
}

