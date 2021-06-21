/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

package Exercise29;

 import ex29yearsToDoubleInvestment.YearsToDoubleInvestment;
 import org.junit.Rule;
 import org.junit.Test;
 import org.junit.rules.ExpectedException;

 import static org.junit.Assert.*;

 public class YearsToDoubleInvestmentTest
 {
     @Rule
     public ExpectedException exception = ExpectedException.none();

     @Test
     public void rate_is_5() throws Exception
     {
         assertEquals(14.4, YearsToDoubleInvestment.calculateYears(5),0);
     }

     @Test
     public void rate_is_0() throws Exception
     {
         exception.expect(ArithmeticException.class);
         exception.expectMessage("Rate can't be 0!");
         YearsToDoubleInvestment.calculateYears(0);
     }

 }