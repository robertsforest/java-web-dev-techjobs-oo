package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job fullJob1;
    Job fullJob2;

    @Before
    public void setup(){
        job1 = new Job();
        job2 = new Job();
        fullJob1 = new Job("Bathroom Cleaner", new Employer("McDonald's"), new Location("the Mall"), new PositionType("Quality Control"), new CoreCompetency("High Nausea Tolerance"));
        fullJob2 = new Job("Bathroom Cleaner", new Employer("McDonald's"), new Location("the Mall"), new PositionType("Quality Control"), new CoreCompetency("High Nausea Tolerance"));
    }

    @Test
    public void testSettingJobId(){
        assertFalse(job1.getId() == (job2.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(fullJob1.getName(), "Bathroom Cleaner");
        assertTrue(fullJob1.getEmployer() instanceof Employer);
        assertTrue(fullJob1.getLocation() instanceof Location);
        assertTrue(fullJob1.getPositionType() instanceof PositionType);
        assertTrue(fullJob1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(fullJob1.equals(fullJob2));
    }

    @Test
    public void testToStringBlankLines(){
        assertTrue(fullJob1.toString().indexOf("\n")==0);
        assertTrue(fullJob1.toString().lastIndexOf("\n")==fullJob1.toString().length()-1);
    }

    @Test
    public void testToStringFieldLabels(){
        assertTrue(fullJob1.toString().contains("\nID: " + fullJob1.getId()));
        assertTrue(fullJob1.toString().contains("\nName: " + fullJob1.getName()));
        assertTrue(fullJob1.toString().contains("\nEmployer: " + fullJob1.getEmployer()));
        assertTrue(fullJob1.toString().contains("\nLocation: " + fullJob1.getLocation()));
        assertTrue(fullJob1.toString().contains("\nPosition Type: " + fullJob1.getPositionType()));
        assertTrue(fullJob1.toString().contains("\nCore Competency: " + fullJob1.getCoreCompetency()));
    }

    @Test
    public void testToStringEmptyField(){
        System.out.println(job1.toString());
        System.out.println(fullJob1.toString());
        assertTrue(job1.toString().contains("Data not available"));
    }
}
