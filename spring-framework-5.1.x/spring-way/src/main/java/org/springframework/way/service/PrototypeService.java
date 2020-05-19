package org.springframework.way.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {

	public PrototypeService() {
		System.out.println("构造方法执行-Prototype");
	}
}
