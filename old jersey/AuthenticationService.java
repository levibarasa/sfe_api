/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfe.service;

/**
 *
 * @author Levi
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.StringTokenizer;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AuthenticationService {
    private static final Log log = LogFactory.getLog("origlogger");
    private String user = "admin";
    private String pass = "admin";
    private String realm = "Protected";
    boolean auth = false;
    
    public boolean authenticate(String authCredentials) {

		if (null == authCredentials)
			return false;
		// header value format will be "Basic encodedstring" for Basic
		// authentication. Example "Basic YWRtaW46YWRtaW4="
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
				+ " ", "");
		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(
					encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		final StringTokenizer tokenizer = new StringTokenizer(
				usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();

		// we have fixed the userid and password as admin
		// call some UserService/LDAP here
                // usernameAndPassword = Username:pass
                
                
                
		boolean authenticationStatus = user.equals(username)
				&& pass.equals(password);
		return authenticationStatus;
	}
//    @Override
//  public void init(FilterConfig filterConfig) throws ServletException {
//    user = filterConfig.getInitParameter("username");
//    pass = filterConfig.getInitParameter("password"); 
//    String paramRealm = filterConfig.getInitParameter("realm");
//    if (StringUtils.isNotBlank(paramRealm)) {
//      realm = paramRealm;
//    }
//  }
	

   
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//     HttpServletRequest request = (HttpServletRequest) servletRequest;
//    HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//    String authHeader = request.getHeader("Authorization");
//    if (authHeader != null) {
//      StringTokenizer st = new StringTokenizer(authHeader);
//      if (st.hasMoreTokens()) {
//        String basic = st.nextToken();
//        if (basic.equalsIgnoreCase("Basic")) {
//          try {
//            String credentials = new String(org.apache.commons.codec.binary.Base64.decodeBase64(st.nextToken()), "UTF-8");
//            int p = credentials.indexOf(":");
//            if (p != -1) {
//              String _username =  credentials.substring(0, p).trim();
//              String _password =  credentials.substring(p + 1).trim();
//
//              if (!user.equals(_username) || !pass.equals(_password)) {
//                unauthorized(response, "Bad credentials");
//              }
//
//              filterChain.doFilter(servletRequest, servletResponse);  
//              
//            } else {
//              unauthorized(response, "Invalid authentication token");
//            }
//          } catch (UnsupportedEncodingException e) {
//            throw new Error("Couldn't retrieve authentication", e);
//          }
//        }
//      }
//    } else {
//      unauthorized(response);
//    }   
//    }
//
//      @Override
//  public void destroy() {
//  }
//
//  private void unauthorized(HttpServletResponse response, String message) throws IOException {
//    response.setHeader("WWW-Authenticate", "Basic realm=\"" + realm + "\"");
//    response.sendError(401, message);
//  }
//
//  private void unauthorized(HttpServletResponse response) throws IOException {
//    unauthorized(response, "Unauthorized");
//  }
}