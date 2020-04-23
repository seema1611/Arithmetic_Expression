package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic arithmatic=new Arithmetic();

    @Test
    public void givenTwoInput_WhenAdd_ShouldReturnSum() {
        Assert.assertEquals(5,arithmatic.computeAddition(2,3));
    }
}
