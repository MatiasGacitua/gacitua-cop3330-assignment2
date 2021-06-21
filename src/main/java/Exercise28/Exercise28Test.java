/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

package Exercise28;

  import org.junit.Test;

  import static org.junit.Assert.*;

  public class AddingNumbersTest
  {

      @Test
      public void add_5_integers()
      {
          double[] numbers = {1, 2, 3, 4, 5};
          assertEquals(15, AddingNumbers.sum(numbers), 0);
      }

      @Test
      public void add_3_integers()
      {
          double[] numbers = {5, 7, 12};
          assertEquals(24, AddingNumbers.sum(numbers), 0);
      }

      @Test
      public void add_4_decimals()
      {
          double[] numbers = {1.5, 3.4, 21.9, 30.5};
          assertEquals(57.3, AddingNumbers.sum(numbers), 0);
      }
  }