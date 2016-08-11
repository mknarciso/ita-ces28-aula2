package org.ita.comp.source;

import static org.junit.Assert.*;
import org.junit.*;

//import junit.framework.*;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;



public class PersonTest {
    Person[] ps = new Person[3];
    Project pj = new Project();
    
    @Before
    public void initialize(){
    	for (int i=0; i < ps.length; i++)
    		ps[i] = new Person();
    	pj.setParticipants(ps);
    	pj.printParticipants();
    }
    
    @Test
    public void newPersonDoesNotBelongToAProject(){
        Person x = new Person();
        assertFalse(pj.participate(x));
    }
    
    @Test
    public void includedPersonBelongsToAProject(){
        Person p = ps[1];
        //assertFalse(pj.participate(p));
        assertTrue(pj.participate(p));
    }
    
}
