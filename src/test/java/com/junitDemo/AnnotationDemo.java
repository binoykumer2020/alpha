package com.junitDemo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationDemo {

    @Test
    public void print( ){
        System.out.println("I am 1st print method");
    }
    // just try with Before, before clsss, after, after class
    // Beforeclass, before, test, after. afterclass
    // ignore

}
