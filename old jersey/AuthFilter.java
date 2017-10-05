//package com.sfe.service;
//
//import com.sfe.conn.AdminDb;
//import java.io.IOException;
//
//import javax.ws.rs.WebApplicationException;
//import javax.ws.rs.container.ContainerRequestContext;
//import javax.ws.rs.container.ContainerRequestFilter;
//import javax.ws.rs.core.Response.Status;
//import javax.ws.rs.ext.Provider;
//import com.sfe.service.LdapLogin;
//@Provider
//public class AuthFilter implements ContainerRequestFilter {
//
// @Override
// public void filter(ContainerRequestContext requestContext)
//   throws IOException {
//  String username = requestContext.getHeaderString("username");
//  String password = requestContext.getHeaderString("password");
//
// //LdapLogin ldapExaminer = new  LdapLogin();
// //String loggedInUser = ldapExaminer.authUser(username, password, ldapExaminer.getLdapContext());
// //boolean loggedInLDAP = userExists(loggedInUser);
// 
// boolean loggedInlocal =("admin".equals(username) && "admin".equals(password));
// 
// 
// 
//  if (!loggedInlocal) {
//   throw new WebApplicationException(Status.UNAUTHORIZED);
//  }
//
// }
//
//  
// public static boolean userExists(String winUserName) {
//        String sql = "select count(*)cnt from Employee_Details where WindowsUserName = ?";
//        String str = AdminDb.getValue(sql, 1, 1, winUserName);
//        return Integer.parseInt(str) > 0;
//    }
//}
