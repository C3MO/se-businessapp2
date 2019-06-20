package com.businessapp.modelgen.Model;

import java.util.*;

import com.businessapp.modelgen.Model.*;
import com.businessapp.model.Customer.CustomerStatus;

/**
 * 
 */
public class Customer implements EntityIntf {
    //error: add EntityIntf methodes
    /**
     * Default constructor
     */
	public Customer() {
	}
	/**
     * 
     */
    private String Id;

    /**
     * 
     */
    private String name;
    
    /**
     * 
     */
    private String nachname;
    /**
     * 
     */
    private String price;

    /**
     * 
     */
    private List<String> contact;

    /**
     * 
     */
    private List<String> notes;

    /**
     * 
     */
    private CustomerStatus status;

    /**
     * @param name
     */
    public void Customer(String name) {
        // TODO implement here
    }

    /**
     * @param id 
     * @param name
     */
    public void Customer(String id, String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     */
    private void setName(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<String> getContact() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getNotes() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getStatus() {
        // TODO implement here
        return null;
    }

    /**
     * @param
     */
    public void setStatus(CustomerStatus status ) {
        // TODO implement here
    }

}