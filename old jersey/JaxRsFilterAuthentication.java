///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sfe.service;
//
///**
// *
// * @author Levi
// */
//
//import javax.ws.rs.WebApplicationException;
//import javax.ws.rs.container.ContainerRequestContext;
//import javax.ws.rs.container.ContainerRequestFilter;
//import javax.ws.rs.core.Response.Status;
//import javax.ws.rs.ext.Provider;
//
//@Provider
//public class JaxRsFilterAuthentication implements ContainerRequestFilter {
//	public static final String AUTHENTICATION_HEADER = "Authorization";
//
//	@Override
//	public void filter(ContainerRequestContext containerRequest)
//			throws WebApplicationException {
//             
//		String authCredentials = containerRequest.getHeaderString(AUTHENTICATION_HEADER);
//
//		// better injected
//		AuthenticationService authenticationService = new AuthenticationService();
//
//		boolean authenticationStatus = authenticationService
//				.authenticate(authCredentials);
//
//		if (!authenticationStatus) {
//			throw new WebApplicationException(Status.UNAUTHORIZED); 
//                       }
//                
//            
//	}
//}
