/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
/**
 *
 * @author Rung
 */
public class BankAccountCustomerFacade {
    private ArrayList<CustomerIf> customers = new ArrayList();

    public BankAccountCustomerFacade(){
        //customer 1
        ArrayList<AccountIf> cust1Accounts = new ArrayList();

            //account 1
            AccountIf account = new BankAccount(1111);
            account.deposit(500);
            cust1Accounts.add(account);

            //account 2
            account = new BankAccount(2222);
            account.deposit(1000);
            cust1Accounts.add(account);
            CustomerIf customer1 = new BankCustomer("rung", cust1Accounts);
            customers.add(customer1);

        //customer 2
        ArrayList<AccountIf> cust2Accounts = new ArrayList();

            //account 1
            account = new BankAccount(3333);
            account.deposit(400);
            cust2Accounts.add(account);

            //account 2
            account = new BankAccount(4444);
            account.deposit(800);
            cust2Accounts.add(account);
            CustomerIf customer2 = new BankCustomer("fah", cust2Accounts);
            customers.add(customer2);
    }

    public void doDeposit(double amt, CustomerIf cust, int accNo){
        cust.getAccount(accNo).deposit(amt);
    }

    public AccountIf getBankAccount(CustomerIf cust, int accNo){
        return cust.getAccount(accNo);
    }

    public CustomerIf getBankCustomer(String custName){
        for(CustomerIf cus : customers){
            if(cus.getCustomerName().equals(custName)){
               return cus;
            }
        }
        return null;
    }
    
}
