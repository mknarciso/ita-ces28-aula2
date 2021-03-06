package org.ita.comp.source;
//import java.util.*;

public class Person {
	static int nextId_=0;
	//Changed Id from public to private, and moved it to the top 
	private int id_;
	
	Person(){
		id_ = nextId_++;
	}
	
	/*boolean participate(Project p) {
		List<Person> x = p.getParticipants();
		for(int i=0; i<p.getNumberOfParticipants(); i++) {
		     if (x.get(i).id == this.getId()) return (true);
	     }
	    return (false);
	}*/
	   
	public int getId() {
	  return id_;
	}
	
	
		
	public static void main(String[] args) {
		Person[] ps = new Person[3];
		for (int i=0; i < ps.length; i++)
			ps[i] = new Person();
		
		Project pj = new Project();
		pj.setParticipants(ps);
		pj.printParticipants();
		
		Person x = new Person();
		//if (x.participate(pj)) {
		if (pj.participate(x)) {
			System.out.println("Person "+x.getId()+" belongs to project");
		} else {
			System.out.println("Person "+x.getId()+" does not belong to project");
		}
		Person p = ps[1];
		//if (p.participate(pj)) {
		if (pj.participate(p)) {
			System.out.println("Person "+p.getId()+" belongs to project");
		} else {
			System.out.println("Person "+p.getId()+" does not belong to project");
		}
		

	}

}
