package com.sapient;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CandleBlowTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	String[] args = new String [] {"8","8","2","3","2","7"};
        assertTrue( CandleBlow.findUniqueHeights(args) == 4 );
    }
}
