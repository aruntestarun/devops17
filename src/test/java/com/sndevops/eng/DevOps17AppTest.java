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
        Assert.assertEquals(INPUT,"44");
    }
    
    
    @Test
    public void testDevOps17_2() throws Exception {
        // Test with new Dev build 1
        Thread.sleep(5000);
        Assert.assertEquals(INPUT,"44");
    }
    
    
    @Test
    public void testDevOps17_3() throws Exception {
        // Test with new Dev build 1
        Thread.sleep(5000);
        Assert.assertEquals(INPUT,"44");
    }
    
    @Test
    public void testDevOps17_4() throws Exception {
        Thread.sleep(3000);
        Assert.assertEquals(INPUT,"1");
    }
    
    @Test
    public void testDevOps17_5() {
        Assert.assertEquals(INPUT,"44");
    }
    @Test
    public void testDevOps17_6() {
        Assert.assertEquals(INPUT,"1");
    }
    
    @Ignore
    @Test
    public void testDevOps17_7() {
        Assert.assertEquals(INPUT,"1");
    }
}
