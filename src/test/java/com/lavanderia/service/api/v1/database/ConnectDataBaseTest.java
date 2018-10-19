package com.lavanderia.service.api.v1.database;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ConnectDataBaseTest {
	
	ConnectDataBase connectDataBase;
	
	@Before
	public void initialize() {
		
	}
	
	@Test
	public void instanceClient() {
		connectDataBase = new ConnectDataBase();
		assertNotNull(connectDataBase.getCliente());
	}

}
