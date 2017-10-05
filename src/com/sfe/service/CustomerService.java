/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfe.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import com.sfe.dao.customer.Customer;
import com.sfe.models.CompleteList;
import com.sfe.bll.CustomerBLL;
import com.sfe.models.DailyList;
import com.sfe.models.Reminder; 
import javax.ws.rs.WebApplicationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.ws.rs.container.ContainerRequestContext;
/**
 *
 * @author Levi
 */
@Path("/customer")
public class CustomerService {
 private static final Log log = LogFactory.getLog("origlogger");
public static final String AUTHENTICATION_HEADER = "Authorization"; 
 ContainerRequestContext containerRequest;
 String authCredentials = containerRequest.getHeaderString(AUTHENTICATION_HEADER);
   // response.setHeader("yourheadername", "yourheadervalue");
    @GET
    @Path("/completelist/{rmCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompletelist(@Context HttpServletRequest request, @PathParam("rmCode") String rmCode) {
        ArrayList<CompleteList> custs = CustomerBLL.getCompleteList(rmCode);
        
          return Response.status(200).entity(custs).header("Access-Control-Allow-Origin", "*").build();
    }
    
    
    @GET
    @Path("/login/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@Context HttpServletRequest request) {
        AuthenticationService authenticationService = new AuthenticationService();
                int STATUS_CODE =200;
		boolean authenticationStatus = authenticationService .authenticate(authCredentials);
                if (!authenticationStatus) { 
                     STATUS_CODE =401;
                     }
          return Response.status(STATUS_CODE).entity("").header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/dailylist/{rmCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDailylist(@Context HttpServletRequest request, @PathParam("rmCode") String rmCode) {
         ArrayList<DailyList> dailyList = CustomerBLL.getDailyList(rmCode);
        return Response.status(200).entity(dailyList).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/reminders/{rmCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReminderlist(@Context HttpServletRequest request, @PathParam("rmCode") String rmCode) {
         ArrayList<Reminder> reminders = CustomerBLL.getReminders(rmCode);
        return Response.status(200).entity(reminders).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/customerinfo/{custID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerInfolist(@Context HttpServletRequest request, @PathParam("custID") String custID) {
        ArrayList ar = Customer.getCustomerInfo(custID);
        return Response.status(200).entity(ar).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/currentproducts/{custID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerCurrentProductlist(@Context HttpServletRequest request, @PathParam("custID") String custID) {
        ArrayList ar = Customer.getCurrentProducts(custID);
        return Response.status(200).entity(ar).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/bestproducts/{custID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerBestProductlist(@Context HttpServletRequest request, @PathParam("custID") String custID) {
        ArrayList ar = Customer.getOtherCustProducts(custID);
        return Response.status(200).entity(ar).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/otherproducts/{custID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerOtherProductlist(@Context HttpServletRequest request, @PathParam("custID") String custID) {
        ArrayList ar = Customer.getOtherCustProducts(custID);;
        return Response.status(200).entity(ar).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/productholding/{custID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerProductHoldings(@Context HttpServletRequest request, @PathParam("custID") String custID) {
        ArrayList ar = Customer.getOtherCustProducts(custID);
        int holding = ar.size();
        return Response.status(200).entity(holding).header("Access-Control-Allow-Origin", "*").build();
    }

    @POST
    @Path("/generatedailylist/{rmCode}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json")
    public Response createGenerateDailyList(@Context HttpServletRequest request, @PathParam("rmCode") String rmCode) {
         ArrayList<DailyList> generate = CustomerBLL.generateDailyList(rmCode);
        return Response.status(200).entity(generate).header("Access-Control-Allow-Origin", "*").build();
    }

}
