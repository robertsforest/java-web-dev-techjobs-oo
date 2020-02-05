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
}
