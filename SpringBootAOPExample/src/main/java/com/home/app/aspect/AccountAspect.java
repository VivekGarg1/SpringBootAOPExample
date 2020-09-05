package com.home.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.home.app.model.Account;

@Aspect
@Component
public class AccountAspect {

	/*@Before("execution(* com.home.app.service.impl.AccountServiceImpl.*(..)) and args(account,..) and @annotation(auditable)")
	public void beforeAdvice(JoinPoint joinPoint,Account account,Auditable auditable) {
		System.out.println("Before method: "+joinPoint.getSignature());
		System.out.println("Audit account access: "+account.getAccountNumber()+",Audit destination: "+auditable.value());
	}
	
	@After("execution(* com.home.app.service.impl.AccountServiceImpl.*(..)) and args(account,..) and @annotation(auditable)")
	public void afterAdvice(JoinPoint joinPoint,Account account,Auditable auditable) {
		System.out.println("After method: "+joinPoint.getSignature());
		System.out.println("Audit account access: "+account.getAccountNumber()+",Audit destination: "+auditable.value());
	}*/
	
	/*@AfterReturning(value = "execution(* com.home.app.service.impl.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint,Account account) {
		System.out.println("After Return Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
		
	}
	
	@AfterThrowing(value = "execution(* com.home.app.service.impl.AccountServiceImpl.*(..))", throwing = "e")
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception e) {
		System.out.println("After Throwing Exception in Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Exception is: "+e.getMessage());
	}*/
	
	/*@Around(value = "execution(* com.home.app.service.impl.AccountServiceImpl.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		Long startTime=System.currentTimeMillis();
		Object object=null;
		try {
			object=joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("Exception is: "+e.getMessage());
		}
		System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		Long endTime=System.currentTimeMillis();
		
		System.out.println("Total Execution time taken by Method: "+joinPoint.getSignature().getName()+" is "+(endTime-startTime)+" inMillisec.");
		return object;
	}*/
	
	@Before(value = "com.home.app.aspect.PonitCutDefinition.serviceLayer()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method: "+joinPoint.getSignature());
	}
	
	@After(value = "com.home.app.aspect.PonitCutDefinition.serviceLayer()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After method: "+joinPoint.getSignature());
	}
}
