package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

public class DevOps17AppTest {
    private String INPUT = "44";
    private String INPUT1 = "1234567";
    private String INPUT2 = "115";
    private boolean isPassed = true;
    // Add more tests
    // Connected , unconfigured track true- Case 1
    
    @Test
    public void testDevOps17_1() throws Exception {
        // Test with new Dev build 1
        Thread.sleep(5000);
        Assert.assertEquals(INPUT,"4");
        Assert.assertEquals(INPUT2,"115");
    }
    
    @Ignore
    @Test
    public void testDevOps17_2() throws Exception {
        Thread.sleep(6000);
        Assert.assertEquals(isPassed,true);
    }
    
        @Ignore
    public void testDevOps17_3() {
        Assert.assertEquals(isPassed,false);
    }
}
