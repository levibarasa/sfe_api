/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfe.models;

/**
 *
 * @author Levi
 */
public class DailyList {
   String  Customer_ID,Name,Permanent_phonenumber,Customer_Type, email_ID,Occupation, Client_Contacted,Sales_Commitment, Docs_Submitted,Closed,Comments,Filled_Week;

    public DailyList() {
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPermanent_phonenumber() {
        return Permanent_phonenumber;
    }

    public void setPermanent_phonenumber(String Permanent_phonenumber) {
        this.Permanent_phonenumber = Permanent_phonenumber;
    }

    public String getCustomer_Type() {
        return Customer_Type;
    }

    public void setCustomer_Type(String Customer_Type) {
        this.Customer_Type = Customer_Type;
    }

    public String getEmail_ID() {
        return email_ID;
    }

    public void setEmail_ID(String email_ID) {
        this.email_ID = email_ID;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getClient_Contacted() {
        return Client_Contacted;
    }

    public void setClient_Contacted(String Client_Contacted) {
        this.Client_Contacted = Client_Contacted;
    }

    public String getSales_Commitment() {
        return Sales_Commitment;
    }

    public void setSales_Commitment(String Sales_Commitment) {
        this.Sales_Commitment = Sales_Commitment;
    }

    public String getDocs_Submitted() {
        return Docs_Submitted;
    }

    public void setDocs_Submitted(String Docs_Submitted) {
        this.Docs_Submitted = Docs_Submitted;
    }

    public String getClosed() {
        return Closed;
    }

    public void setClosed(String Closed) {
        this.Closed = Closed;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getFilled_Week() {
        return Filled_Week;
    }

    public void setFilled_Week(String Filled_Week) {
        this.Filled_Week = Filled_Week;
    }
   
}
