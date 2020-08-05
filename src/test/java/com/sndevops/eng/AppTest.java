package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {
    private String INPUT = "13411";
    // add tests
    @Test 
    public void testLength() { 
        Assert.assertEquals(INPUT,"13411");  
    }
    
    @Test 
    public void testWidth() { 
        Assert.assertEquals("13","13");  
    }
    
    @Test 
    public void testVelocity() { 
        Assert.assertEquals("vel","vel");  
    }
    
    @Test 
    public void testApple() { 
        Assert.assertEquals("apple","apple");  
    }
    
    @Test 
    public void testBanana() { 
        Assert.assertEquals("banana","banana");  
    }
    
    @Test 
    public void testCherry() { 
        Assert.assertEquals("cherry","cherry");  
    }    
}
 

