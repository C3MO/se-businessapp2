package com.businessapp.model;

import java.util.ArrayList;
import java.util.List;

import com.businessapp.logic.IDGenerator;


/**
 * Customer is an Entity-class of someone with whom a business relationship
 * is maintained.
 * 
 * @author Sven Graupner
 * 
 */

public class Customer implements EntityIntf {
	private static final long serialVersionUID = 1L;

	/*
	 * Properties.
	 */
	private final String id;	// Unique, non-null Customer id.

	private String name;		// Customer name.

	// List of contacts such as Customer email, phone, etc.
	private final List<String> contacts = new ArrayList<String>();

	// List of (String) notes attached to a Customer.
	private final List<Note> notes = new ArrayList<Note>();

	// Customer status.
	public enum CustomerStatus { ACTIVE, SUSPENDED, TERMINATED };
	//
	private CustomerStatus status;


	/**
	 * Private default constructor (required by JSON deserialization).
	 */
	@SuppressWarnings("unused")
	private Customer() { this( null ); }

	/**
	 * Public constructor.
	 * @param name Customer name.
	 */
	public Customer( String name ) {
		this( null, name );
	}

	/**
	 * Public constructor.
	 * @param id Customer id. If null, a new id is generated.
	 * @param name Customer name.
	 */
	private static final IDGenerator IDG = new IDGenerator( "C.", IDGenerator.IDTYPE.AIRLINE, 6 );
	//
	public Customer( String id, String name ) {
		this.id = id==null? IDG.nextId() : id;
		this.name = name;
		this.notes.add( new Note( "Customer record created." ) );
		this.status = CustomerStatus.ACTIVE;
	}


	/*
	 * Public getter/setter methods.
	 */

	/**
	 * Return Customer id.
	 * @return Customer id.
	 */
	public String getId() {		// No setId(). Id's cannot be altered.
		return id;
	}

	/**
	 * Return Customer name.
	 * @return Customer name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set Customer name.
	 * @param name Customer name.
	 */
	public void setName( String name ) {
		this.name = name;
	}

	/**
	 * Return list of Customer contacts.
	 * @return list of Customer contacts.
	 */
	public List<String> getContacts() {
		return contacts;
	}

	/**
	 * Return list of notes stored for a Customer.
	 * @return list of notes.
	 */
	public List<Note> getNotes() {
		return notes;
	}

	/**
	 * Return Customer status.
	 * @return Customer status.
	 */
	public CustomerStatus getStatus() {
		return status;
	}

	/**
	 * Set Customer status.
	 * @param status Customer status.
	 */
	public void setStatus( CustomerStatus status ) {
		this.status = status;
	}

}
