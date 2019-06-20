/**
 * Project Untitled
 */


#ifndef _ENTITYINTF_H
#define _ENTITYINTF_H

#include "Article.h"
#include "Serializable.h"


class EntityIntf: public Article, public Serializable {
public: 
    
void getId();
};

#endif //_ENTITYINTF_H