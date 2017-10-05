/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfe.bll;

import com.sfe.dao.customer.Customer;
import com.sfe.models.CompleteList;
import com.sfe.models.Reminder;
import com.sfe.models.DailyList;
import java.util.ArrayList; 

/**
 *
 * @author Levi
 */
public class CustomerBLL {

     static String Customer_ID, Name, Permanent_phonenumber, Age, Marital_Status, City, Customer_Type, Permanent_Address, Occupation,
             Years_with_Bank, email_ID,
             Client_Contacted,Sales_Commitment, Docs_Submitted,Closed,Comments,Filled_Week,
            Agency_Banking,Business_Transaction, Call_Deposit, Collection_Scheme, Fcy_Transaction, Flexi_Deposit, Housing_Loan, Hp_Loan,
            Ims, Insurance_Premium, Locker_Security, Ngo, Online_Savers, Overdraft, Personal_Transaction, Term_Deposit,
            Term_Loan, Trade_Finance, Young_Savers, Bank_Assurance, Credit_Cards, Prepaid_Cards, Internet_Banking;
   static int totalProducts;
    
    public CustomerBLL() {
    }
    
     public static ArrayList<DailyList> generateDailyList(String rmCode){
         ArrayList<DailyList> dailylist = new ArrayList<DailyList>();
     ArrayList list = Customer.fetchDailyList(rmCode);
        Customer.createDailyList(list, rmCode);
        Customer.populateDailyList(rmCode);
        ArrayList ar = Customer.getDailyList(rmCode);
        for (int i = 0; i < ar.size(); i++) { 
            ArrayList one = (ArrayList) ar.get(i);
            DailyList dl = new DailyList();
            Customer_ID = (String) one.get(0);
            dl.setCustomer_ID(Customer_ID);
            Name = (String) one.get(1);
            dl.setName(Name);
            Permanent_phonenumber = (String) one.get(2);
            dl.setPermanent_phonenumber(Permanent_phonenumber);
            Customer_Type = (String) one.get(3);
            dl.setCustomer_Type(Customer_Type);
             email_ID = (String) one.get(4);
            dl.setEmail_ID(email_ID);
            Occupation = (String) one.get(5);
            dl.setOccupation(Occupation);
            Client_Contacted = (String) one.get(6);
            dl.setClient_Contacted(Client_Contacted);
            Sales_Commitment = (String) one.get(7);
            dl.setSales_Commitment(Sales_Commitment);
            Docs_Submitted = (String) one.get(8);
            dl.setDocs_Submitted(Docs_Submitted);
            Closed = (String) one.get(9);
            dl.setClosed(Closed);
            Comments = (String) one.get(10);
            dl.setComments(Comments);
            Filled_Week = (String) one.get(11);
            dl.setFilled_Week(Filled_Week);
            
        dailylist.add(dl);
        }
    return dailylist;
     }
    
     public static ArrayList<DailyList> getDailyList(String rmCode){
     ArrayList<DailyList> dailylist = new ArrayList<DailyList>();
     ArrayList ar = Customer.getReminders(rmCode);  
        for (int i = 0; i < ar.size(); i++) { 
            ArrayList one = (ArrayList) ar.get(i);
            DailyList dl = new DailyList();
            Customer_ID = (String) one.get(0);
            dl.setCustomer_ID(Customer_ID);
            Name = (String) one.get(1);
            dl.setName(Name);
            Permanent_phonenumber = (String) one.get(2);
            dl.setPermanent_phonenumber(Permanent_phonenumber);
            Customer_Type = (String) one.get(3);
            dl.setCustomer_Type(Customer_Type);
             email_ID = (String) one.get(4);
            dl.setEmail_ID(email_ID);
            Occupation = (String) one.get(5);
            dl.setOccupation(Occupation);
            Client_Contacted = (String) one.get(6);
            dl.setClient_Contacted(Client_Contacted);
            Sales_Commitment = (String) one.get(7);
            dl.setSales_Commitment(Sales_Commitment);
            Docs_Submitted = (String) one.get(8);
            dl.setDocs_Submitted(Docs_Submitted);
            Closed = (String) one.get(9);
            dl.setClosed(Closed);
            Comments = (String) one.get(10);
            dl.setComments(Comments);
            Filled_Week = (String) one.get(11);
            dl.setFilled_Week(Filled_Week);
            
        dailylist.add(dl);
        }
    return dailylist;
    }
    
