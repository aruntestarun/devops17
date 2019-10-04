package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

public class AppTest {
    private String INPUT = "44";
    private String INPUT1 = "1234567";
    private String INPUT2 = "115";
    private boolean isPassed = true;
    // Add more tests
    // Connected , unconfigured track true- Case 1
    
    public void testLength() throws Exception {
        // Test with new Dev build 1
        Thread.sleep(5000);
        Assert.assertEquals(INPUT,"44");
        Assert.assertEquals(INPUT2,"115");
    }
    
    
    public void testPassed() throws Exception {
        Thread.sleep(6000);
        Assert.assertEquals(isPassed,true);
    }
    
        @Ignore
    public void testFailed() {
        Assert.assertEquals(isPassed,false);
    }
}
