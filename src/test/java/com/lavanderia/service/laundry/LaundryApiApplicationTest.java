package com.lavanderia.service.laundry;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class LaundryApiApplicationTest {
	
	LaundryApiApplication laundryApiApplication;
	
	@Before
	public void initialize() {
		laundryApiApplication = new LaundryApiApplication();
	}
	
	@Test
	public void getClasses() {
		assertNotNull(laundryApiApplication.getClass());
	}

}
