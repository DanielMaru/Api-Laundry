package com.lavanderia.service.laundry;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.lavanderia.service.api.v1.controller.ApiController;

@ApplicationPath("rest")
public class LaundryApiApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(ApiController.class);
		return classes;
	}

}
