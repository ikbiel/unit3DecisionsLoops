
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
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
    public void testInitialState()
    {
        /* expected pattern for initial state
         * Filled triangle
         *  (X: alive; -: dead)
         * 
         * // pick different region
         * 
         *     30 31 32 33 34 
         *   25 -  -  -  -  -
         *   26 -  -  -  -  -
         *   27 -  -  -  -  X
         *   28 -  -  -  X  X
         *   29 -  -  X  X  X
         */ 
        
        GameOfLife game = new GameOfLife();
        //update conditionals
        for(int row = 25; row < 30; row++)
        {
            for(int col = 30; col < 35; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 27 && col == 34) ||
                        (row == 28 && col == 33) ||
                        (row == 28 && col == 34) ||
                        (row == 29 && col == 32) ||
                        (row == 29 && col == 33) ||
                        (row == 29 && col == 34) )
                       
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* expected pattern for final state
         * Four circles
         *  (X: alive; -: dead)
         * 
         * // pick different region
         * 
         *     30 31 32 33 34 
         *   26 -  -  -  -  -
         *   27 -  X  -  -  X
         *   28 X  -  X  -  -
         *   29 X  X  -  -  -
         *   30 -  -  -  -  -
         */ 
        
        GameOfLife game = new GameOfLife();
        for (int gens = 0; gens < 9; gens++)
        {
            game.createNextGeneration();
            
        }

        for(int row = 26; row < 31; row++)
        {
            for(int col = 30; col < 35; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 27 && col == 31) ||
                        (row == 27 && col == 34) ||
                        (row == 28 && col == 30) ||
                        (row == 28 && col == 32) ||
                        (row == 29 && col == 30) ||
                        (row == 29 && col == 31) )
                       
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
        
        
    }

}


