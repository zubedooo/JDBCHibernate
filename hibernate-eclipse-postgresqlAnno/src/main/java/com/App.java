package com;

import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int customerId=10001;
        //Customer customer = new Customer(10006, "Sanjana", "Bangalore", 50000);
        CustomerDAOImpl impl = new CustomerDAOImpl();
        //impl.addCustomer(customer);
        System.out.println(impl.listCustomers());
    	System.out.println(impl.isCustomerExists(customerId));
        System.out.println("End");
    }
}