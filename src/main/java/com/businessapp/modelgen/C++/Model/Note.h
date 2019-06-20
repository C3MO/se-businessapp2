/**
 * Project Untitled
 */


#ifndef _NOTE_H
#define _NOTE_H

#include "Serializable.h"


class Note: public Serializable {
public: 
    
void Note();
    
/**
 * @param noteStr
 */
void Note(String noteStr);
    
void getSimpleTimestamp();
    
noteText getNoteText();
    
/**
 * @param noteText
 */
void setNoteText(String noteText);
    
String externalize();
private: 
    Date timeStamp;
    String noteText;
};

#endif //_NOTE_H