package com.businessapp.model;

import com.businessapp.logic.IDGenerator;


/**
 * Article is an Entity-class that represents an item for rent or for sale.
 * 
 * @author Sven Graupner
 * 
 */
public class Article implements EntityIntf {
	private static final long serialVersionUID = 1L;

	/*
	 * Properties.
	 */
	private final String id;	// Unique, non-null Article id.

	private String name;		// Article name.

	private String price;		// Article price.

	/**
	 * Private default constructor (required by JSON deserialization).
	 */
	@SuppressWarnings("unused")
	private Article() { this( null, null, null ); }

	/**
	 * Public constructor.
	 * @param name Article name.
	 */
	public Article( String name, String price ) {
		this( null, name, price );
	}

	/**
	 * Public constructor.
	 * @param id Article id. If null, a new id is generated.
	 * @param name Article name.
	 */
	private static final IDGenerator IDG = new IDGenerator( null, IDGenerator.IDTYPE.NUM, 8 );
	//
	public Article( String id, String name, String price ) {
		this.id = id==null? IDG.nextId() : id;
		this.name = name;
		setPrice( price );
	}


	/*
	 * Public getter/setter methods.
	 */

	/**
	 * Return Article id.
	 * @return Article id.
	 */
	public String getId() {		// No setId(). Id's cannot be altered.
		return id;
	}

	/**
	 * Return Article name.
	 * @return Article name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set Article name.
	 * @param name Article name.
	 */
	public void setName( String name ) {
		this.name = name;
	}

	/**
	 * Return Article price.
	 * @return Article price.
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Set Article price.
	 * @param name Article price.
	 */
	public void setPrice( String price ) {
		this.price = price;
	}

}
