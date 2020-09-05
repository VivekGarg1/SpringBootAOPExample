package com.home.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.home.app.model.Account;
import com.home.app.service.AccountService;
import com.home.app.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootAopExampleApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAopExampleApplication.class, args);
		AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);
		 accountService.updateAccountBalance(new Account("987654321","Money transfer"),300L);

		// After-return advice
		//Account account = accountService.getAccountBycustomerId("CU3456789");
		// After-throw advice
		/*Account account = accountService.getAccountBycustomerId(null);
		if (account != null)
			System.out.println(account.getAccountNumber() + "\t" + account.getAccountDescription());*/
	}

}
