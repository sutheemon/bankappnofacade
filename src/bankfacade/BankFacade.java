/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccountCustomerFacade object = new BankAccountCustomerFacade();
        AccountIf account = null;
            
        //// report customer 1
        CustomerIf customer1 = object.getBankCustomer("rung");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer1.getCustomerName());
        System.out.println("Has " + customer1.getNumAccounts() + " accounts");
            
            account = object.getBankAccount(customer1, 1111);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            account = object.getBankAccount(customer1, 2222);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            object.doDeposit(1000,customer1,2222);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            ArrayList<AccountIf> accounts1 = object.getBankCustomer("rung").getllAccounts();
            for(AccountIf accounted : accounts1) {
                System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
            }
        
        System.out.println("--------------------------------------------------------------------");
        
        //// report customer 2
        CustomerIf customer2 = object.getBankCustomer("fah");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer2.getCustomerName());
        System.out.println("Has " + customer2.getNumAccounts() + " accounts");
        
            account = object.getBankAccount(customer2, 3333);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            account = object.getBankAccount(customer2, 4444);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            object.doDeposit(1000, customer2, 4444);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            ArrayList<AccountIf> accounts2 = object.getBankCustomer("fah").getllAccounts();
            for(AccountIf accounted : accounts2) {
                System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
            }
    }
    
}
