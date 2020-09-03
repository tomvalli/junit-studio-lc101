package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TEST 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //TEST 2
    @Test
    public void bracketsWithCharactersInBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch code]"));
    }

    //TEST 3
    @Test
    public void onlyBracketsReversedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //TEST 4
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    //TEST 5
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //TEST 6
    @Test
    public void unpairedBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][[[]]]"));
    }

    //TEST 7
    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch Code"));
    }

    //TEST 8
    @Test
    public void balancedReversedBracketsWithCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch ]Code["));
    }

    //TEST 9
    @Test
    public void  balancedBracketsBeginInMiddleTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //TEST 10
    @Test
    public void balancedBracketsBeginAtStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    //TEST 11
    @Test
    public void onlyOneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //TEST 12
    @Test
    public void oneOneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    //TEST 13
    @Test
    public void multiplePairsofBalancedBracketsInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L][a][u][n][c][h]Code"));
    }

}
