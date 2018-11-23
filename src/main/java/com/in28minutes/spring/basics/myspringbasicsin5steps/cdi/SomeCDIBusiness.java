package com.in28minutes.spring.basics.myspringbasicsin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDao someCDIDao;

	public SomeCDIDao getSomeCDIDao() {
		return someCDIDao;
	}

	public void setSomeCDIDao(SomeCDIDao someCDIDao) {
		this.someCDIDao = someCDIDao;
	}
	
	
}
