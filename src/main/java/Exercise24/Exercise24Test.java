/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

package Exercise24;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramCheckerTest
{

    @Test
    public void is_one_word_anagram () throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("tone","note");
        assertEquals(true, result);
    }

    @Test
    public void is_not_an_anagram () throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("happy","learn");
        assertEquals(false, result);
    }

    @Test
    public void is_multiple_words_anagram () throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("public relations","crap built on lies");
        assertEquals(true, result);
    }
}