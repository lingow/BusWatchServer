package com.lingoware.lingow.buswatch.server.service;

/**
 * @author Lingow
 * 
 */
public class BuswatchServiceImplementation implements BuswatchService {

	@Override
	public String getRoutes(String input) {
		System.out.println("Hello invoked : " + input);
		return String.format("Hello '%s'", input);
	}

}
