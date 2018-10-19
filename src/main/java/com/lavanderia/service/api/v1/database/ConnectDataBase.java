package com.lavanderia.service.api.v1.database;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class ConnectDataBase {
	
	AmazonDynamoDB cliente;

	public ConnectDataBase() {
		cliente = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
				new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
				.build(); 
	}

	public AmazonDynamoDB getCliente() {
		return cliente;
	}
	
	
	
	
	
	

}
