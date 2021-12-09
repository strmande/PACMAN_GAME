/*
  Copyright 2006 by Sean Luke and George Mason University
  Licensed under the Academic Free License version 3.0
  See the file "LICENSE" for more information
*/

package sim.app.pacman;
import sim.engine.*;
import sim.display.*;
import sim.portrayal.continuous.*;
import javax.swing.*;
import java.awt.*;
import sim.portrayal.simple.*;
import sim.portrayal.*;
import sim.portrayal.grid.*;
import java.awt.event.*;


/** Creates the UI for the PacMan game.  */

public class PacManWithUI extends GUIState
    {
    public Display2D display;
    public JFrame displayFrame;
    
    
    
    
    public static void main(String[] args)
        {
    	if(SetupGUI.game_has_been_set_up)
    		{
    		new PacManWithUI().createController();
    		}
    	else
    		{
    		SetupGUI.main(null);
    		}
        }
        
    public PacManWithUI()
        {
        super(new PacMan(System.currentTimeMillis()));
        }
    
    public PacManWithUI(SimState state) 
        {
        super(state);
        }

    /** The desired FPS */
    public double FRAMES_PER_SECOND = 60;
        

    /** Creates a SimpleController and starts it playing. */
    public Controller createController()
        {
        SimpleController c = new SimpleController(this);
        c.pressPlay();
        return c;
        }

    public static String getName() { return "Pac Man"; }

    public void start()
        {
    	
  
    
    	
        super.start();
        setupPortrayals();
        }

    public void load(SimState state)
        {
        super.load(state);
        setupPortrayals();
        }
        
    ValueGridPortrayal2D mazePortrayal = new ValueGridPortrayal2D();
    ContinuousPortrayal2D agentPortrayal = new ContinuousPortrayal2D();
    ContinuousPortrayal2D dotPortrayal = new ContinuousPortrayal2D();
    
    
//Blinky Skin Setup -------------------------------------------------------------------------------    
    public static String blinky_up = "images/blinkyu.png";
    public static String blinky_left = "images/blinkyl.png";
    public static String blinky_down = "images/blinkyd.png";
    public static String blinky_right = "images/blinkyr.png"; 
    public static String blinky_frightened = "images/frightened.png";
    public static String blinky_frightened2 = "images/frightened2.png";
    
    public static void blinkySetSkinRobot()
    	{
    	blinky_up = "images/robotu.png";
    	blinky_left = "images/robotl.png";
    	blinky_down = "images/robotd.png";
    	blinky_right = "images/robotr.png";
    	blinky_frightened = "images/robot_frightened.png";
    	blinky_frightened2 = "images/robot_frightened2.png";
    	}
    
    public static void blinkySetSkinClassic()
		{
    	blinky_up = "images/blinkyu.png";
    	blinky_left = "images/blinkyl.png";
    	blinky_down = "images/blinkyd.png";
    	blinky_right = "images/blinkyr.png";
    	blinky_frightened = "images/frightened.png";
    	blinky_frightened2 = "images/frightened2.png";
		}
    
    public static void blinkySetSkinCreeper()
		{
    	blinky_up = "images/creeperu.png";
    	blinky_left = "images/creeperl.png";
    	blinky_down = "images/creeperd.png";
    	blinky_right = "images/creeperr.png";
    	blinky_frightened = "images/frightened.png";
    	blinky_frightened2 = "images/frightened2.png";
		}
    
    public static void blinkySetSkinAlien()
		{
    	blinky_up = "images/alienu.png";
    	blinky_left = "images/alienl.png";
    	blinky_down = "images/aliend.png";
    	blinky_right = "images/alienr.png";
    	blinky_frightened = "images/alien_frightened.png";
    	blinky_frightened2 = "images/alien_frightened2.png";
	}
//Pinky Skin Setup -------------------------------------------------------------------------------
    public static String pinky_up = "images/pinkyu.png";
    public static String pinky_left = "images/pinkyl.png";
    public static String pinky_down = "images/pinkyd.png";
    public static String pinky_right = "images/pinkyr.png"; 
    public static String pinky_frightened = "images/frightened.png";
    public static String pinky_frightened2 = "images/frightened2.png";
    
    public static void pinkySetSkinRobot()
    	{
    	pinky_up = "images/robotu.png";
    	pinky_left = "images/robotl.png";
    	pinky_down = "images/robotd.png";
    	pinky_right = "images/robotr.png";
    	pinky_frightened = "images/robot_frightened.png";
    	pinky_frightened2 = "images/robot_frightened2.png";
    	}
    
    public static void pinkySetSkinClassic()
		{
    	pinky_up = "images/pinkyu.png";
    	pinky_left = "images/pinkyl.png";
    	pinky_down = "images/pinkyd.png";
    	pinky_right = "images/pinkyr.png";
    	pinky_frightened = "images/frightened.png";
    	pinky_frightened2 = "images/frightened2.png";
		}
    
    public static void pinkySetSkinCreeper()
		{
    	pinky_up = "images/creeperu.png";
    	pinky_left = "images/creeperl.png";
    	pinky_down = "images/creeperd.png";
    	pinky_right = "images/creeperr.png";
    	pinky_frightened = "images/frightened.png";
    	pinky_frightened2 = "images/frightened2.png";
		}
    
    public static void pinkySetSkinAlien()
		{
    	pinky_up = "images/alienu.png";
    	pinky_left = "images/alienl.png";
    	pinky_down = "images/aliend.png";
    	pinky_right = "images/alienr.png";
    	pinky_frightened = "images/alien_frightened.png";
    	pinky_frightened2 = "images/alien_frightened2.png";
	}    
//Inky Skin Setup -------------------------------------------------------------------------------
    public static String inky_up = "images/inkyu.png";
    public static String inky_left = "images/inkyl.png";
    public static String inky_down = "images/inkyd.png";
    public static String inky_right = "images/inkyr.png"; 
    public static String inky_frightened = "images/frightened.png";
    public static String inky_frightened2 = "images/frightened2.png";
    
    public static void inkySetSkinRobot()
    	{
    	inky_up = "images/robotu.png";
    	inky_left = "images/robotl.png";
    	inky_down = "images/robotd.png";
    	inky_right = "images/robotr.png";
    	inky_frightened = "images/robot_frightened.png";
    	inky_frightened2 = "images/robot_frightened2.png";
    	}
    
    public static void inkySetSkinClassic()
		{
    	inky_up = "images/inkyu.png";
    	inky_left = "images/inkyl.png";
    	inky_down = "images/inkyd.png";
    	inky_right = "images/inkyr.png";
    	inky_frightened = "images/frightened.png";
    	inky_frightened2 = "images/frightened2.png";
		}
    
    public static void inkySetSkinCreeper()
		{
    	inky_up = "images/creeperu.png";
    	inky_left = "images/creeperl.png";
    	inky_down = "images/creeperd.png";
    	inky_right = "images/creeperr.png";
    	inky_frightened = "images/frightened.png";
    	inky_frightened2 = "images/frightened2.png";
		}
    
    public static void inkySetSkinAlien()
		{
    	inky_up = "images/alienu.png";
    	inky_left = "images/alienl.png";
    	inky_down = "images/aliend.png";
    	inky_right = "images/alienr.png";
    	inky_frightened = "images/alien_frightened.png";
    	inky_frightened2 = "images/alien_frightened2.png";
	}    
//Clyde Skin Setup -------------------------------------------------------------------------------
    public static String clyde_up = "images/clydeu.png";
    public static String clyde_left = "images/clydel.png";
    public static String clyde_down = "images/clyded.png";
    public static String clyde_right = "images/clyder.png"; 
    public static String clyde_frightened = "images/frightened.png";
    public static String clyde_frightened2 = "images/frightened2.png";
    
    public static void clydeSetSkinRobot()
    	{
    	clyde_up = "images/robotu.png";
    	clyde_left = "images/robotl.png";
    	clyde_down = "images/robotd.png";
    	clyde_right = "images/robotr.png";
    	clyde_frightened = "images/robot_frightened.png";
    	clyde_frightened2 = "images/robot_frightened2.png";
    	}
    
    public static void clydeSetSkinClassic()
		{
    	clyde_up = "images/clydeu.png";
    	clyde_left = "images/clydel.png";
    	clyde_down = "images/clyded.png";
    	clyde_right = "images/clyder.png";
    	clyde_frightened = "images/frightened.png";
    	clyde_frightened2 = "images/frightened2.png";
		}
    
    public static void clydeSetSkinCreeper()
		{
    	clyde_up = "images/creeperu.png";
    	clyde_left = "images/creeperl.png";
    	clyde_down = "images/creeperd.png";
    	clyde_right = "images/creeperr.png";
    	clyde_frightened = "images/frightened.png";
    	clyde_frightened2 = "images/frightened2.png";
		}
    
    public static void clydeSetSkinAlien()
		{
    	clyde_up = "images/alienu.png";
    	clyde_left = "images/alienl.png";
    	clyde_down = "images/aliend.png";
    	clyde_right = "images/alienr.png";
    	clyde_frightened = "images/alien_frightened.png";
    	clyde_frightened2 = "images/alien_frightened2.png";
	}   
    
   
    public static Color player_1_color = Color.yellow;
    public static Color player_2_color = Color.magenta; 
    
//Player 1 color setters
    public static void setP1SkinYellow()
    	{
    	player_1_color = Color.yellow;
    	}
    public static void setP1SkinMagenta()
		{
		player_1_color = Color.magenta;
		}
    public static void setP1SkinRed()
		{
		player_1_color = Color.red;
		}
    public static void setP1SkinGreen()
		{
		player_1_color = Color.green;
		}

//Player 2 color setters
    public static void setP2SkinYellow()
    	{
    	player_2_color = Color.yellow;
    	}
    public static void setP2SkinMagenta()
		{
		player_2_color = Color.magenta;
		}
    public static void setP2SkinRed()
		{
		player_2_color = Color.red;
		}
    public static void setP2SkinGreen()
		{
		player_2_color = Color.green;
		}
    
    
    public void setupPortrayals()
        {
        PacMan pacman = (PacMan)state;

        // Create the agent portrayal 
        agentPortrayal.setField(pacman.agents);
                
        // The Pac.  Note that you can have multiple pacs, each with different tags, and set it up like
        // below to display them with different colors.  For now we've got it set to one pac.
        

        
        agentPortrayal.setPortrayalForClass(Pac.class, new PacPortrayal(pacman, player_1_color)
            {
            public void draw(Object object, Graphics2D graphics, DrawInfo2D info)
                { if (((Pac)object).tag==0) color = player_1_color;  else color = player_2_color;  super.draw(object, graphics, info); }
            });

        // Blinky is a red ghost unless he's scared, then he's a blue ghost.
        agentPortrayal.setPortrayalForClass(Blinky.class, new FacetedPortrayal2D(
                new SimplePortrayal2D[] 
                    {
                    new ImagePortrayal2D(this.getClass(), blinky_up, 2),
                    new ImagePortrayal2D(this.getClass(), blinky_left, 2),
                    new ImagePortrayal2D(this.getClass(), blinky_down, 2),
                    new ImagePortrayal2D(this.getClass(), blinky_right, 2),
                    new ImagePortrayal2D(this.getClass(), blinky_frightened, 2),
                    new ImagePortrayal2D(this.getClass(), blinky_frightened2, 2),
                    }));

        // Pinky is a pink ghost unless he's scared, then he's a blue ghost.
        agentPortrayal.setPortrayalForClass(Pinky.class, new FacetedPortrayal2D(
                new SimplePortrayal2D[] 
                    {
            		new ImagePortrayal2D(this.getClass(), pinky_up, 2),
                    new ImagePortrayal2D(this.getClass(), pinky_left, 2),
                    new ImagePortrayal2D(this.getClass(), pinky_down, 2),
                    new ImagePortrayal2D(this.getClass(), pinky_right, 2),
                    new ImagePortrayal2D(this.getClass(), pinky_frightened, 2),
                    new ImagePortrayal2D(this.getClass(), pinky_frightened2, 2),
                    }));

                
        // Inky is a cyan ghost unless he's scared, then he's a blue ghost.
        agentPortrayal.setPortrayalForClass(Inky.class, new FacetedPortrayal2D(
                new SimplePortrayal2D[] 
                    {
            		new ImagePortrayal2D(this.getClass(), inky_up, 2),
                    new ImagePortrayal2D(this.getClass(), inky_left, 2),
                    new ImagePortrayal2D(this.getClass(), inky_down, 2),
                    new ImagePortrayal2D(this.getClass(), inky_right, 2),
                    new ImagePortrayal2D(this.getClass(), inky_frightened, 2),
                    new ImagePortrayal2D(this.getClass(), inky_frightened2, 2),
                    }));

                
        // Clyde is a orange ghost unless he's scared, then he's a ghost rectangle.
        agentPortrayal.setPortrayalForClass(Clyde.class, new FacetedPortrayal2D(
                new SimplePortrayal2D[] 
                    {
            		new ImagePortrayal2D(this.getClass(), clyde_up, 2),
                    new ImagePortrayal2D(this.getClass(), clyde_left, 2),
                    new ImagePortrayal2D(this.getClass(), clyde_down, 2),
                    new ImagePortrayal2D(this.getClass(), clyde_right, 2),
                    new ImagePortrayal2D(this.getClass(), clyde_frightened, 2),
                    new ImagePortrayal2D(this.getClass(), clyde_frightened2, 2),
                    }));

        // Create the dot portrayal (also the energizers)
        dotPortrayal.setField(pacman.dots);

        // Energizers are big
        dotPortrayal.setPortrayalForClass(Energizer.class, new OvalPortrayal2D(Color.white, 1));

        // dots are small
        dotPortrayal.setPortrayalForClass(Dot.class, new OvalPortrayal2D(Color.white, 0.4));
                
        // set up the maze portrayal
        mazePortrayal.setPortrayalForAll(new MazeCellPortrayal(pacman.maze));
        mazePortrayal.setField(pacman.maze);
                
        // add the RateAdjuster
        scheduleRepeatingImmediatelyAfter(new RateAdjuster(FRAMES_PER_SECOND));
                
        // reschedule the displayer
        display.reset();
                
        // redraw the display
        display.repaint();
        }



    public void init(final Controller c)
        {
        super.init(c);

        // make the displayer
        display = new Display2D(448,560,this)
            {
            public void createConsoleMenu() { }
            public void quit()
                {
                super.quit();
                ((SimpleController) c).doClose();
                }
            };

        display.setBackdrop(Color.black);
                
        displayFrame = display.createFrame();
        displayFrame.setTitle("MASON Pac Man");
        c.registerFrame(displayFrame);   // register the frame so it appears in the "Display" list
        displayFrame.setVisible(true);

        // Notice the order: first the background, then the dots, then the agents, then the overlay
        display.attach( mazePortrayal, "Maze");
        // display.attach( background, "Background");
        display.attach( dotPortrayal, "Dots", 8, 8, true);
        display.attach( agentPortrayal, "Agents", 8, 8, true);
        display.attach( new Overlay(this), "Overlay");

        // Some stuff to make this feel less like MASON
        // delete the header
        display.remove(display.header);
        // delete all listeners
        display.removeListeners();
        // delete the scroll bars
        display.display.setVerticalScrollBarPolicy(display.display.VERTICAL_SCROLLBAR_NEVER);
        display.display.setHorizontalScrollBarPolicy(display.display.HORIZONTAL_SCROLLBAR_NEVER);
        // when we close the window, the application quits
        displayFrame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        // can't resize
        displayFrame.setResizable(false);
        // add antialiasing and interpolation
        display.insideDisplay.setupHints(true, false, false);
                
        // the window won't be the right size now -- modify it.
        displayFrame.pack();
                
        // Now we add in the listeners we want
        addListeners(display);
        displayFrame.setLocationRelativeTo(null);
        }


    /** Creates key listeners which issue requests to the simulation. */
    public void addListeners(final Display2D display)
        {
        final PacMan pacman = (PacMan)state;
        final SimpleController cont = (SimpleController) controller;
                
        // Make us able to take focus -- this is by default true usually anyway
        display.setFocusable(true);
                
        // Make us request focus whenever our window comes up
        displayFrame.addWindowListener(new WindowAdapter()
            {
            public void windowActivated(WindowEvent e)
                {
                display.requestFocusInWindow();
                }
            });
                        
        // the display frame has just been set visible so we need to request focus once
        display.requestFocusInWindow();


        display.addKeyListener(new KeyAdapter()
            {
            public void keyPressed(KeyEvent e)
                {
                int c = e.getKeyCode();
                switch(c)
                    {
                    case KeyEvent.VK_UP: 
                        pacman.actions[0] = Pac.N;
                        break;
                    case KeyEvent.VK_DOWN: 
                        pacman.actions[0] = Pac.S;
                        break;
                    case KeyEvent.VK_LEFT: 
                        pacman.actions[0] = Pac.W;
                        break;
                    case KeyEvent.VK_RIGHT: 
                        pacman.actions[0] = Pac.E;
                        break;
                    case KeyEvent.VK_W: 
                        pacman.actions[1] = Pac.N;
                        break;
                    case KeyEvent.VK_S: 
                        pacman.actions[1] = Pac.S;
                        break;
                    case KeyEvent.VK_A: 
                        pacman.actions[1] = Pac.W;
                        break;
                    case KeyEvent.VK_D: 
                        pacman.actions[1] = Pac.E;
                        break;
                    case KeyEvent.VK_R:             // Reset the board.  Easiest way: stop and play, which calls start()
                        cont.pressStop();
                        cont.pressPlay();
                        break;
                    case KeyEvent.VK_P:             // Pause or unpause the game
                        cont.pressPause();
                        break;
                    case KeyEvent.VK_M:             // Call setup menu back and close gameplay window
                        SetupGUI.main(null);
                        displayFrame.setVisible(false);
                        break;
                    default:
                        // do nothing
                        break;
                    }
                }
            });
        }


    public void quit()
        {
        super.quit();
        display = null;
                
        if (displayFrame!=null) { JFrame f = displayFrame; displayFrame = null; f.dispose(); }
        }

    }
