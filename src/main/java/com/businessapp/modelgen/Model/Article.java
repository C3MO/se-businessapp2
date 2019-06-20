package com.businessapp.modelgen.Model;

import java.util.*;

/**
 * 
 */
public class Article implements EntityIntf { //error: extends -> implements

    /**
     * Default constructor
     */
    public Article() {
    }

    /**
     * 
     */
    private String price;

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * @param price 
     * @param name
     */
    public void Article(String price, String name) {        //error: void price String
        // TODO implement here
    }

    /**
     * @param id 
     * @param name 
     * @param Price
     */
    public void Article(String id, String name, String Price) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return id;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        // TODO implement here
    }

}