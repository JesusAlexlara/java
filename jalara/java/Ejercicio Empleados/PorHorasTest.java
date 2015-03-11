

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PorHorasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PorHorasTest
{
    /**
     * Default constructor for test class PorHorasTest
     */
    public PorHorasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void pruebaInit()
    {
        PorHoras porHoras1 = new PorHoras(44, 55);
        assertEquals(2640, porHoras1.calcularSuelo(), 0.1);
    }
}

