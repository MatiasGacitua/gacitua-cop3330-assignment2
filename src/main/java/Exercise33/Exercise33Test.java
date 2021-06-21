/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

 package Exercise33;

 import org.junit.Test;

 import static org.junit.Assert.*;

 public class Magic8BallTest
 {

     @Test
     public void test_that_response_returned_is_on_the_list()
     {
         String response = Magic8Ball.turnTheBall();
         System.out.println(response);
         assertTrue(response,response.equals("Yes") || response.equals("No") || response.equals("Maybe")
                 || response.equals("Ask again later"));
     }
 }