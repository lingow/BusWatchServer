package com.lingoware.lingow.buswatch.server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Lingow
 * 
 */
@WebService
public interface BuswatchService {

	@WebMethod
	String getRoutes(String input);
}