    public static ArrayList<Reminder> getReminders(String rmCode){
     ArrayList<Reminder> reminder = new ArrayList<Reminder>();
     ArrayList ar = Customer.getReminders(rmCode);  
        for (int i = 0; i < ar.size(); i++) { 
            ArrayList one = (ArrayList) ar.get(i);
            Reminder rem = new Reminder();
           Customer_ID = (String) one.get(0);
            rem.setCustomer_ID(Customer_ID);
            Name = (String) one.get(1);
            rem.setName(Name);
            Permanent_phonenumber = (String) one.get(2);
            rem.setPermanent_phonenumber(Permanent_phonenumber);
             
            Customer_Type = (String) one.get(3);
            rem.setCustomer_Type(Customer_Type);
            
            email_ID = (String) one.get(4);
            rem.setEmail_ID(email_ID);
            
            Occupation = (String) one.get(5);
            rem.setOccupation(Occupation);
            reminder.add(rem);
        }
    return reminder;
    }
    
     public static ArrayList<CompleteList> getCompleteList(String rmCode){
     ArrayList<CompleteList> custs = new ArrayList<CompleteList>();
     ArrayList ar = Customer.getCompleteList(rmCode);
        
        for (int i = 0; i < ar.size(); i++) { 
            ArrayList one = (ArrayList) ar.get(i);
            CompleteList cust = new CompleteList();
            Customer_ID = (String) one.get(0);
            cust.setCustomer_ID(Customer_ID);
            Name = (String) one.get(1);
            cust.setName(Name);
            Permanent_phonenumber = (String) one.get(2);
            cust.setPermanent_phonenumber(Permanent_phonenumber);
            Age = (String) one.get(3);
            cust.setAge(Age);
            Marital_Status = (String) one.get(4);
            cust.setMarital_Status(Marital_Status);
            
            City = (String) one.get(5);
            cust.setCity(City);
            
            Customer_Type = (String) one.get(6);
            cust.setCustomer_Type(Customer_Type);
            
            Permanent_Address = (String) one.get(7);
            cust.setPermanent_Address(Permanent_Address);
            
            Occupation = (String) one.get(8);
            cust.setOccupation(Occupation);
            
            Years_with_Bank = (String) one.get(9);
            cust.setYears_with_Bank(Years_with_Bank);
            
            email_ID = (String) one.get(10); 
            cust.setEmail_ID(email_ID);
            
            totalProducts = Customer.getCurrentProducts(Customer_ID).size();
            cust.setTotalProducts(totalProducts);
            
            Agency_Banking = (String) one.get(11);
            cust.setAgency_Banking(Agency_Banking);
            
            Business_Transaction = (String) one.get(12);
            cust.setBusiness_Transaction(Business_Transaction);
            
            Call_Deposit = (String) one.get(13);
            cust.setCall_Deposit(Call_Deposit);
            
            Collection_Scheme = (String) one.get(14);
            cust.setCollection_Scheme(Collection_Scheme);
            
            Fcy_Transaction = (String) one.get(15);
            cust.setFcy_Transaction(Fcy_Transaction);
            
            Flexi_Deposit = (String) one.get(16);
            cust.setFlexi_Deposit(Flexi_Deposit);
            
            Housing_Loan = (String) one.get(17);
            cust.setHousing_Loan(Housing_Loan);
            
            Hp_Loan = (String) one.get(18);
            cust.setHp_Loan(Hp_Loan);
            
            Ims = (String) one.get(19);
            cust.setIms(Ims);
            
            Insurance_Premium = (String) one.get(20);
            cust.setInsurance_Premium(Insurance_Premium);
            
            Locker_Security = (String) one.get(21);
            cust.setLocker_Security(Locker_Security);
             
            Ngo = (String) one.get(22);
            cust.setNgo(Ngo);
            
            Online_Savers = (String) one.get(23);
            cust.setOnline_Savers(Online_Savers);
            
            Overdraft = (String) one.get(24);
            cust.setOverdraft(Overdraft);
            
            Personal_Transaction = (String) one.get(25);
            cust.setPersonal_Transaction(Personal_Transaction);
            
            Term_Deposit = (String) one.get(26);
            cust.setTerm_Deposit(Term_Deposit);
            
            Term_Loan = (String) one.get(27);
            cust.setTerm_Loan(Term_Loan);
            
            Trade_Finance = (String) one.get(28);
            cust.setTrade_Finance(Trade_Finance);
            
            Young_Savers = (String) one.get(29);
            cust.setYoung_Savers(Young_Savers);
            
            Bank_Assurance = (String) one.get(30);
            cust.setBank_Assurance(Bank_Assurance);
            
            Credit_Cards = (String) one.get(31);
            cust.setCredit_Cards(Credit_Cards);
            
            Prepaid_Cards = (String) one.get(32);
            cust.setPrepaid_Cards(Prepaid_Cards);
            Internet_Banking = (String) one.get(33);
            cust.setInternet_Banking(Internet_Banking);
            custs.add(cust);
        }
     return custs;
     }
}
