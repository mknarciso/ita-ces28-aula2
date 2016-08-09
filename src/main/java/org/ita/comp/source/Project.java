package org.ita.comp.source;
import java.util.*;

class Project {
 
 //Changed from array to List
  private List<Person> participants = new ArrayList<Person>();
  
  //Changed return an method type
  public List<Person> getParticipants() { return Collections.unmodifiableList(participants); }
  //Changed lenght for size
  public int getNumberOfParticipants() { return participants.size(); }
  
  //modify input type from array to list
  public void setParticipants(Person[] p) { participants=Arrays.asList(p); }

  public void printParticipants() {
	  for (int i=0; i < participants.size(); i++)
	      // Changed .id for .getId(), and [i] for get(i)
		  System.out.println("project has person "+participants.get(i).getId());
  }
  
  /// V2
  boolean participate(Person p) {
	    return this.participants.contains(p);
    }   
    
	   
}

