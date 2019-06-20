/**
 * Project Untitled
 */


#ifndef _ARTICLE_H
#define _ARTICLE_H

#include "EntityIntf.h"


class Article: public EntityIntf {
public: 
    
/**
 * @param price
 * @param name
 */
void Article(String price, String name);
    
/**
 * @param id
 * @param name
 * @param Price
 */
void Article(String id, String name, String Price);
    
id getId();
    
name getName();
    
/**
 * @param name
 */
void setName(String name);
    
price getPrice();
    
/**
 * @param price
 */
void setPrice(String price);
private: 
    String price;
    String id;
    String name;
};

#endif //_ARTICLE_H