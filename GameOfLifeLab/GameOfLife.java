import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 70 rows and 70 columns
    private final int ROWS = 70;
    private final int COLS = 70;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the initial locations
        
        // first row of triangle
        Rock rock1 = new Rock();
        Location loc1 = new Location(30, 31);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(30, 32);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(30, 33);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(30, 34);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(30, 35);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(30, 36);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(30, 37);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(30, 38);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(30, 39);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(30, 40);
        grid.put(loc10, rock10);
        
        // second row of triangles
        Rock rock11 = new Rock();
        Location loc11 = new Location(29, 32);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(29, 33);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(29, 34);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(29, 35);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(29, 36);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(29, 37);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(29, 38);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(29, 39);
        grid.put(loc18, rock18);
        
        // third row of triangle
        Rock rock19 = new Rock();
        Location loc19 = new Location(28, 33);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(28, 34);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(28, 35);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(28, 36);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(28, 37);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(28, 38);
        grid.put(loc24, rock24);
        
        // fourth row of triangle
        Rock rock25 = new Rock();
        Location loc25 = new Location(27, 34);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(27, 35);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(27, 36);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(27, 37);
        grid.put(loc28, rock28);
        
        // fifth row of triangle
        Rock rock29 = new Rock();
        Location loc29 = new Location(26, 35);
        grid.put(loc29, rock29);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(26, 36);
        grid.put(loc30, rock30);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        // get occupied cells
        ArrayList<Location> occupied = grid.getOccupiedLocations();
        
        
        for (int row = 0; row < ROWS; row++)
        {
            for (int column = 0; column < COLS; column++)
            {
                Location loc0 = new Location(row, column);
                ArrayList<Actor> neighbors = grid.getNeighbors(loc0);
                Rock rock0 = new Rock ();
                // if actor is dead and has three neighbors: comes alive
                if (!(occupied.contains(loc0)) )
                {
                    if (neighbors.size() == 3)
                    {
                        newGrid.put(loc0, rock0);
                    }
                }
                // if actor is alive and has 2-3 actors: lives - otherwise it dies
                else
                {
                   if (neighbors.size() < 2)
                   {
                       newGrid.remove(loc0);
                   }
                   else if (neighbors.size() <= 3)
                   {
                       newGrid.put(loc0, rock0);
                    }
                 }
            }         
        }  
        
        world.setGrid(newGrid);
    }      
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        for (int gens = 0; gens < 9; gens++)
        {
            game.createNextGeneration();
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();

            }
            
        }

    }

}
