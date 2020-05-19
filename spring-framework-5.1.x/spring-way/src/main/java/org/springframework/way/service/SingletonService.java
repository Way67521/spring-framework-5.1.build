package org.springframework.way.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.way.dao.Dao;

@Service
public class SingletonService {

	@Autowired
	private Dao indexDao;


	public SingletonService() {
		System.out.println("test");
	}

	public void test(){
		indexDao.dao();
	}


	public static PrototypeService factoryMethod(){
		return new PrototypeService();
	}

}
