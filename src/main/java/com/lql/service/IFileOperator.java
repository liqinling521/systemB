package com.lql.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@SuppressWarnings("restriction")
@WebService
public interface IFileOperator {
	@WebMethod
	public String recieveFile(@WebParam(name = "file") String file);
}
