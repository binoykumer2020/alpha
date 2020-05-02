package com.junitDemo;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.is;

public class AssertionDemo {
    @Test
    public void verify() {
        int i = 1+1;
        // Expected and Actual
        Assert.assertEquals(2,i);
        System.out.println("The test has run");

        /* Hamcrest */
        assertThat(i,equalTo(2));
    }

    @Test
    public void verifyArray ( ){
        int [] expected = {1,2,3,4};
        int [] actual = {1,2,3,4};
        Assert.assertArrayEquals(expected,actual);

        //hamcrest
        assertThat(actual.length,is(4));

    }
    @Test
    public void verifyBoolean ( ){
        String car = "BMW";

        Assert.assertTrue(car =="BMW");
        // Assert.assertEquals(car,"BMW");
        // Assert.assertTrue(3==1+4);
        Assert.assertFalse(12<9);

    }

}
