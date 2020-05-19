package org.springframework.way.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao implements Dao{

	@Override
	public void dao() {
		System.out.println("自动装配");
	}
}
