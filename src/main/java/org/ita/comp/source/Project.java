package org.ita.comp.source;
import java.util.*;

class Project {
 
 //Changed from array to List
  private List<Person> participants_ = new ArrayList<Person>();
  
  //Changed return an method type
  // V3: Remove
  //public List<Person> getParticipants() { return Collections.unmodifiableList(participants); }
  //Changed lenght for size
  public int getNumberOfParticipants() { return participants_.size(); }
  
  //modify input type from array to list
  public void setParticipants(Person[] p) { participants_=Arrays.asList(p); }
  // V3: created methods
  public void addParticipants(Person[] p) { participants_.addAll(Arrays.asList(p)); }
  public void addParticipant(Person p) { participants_.add(p); }

  public void printParticipants() {
	  for (int i=0; i < participants_.size(); i++)
	      // Changed .id for .getId(), and [i] for get(i)
		  System.out.println("project has person "+participants_.get(i).getId());
  }
  
  /// V2
  boolean participate(Person p) {
	    return this.participants_.contains(p);
    }   
    
	   
}

