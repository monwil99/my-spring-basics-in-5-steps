package com.in28minutes.spring.basics.componentsscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
/*
By default, PersonDao will still be happy with one instance of JDBC Connection even if it is declared prototype scope.
Need to configure a proxy to ensure always will return a new instance of the dependency*/
	
}
