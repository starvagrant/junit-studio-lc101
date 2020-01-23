package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void testEmptyString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testMatchedBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testUnevenBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testSingleBracketWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[asdf"));
    }

    @Test
    public void testBalancedBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[asdf]"));
    }

    @Test
    public void testInvertedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testInvertedBracketsWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]asdf["));
    }

    @Test
    public void testNestedUnmatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void testNestedUnmatchedBracketsWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("as]asd[asd]asd["));
    }

    @Test
    public void testNestedandUnnestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }
}
