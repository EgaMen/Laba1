package com.company;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;


class ComplexTest {
    @Test
    void Sum_SumNumbers_AlwaysTrue() {
        Complex a=new Complex(5, -6);
        Complex b= new Complex(-3,2);
        Complex result= new Complex(2,-4);
        assertEquals(a.sum(b),result);
    }

    @Test
    void Difference_DifferenceOfNumbers_AlwaysTrue() {
        Complex a=new Complex(5, -6);
        Complex b= new Complex(-3,2);
        Complex result= new Complex(8,-8);
        assertEquals(a.difference(b),result);
    }

    @Test
    void Module_ByDefault_AlwaysTrue(){
        Complex a=new Complex(4,-3);
        assertEquals(a.module(),5);
    }

    @Test
    void Argument_ByDefault_AlwaysTrue()
    {
        Complex a=new Complex(3,-4);
        assertEquals((new BigDecimal(a.argument()).setScale(4, BigDecimal.ROUND_DOWN).doubleValue()),-0.9272);
    }

}