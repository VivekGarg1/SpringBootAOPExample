package com.home.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PonitCutDefinition {

	@Pointcut("within(com.home.app.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.home.app.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.home.app.dao..*)")
	public void dataAccessLayer() {

	}
}
