/**
 * Project Untitled
 */


#ifndef _CUSTOMER_H
#define _CUSTOMER_H

#include "EntityIntf.h"


class Customer: public EntityIntf {
public: 
    
/**
 * @param name
 */
void Customer(String name);
    
/**
 * @param id
 * @param name
 */
void Customer(String id, String name);
    
id getId();
    
name getName();
    
/**
 * @param name
 */
void setName(String name);
    
contacts getContact();
    
notes getNotes();
    
status getStatus();
    
/**
 * @param CustomerStatus
 */
void setStatus(status CustomerStatus);
private: 
    String Id;
    String name;
    String price;
    List<String> contact;
    List<String> notes;
    CustomerStatus status;
};

#endif //_CUSTOMER_H