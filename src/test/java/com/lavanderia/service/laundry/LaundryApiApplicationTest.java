package com.lavanderia.service.laundry;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class LaundryApiApplicationTest {
	
	LaundryApiApplication laundryApiApplication;
	
	@Before
	public void initialize() {
		laundryApiApplication = new LaundryApiApplication();
	}
	
	public void getClasses() {
		assertNotNull(laundryApiApplication.getClass());
	}

}
