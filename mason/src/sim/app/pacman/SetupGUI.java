//This is a setup GUI menu for the PacMan game provided by the UNG class CSCI 3300
//---------------------
//Author: Tom Tarnowski
//Contributors: (Include your name if you would like to modify this class)

package sim.app.pacman;
import java.awt.Color;

import javax.swing.*;

public class SetupGUI {
	JFrame frame;
	
	boolean skins_tab_open = false;
	public static boolean game_has_been_set_up = false;
	
	public static void main(String[] args) 
		{
		new SetupGUI();
		}
	
	public SetupGUI() 
		{
		initComponent();
		}
	
	
	
	public void initComponent() 
		{
		
		frame = new JFrame("Pac Man Setup");
		
		//These are all the images that will be used for the menu
		JLabel background = new JLabel(new ImageIcon("src/sim/app/pacman/images/background.png"));
		JLabel background_2 = new JLabel(new ImageIcon("src/sim/app/pacman/images/background_2.png"));
		ImageIcon arrow_up = new ImageIcon("src/sim/app/pacman/images/arrow_up.png");
		ImageIcon arrow_up_glow = new ImageIcon("src/sim/app/pacman/images/arrow_up_glow.png");
		ImageIcon arrow_down = new ImageIcon("src/sim/app/pacman/images/arrow_down.png");
		ImageIcon arrow_down_glow = new ImageIcon("src/sim/app/pacman/images/arrow_down_glow.png");
		ImageIcon blank = new ImageIcon("src/sim/app/pacman/images/blank.png");
		ImageIcon one = new ImageIcon("src/sim/app/pacman/images/one.png");
		ImageIcon two = new ImageIcon("src/sim/app/pacman/images/two.png");
		ImageIcon three = new ImageIcon("src/sim/app/pacman/images/three.png");
		ImageIcon four = new ImageIcon("src/sim/app/pacman/images/four.png");
		ImageIcon start = new ImageIcon("src/sim/app/pacman/images/start.png");
		ImageIcon start_glow = new ImageIcon("src/sim/app/pacman/images/start_glow.png");
		ImageIcon skins = new ImageIcon("src/sim/app/pacman/images/skins.png");
		ImageIcon skins_glow = new ImageIcon("src/sim/app/pacman/images/skins_glow.png");
		
		ImageIcon blinky_skin_display = new ImageIcon("src/sim/app/pacman/images/blinky_skin_display.png");
		ImageIcon pinky_skin_display = new ImageIcon("src/sim/app/pacman/images/pinky_skin_display.png");
		ImageIcon inky_skin_display = new ImageIcon("src/sim/app/pacman/images/inky_skin_display.png");
		ImageIcon clyde_skin_display = new ImageIcon("src/sim/app/pacman/images/clyde_skin_display.png");
		
		ImageIcon robot_skin_display = new ImageIcon("src/sim/app/pacman/images/robotu.png");
		ImageIcon creeper_skin_display = new ImageIcon("src/sim/app/pacman/images/creeper_skin_display.png");
		ImageIcon alien_skin_display = new ImageIcon("src/sim/app/pacman/images/alien_skin_display.png");

		ImageIcon yellow_skin = new ImageIcon("src/sim/app/pacman/images/yellow_skin_display.png");
		ImageIcon magenta_skin = new ImageIcon("src/sim/app/pacman/images/magenta_skin_display.png");
		ImageIcon red_skin = new ImageIcon("src/sim/app/pacman/images/red_skin_display.png");
		ImageIcon green_skin = new ImageIcon("src/sim/app/pacman/images/green_skin_display.png");
		
		
//Player 1 Skin Setup -------------------------------------------------------------------------	
		JButton p1_increase = new JButton(arrow_up);
		JButton p1_decrease = new JButton(arrow_down);
		JButton p1_skin = new JButton(yellow_skin);
				
			//Blinky skin icon
			p1_skin.setOpaque(false);
			p1_skin.setContentAreaFilled(false);
			p1_skin.setBorderPainted(false);
			p1_skin.setFocusPainted(false);
			p1_skin.setBorder(BorderFactory.createEmptyBorder());
			p1_skin.setContentAreaFilled(false);
			p1_skin.setSize(80, 80);
			p1_skin.setLocation(1200, 540);//This is just meant to make the button off screen
			frame.add(p1_skin);
		
			//This is a functional button that changes the ghost's skin
			p1_increase.setOpaque(false);
			p1_increase.setContentAreaFilled(false);
			p1_increase.setBorderPainted(false);
			p1_increase.setFocusPainted(false);
			p1_increase.setBorder(BorderFactory.createEmptyBorder());
			p1_increase.setContentAreaFilled(false);
			p1_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			p1_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		p1_increase.setIcon(arrow_up_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		p1_increase.setIcon(arrow_up);
			    	}
				});
			//This handles what happens when the button is actually pressed
			p1_increase.addActionListener(e ->
				{
						
				if(PacManWithUI.player_1_color == Color.magenta)	
					{
					p1_skin.setIcon(red_skin);
					p1_decrease.setIcon(arrow_down);
					PacManWithUI.setP1SkinRed();
					}
				else	
				if(PacManWithUI.player_1_color == Color.red)	
					{
					p1_skin.setIcon(green_skin);
					p1_decrease.setIcon(arrow_down);
					PacManWithUI.setP1SkinGreen();
					}	
				else	
				if(PacManWithUI.player_1_color == Color.yellow)	
					{				
					p1_skin.setIcon(magenta_skin);
					p1_decrease.setIcon(arrow_down);
					PacManWithUI.setP1SkinMagenta();
					}		
				else
				if(PacManWithUI.player_1_color == Color.green)	
					{				
					p1_skin.setIcon(yellow_skin);
					p1_decrease.setIcon(arrow_down);
					PacManWithUI.setP1SkinYellow();
					}	
				
				});
			p1_increase.setLocation(38500, 417);
			frame.add(p1_increase);
				
			//This is a functional button that changes the ghost's skin
			p1_decrease.setOpaque(false);
			p1_decrease.setContentAreaFilled(false);
			p1_decrease.setBorderPainted(false);
			p1_decrease.setFocusPainted(false);
			p1_decrease.setBorder(BorderFactory.createEmptyBorder());
			p1_decrease.setContentAreaFilled(false);
			p1_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			p1_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		p1_decrease.setIcon(arrow_down_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		p1_decrease.setIcon(arrow_down);
			    	}
				});
			//This handles what happens when the button is actually pressed
			p1_decrease.addActionListener(e ->
				{
				
				if(PacManWithUI.player_1_color == Color.yellow)	
					{
					p1_increase.setIcon(arrow_up);
					p1_skin.setIcon(green_skin);
					PacManWithUI.setP1SkinGreen();
					}	
				else	
				if(PacManWithUI.player_1_color == Color.green)	
					{
					p1_increase.setIcon(arrow_up);
					p1_skin.setIcon(red_skin);
					PacManWithUI.setP1SkinRed();
					}	
				else
				if(PacManWithUI.player_1_color == Color.red)	
					{
					p1_increase.setIcon(arrow_up);
					p1_skin.setIcon(magenta_skin);
					PacManWithUI.setP1SkinMagenta();
					}	
				else
				if(PacManWithUI.player_1_color == Color.magenta)	
					{
					p1_increase.setIcon(arrow_up);
					p1_skin.setIcon(yellow_skin);
					PacManWithUI.setP1SkinYellow();
					}
				});
			p1_decrease.setLocation(38500, 464);
			frame.add(p1_decrease);		
		
		
//Player 2 Skin Setup -------------------------------------------------------------------------	
	JButton p2_increase = new JButton(arrow_up);
	JButton p2_decrease = new JButton(arrow_down);
	JButton p2_skin = new JButton(magenta_skin);
			
		//Blinky skin icon
		p2_skin.setOpaque(false);
		p2_skin.setContentAreaFilled(false);
		p2_skin.setBorderPainted(false);
		p2_skin.setFocusPainted(false);
		p2_skin.setBorder(BorderFactory.createEmptyBorder());
		p2_skin.setContentAreaFilled(false);
		p2_skin.setSize(80, 80);
		p2_skin.setLocation(2200, 540);//This is just meant to make the button off screen
		frame.add(p2_skin);
	
		//This is a functional button that changes the ghost's skin
		p2_increase.setOpaque(false);
		p2_increase.setContentAreaFilled(false);
		p2_increase.setBorderPainted(false);
		p2_increase.setFocusPainted(false);
		p2_increase.setBorder(BorderFactory.createEmptyBorder());
		p2_increase.setContentAreaFilled(false);
		p2_increase.setSize(50, 50);
		//This adds a glow-on-hover effect for the button
		p2_increase.addMouseListener(new java.awt.event.MouseAdapter() 
		{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    		p2_increase.setIcon(arrow_up_glow);
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    		p2_increase.setIcon(arrow_up);
		    	}
			});
		//This handles what happens when the button is actually pressed
		p2_increase.addActionListener(e ->
			{
					
			if(PacManWithUI.player_2_color == Color.magenta)	
				{
				p2_skin.setIcon(red_skin);
				p2_decrease.setIcon(arrow_down);
				PacManWithUI.setP2SkinRed();
				}
			else	
			if(PacManWithUI.player_2_color == Color.red)	
				{
				p2_skin.setIcon(green_skin);
				p2_decrease.setIcon(arrow_down);
				PacManWithUI.setP2SkinGreen();
				}	
			else	
			if(PacManWithUI.player_2_color == Color.yellow)	
				{				
				p2_skin.setIcon(magenta_skin);
				p2_decrease.setIcon(arrow_down);
				PacManWithUI.setP2SkinMagenta();
				}		
			else
			if(PacManWithUI.player_2_color == Color.green)	
				{				
				p2_skin.setIcon(yellow_skin);
				p2_decrease.setIcon(arrow_down);
				PacManWithUI.setP2SkinYellow();
				}	
			
			});
		p2_increase.setLocation(38500, 427);
		frame.add(p2_increase);
			
		//This is a functional button that changes the ghost's skin
		p2_decrease.setOpaque(false);
		p2_decrease.setContentAreaFilled(false);
		p2_decrease.setBorderPainted(false);
		p2_decrease.setFocusPainted(false);
		p2_decrease.setBorder(BorderFactory.createEmptyBorder());
		p2_decrease.setContentAreaFilled(false);
		p2_decrease.setSize(50, 50);
		//This adds a glow-on-hover effect for the button
		p2_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    		p2_decrease.setIcon(arrow_down_glow);
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    		p2_decrease.setIcon(arrow_down);
		    	}
			});
		//This handles what happens when the button is actually pressed
		p2_decrease.addActionListener(e ->
			{
			
			if(PacManWithUI.player_2_color == Color.yellow)	
				{
				p2_increase.setIcon(arrow_up);
				p2_skin.setIcon(green_skin);
				PacManWithUI.setP2SkinGreen();
				}	
			else	
			if(PacManWithUI.player_2_color == Color.green)	
				{
				p2_increase.setIcon(arrow_up);
				p2_skin.setIcon(red_skin);
				PacManWithUI.setP2SkinRed();
				}	
			else
			if(PacManWithUI.player_2_color == Color.red)	
				{
				p2_increase.setIcon(arrow_up);
				p2_skin.setIcon(magenta_skin);
				PacManWithUI.setP2SkinMagenta();
				}	
			else
			if(PacManWithUI.player_2_color == Color.magenta)	
				{
				p2_increase.setIcon(arrow_up);
				p2_skin.setIcon(yellow_skin);
				PacManWithUI.setP2SkinYellow();
				}
			});
		p2_decrease.setLocation(38500, 464);
		frame.add(p2_decrease);						
		
		
//Player Count Setup -------------------------------------------------------------------------
		JButton player_increase = new JButton(arrow_up);
		JButton player_decrease = new JButton(blank);
		JButton player_number = new JButton(one);
					
			//Player count icon
			player_number.setOpaque(false);
			player_number.setContentAreaFilled(false);
			player_number.setBorderPainted(false);
			player_number.setFocusPainted(false);
			player_number.setBorder(BorderFactory.createEmptyBorder());
			player_number.setContentAreaFilled(false);
			player_number.setSize(50, 50);
			player_number.setLocation(320, 250);
			frame.add(player_number);
				
			//This is a functional button that increases the number of players to 2 when clicked
			player_increase.setOpaque(false);
			player_increase.setContentAreaFilled(false);
			player_increase.setBorderPainted(false);
			player_increase.setFocusPainted(false);
			player_increase.setBorder(BorderFactory.createEmptyBorder());
			player_increase.setContentAreaFilled(false);
			player_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			player_increase.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    	if(PacMan.NUM_OF_PLAYERS == 1)
		    			{
			    		player_increase.setIcon(arrow_up_glow);
		    			}
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    	if(PacMan.NUM_OF_PLAYERS == 1)
			    		{
			    		player_increase.setIcon(arrow_up);
			    		}
			    	}
				});
			//This handles what happens when the button is actually pressed
			player_increase.addActionListener(e ->
				{
				player_increase.setIcon(blank);
				player_decrease.setIcon(arrow_down);
				player_number.setIcon(two);
				PacMan.setPlayerCount(2);
				if(skins_tab_open)
					{
					p2_skin.setLocation(95, 577);
					p2_skin.setIcon(magenta_skin);
					}
				});
			player_increase.setLocation(385, 227);
			frame.add(player_increase);
				
			//This is a functional button that decreases the number of players to 1	when clicked
			player_decrease.setOpaque(false);
			player_decrease.setContentAreaFilled(false);
			player_decrease.setBorderPainted(false);
			player_decrease.setFocusPainted(false);
			player_decrease.setBorder(BorderFactory.createEmptyBorder());
			player_decrease.setContentAreaFilled(false);
			player_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			player_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_PLAYERS == 2)
	    			{
		    		player_decrease.setIcon(arrow_down_glow);
	    			}
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_PLAYERS == 2)
		    		{
		    		player_decrease.setIcon(arrow_down);
		    		}
		    	}
			});
			//This handles what happens when the button is actually pressed
			player_decrease.addActionListener(e ->
				{
				player_decrease.setIcon(blank);
				player_increase.setIcon(arrow_up);
				player_number.setIcon(one);
				PacMan.setPlayerCount(1);
				p2_skin.setLocation(1200, 540);
				});
			player_decrease.setLocation(385, 274);
			frame.add(player_decrease);
				
		
//Blinky Skin Setup -------------------------------------------------------------------------	
		JButton blinky_increase = new JButton(arrow_up);
		JButton blinky_decrease = new JButton(arrow_down);
		JButton blinky_skin = new JButton(blinky_skin_display);
				
			//Blinky skin icon
			blinky_skin.setOpaque(false);
			blinky_skin.setContentAreaFilled(false);
			blinky_skin.setBorderPainted(false);
			blinky_skin.setFocusPainted(false);
			blinky_skin.setBorder(BorderFactory.createEmptyBorder());
			blinky_skin.setContentAreaFilled(false);
			blinky_skin.setSize(80, 80);
			blinky_skin.setLocation(1200, 540);//This is just meant to make the button off screen
			frame.add(blinky_skin);
		
			//This is a functional button that changes the ghost's skin
			blinky_increase.setOpaque(false);
			blinky_increase.setContentAreaFilled(false);
			blinky_increase.setBorderPainted(false);
			blinky_increase.setFocusPainted(false);
			blinky_increase.setBorder(BorderFactory.createEmptyBorder());
			blinky_increase.setContentAreaFilled(false);
			blinky_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			blinky_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		blinky_increase.setIcon(arrow_up_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    	if(PacManWithUI.blinky_up != ("images/alienu.png"))	
			    		blinky_increase.setIcon(arrow_up);
			    	}
				});
			//This handles what happens when the button is actually pressed
			blinky_increase.addActionListener(e ->
				{
						
				if(PacManWithUI.blinky_up.equals("images/creeperu.png"))	
					{
					blinky_skin.setIcon(alien_skin_display);
					blinky_decrease.setIcon(arrow_down);
					PacManWithUI.blinkySetSkinAlien();
					}
				else	
				if(PacManWithUI.blinky_up.equals("images/robotu.png"))	
					{
					blinky_skin.setIcon(creeper_skin_display);
					blinky_decrease.setIcon(arrow_down);
					PacManWithUI.blinkySetSkinCreeper();
					}	
				else	
				if(PacManWithUI.blinky_up.equals("images/blinkyu.png"))	
					{				
					blinky_decrease.setIcon(arrow_down);
					blinky_skin.setIcon(robot_skin_display);
					PacManWithUI.blinkySetSkinRobot();
					}		
				else
				if(PacManWithUI.blinky_up.equals("images/alienu.png"))	
					{				
					blinky_decrease.setIcon(arrow_down);
					blinky_skin.setIcon(blinky_skin_display);
					
					PacManWithUI.blinkySetSkinClassic();
					}	
				
				});
			blinky_increase.setLocation(38500, 417);
			frame.add(blinky_increase);
				
			//This is a functional button that changes the ghost's skin
			blinky_decrease.setOpaque(false);
			blinky_decrease.setContentAreaFilled(false);
			blinky_decrease.setBorderPainted(false);
			blinky_decrease.setFocusPainted(false);
			blinky_decrease.setBorder(BorderFactory.createEmptyBorder());
			blinky_decrease.setContentAreaFilled(false);
			blinky_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			blinky_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		blinky_decrease.setIcon(arrow_down_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		blinky_decrease.setIcon(arrow_down);
			    	}
				});
			//This handles what happens when the button is actually pressed
			blinky_decrease.addActionListener(e ->
				{
				
				if(PacManWithUI.blinky_up.equals("images/robotu.png"))
					{
					blinky_increase.setIcon(arrow_up);
					blinky_skin.setIcon(blinky_skin_display);
					PacManWithUI.blinkySetSkinClassic();
					}
				else
				if(PacManWithUI.blinky_up.equals("images/creeperu.png"))
					{
					blinky_skin.setIcon(robot_skin_display);
					blinky_increase.setIcon(arrow_up);
					PacManWithUI.blinkySetSkinRobot();
					}	
				else	
				if(PacManWithUI.blinky_up.equals("images/alienu.png"))	
					{
					blinky_skin.setIcon(creeper_skin_display);
					blinky_increase.setIcon(arrow_up);
					PacManWithUI.blinkySetSkinCreeper();
					}
				else
				if(PacManWithUI.blinky_up.equals("images/blinkyu.png"))
					{
					blinky_increase.setIcon(arrow_up);
					blinky_skin.setIcon(alien_skin_display);
					PacManWithUI.blinkySetSkinAlien();
					}
				});
			blinky_decrease.setLocation(38500, 464);
			frame.add(blinky_decrease);
		

			
//Pinky Skin Setup -------------------------------------------------------------------------	
		JButton pinky_increase = new JButton(arrow_up);
		JButton pinky_decrease = new JButton(arrow_down);
		JButton pinky_skin = new JButton(pinky_skin_display);
				
			//Pinky skin icon
			pinky_skin.setOpaque(false);
			pinky_skin.setContentAreaFilled(false);
			pinky_skin.setBorderPainted(false);
			pinky_skin.setFocusPainted(false);
			pinky_skin.setBorder(BorderFactory.createEmptyBorder());
			pinky_skin.setContentAreaFilled(false);
			pinky_skin.setSize(80, 80);
			pinky_skin.setLocation(1200, 540);//This is just meant to make the button off screen
			frame.add(pinky_skin);
		
			//This is a functional button that changes the ghost's skin
			pinky_increase.setOpaque(false);
			pinky_increase.setContentAreaFilled(false);
			pinky_increase.setBorderPainted(false);
			pinky_increase.setFocusPainted(false);
			pinky_increase.setBorder(BorderFactory.createEmptyBorder());
			pinky_increase.setContentAreaFilled(false);
			pinky_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			pinky_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		pinky_increase.setIcon(arrow_up_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		pinky_increase.setIcon(arrow_up);
			    	}
				});
			//This handles what happens when the button is actually pressed
			pinky_increase.addActionListener(e ->
				{
						
				if(PacManWithUI.pinky_up.equals("images/creeperu.png"))	
					{
					pinky_skin.setIcon(alien_skin_display);
					pinky_decrease.setIcon(arrow_down);
					PacManWithUI.pinkySetSkinAlien();
					}
				else	
				if(PacManWithUI.pinky_up.equals("images/robotu.png"))	
					{
					pinky_skin.setIcon(creeper_skin_display);
					pinky_decrease.setIcon(arrow_down);
					PacManWithUI.pinkySetSkinCreeper();
					}	
				else	
				if(PacManWithUI.pinky_up.equals("images/pinkyu.png"))	
					{				
					pinky_decrease.setIcon(arrow_down);
					pinky_skin.setIcon(robot_skin_display);
					PacManWithUI.pinkySetSkinRobot();
					}		
				else
				if(PacManWithUI.pinky_up.equals("images/alienu.png"))	
					{				
					pinky_decrease.setIcon(arrow_down);
					pinky_skin.setIcon(pinky_skin_display);
					
					PacManWithUI.pinkySetSkinClassic();
					}	
				
				});
			pinky_increase.setLocation(38500, 417);
			frame.add(pinky_increase);
				
			//This is a functional button that changes the ghost's skin
			pinky_decrease.setOpaque(false);
			pinky_decrease.setContentAreaFilled(false);
			pinky_decrease.setBorderPainted(false);
			pinky_decrease.setFocusPainted(false);
			pinky_decrease.setBorder(BorderFactory.createEmptyBorder());
			pinky_decrease.setContentAreaFilled(false);
			pinky_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			pinky_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		pinky_decrease.setIcon(arrow_down_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		pinky_decrease.setIcon(arrow_down);
			    	}
				});
			//This handles what happens when the button is actually pressed
			pinky_decrease.addActionListener(e ->
				{
				
				if(PacManWithUI.pinky_up.equals("images/robotu.png"))
					{
					pinky_increase.setIcon(arrow_up);
					pinky_skin.setIcon(pinky_skin_display);
					PacManWithUI.pinkySetSkinClassic();
					}
				else
				if(PacManWithUI.pinky_up.equals("images/creeperu.png"))
					{
					pinky_skin.setIcon(robot_skin_display);
					pinky_increase.setIcon(arrow_up);
					PacManWithUI.pinkySetSkinRobot();
					}	
				else	
				if(PacManWithUI.pinky_up.equals("images/alienu.png"))	
					{
					pinky_skin.setIcon(creeper_skin_display);
					pinky_increase.setIcon(arrow_up);
					PacManWithUI.pinkySetSkinCreeper();
					}
				else
				if(PacManWithUI.pinky_up.equals("images/pinkyu.png"))
					{
					pinky_increase.setIcon(arrow_up);
					pinky_skin.setIcon(alien_skin_display);
					PacManWithUI.pinkySetSkinAlien();
					}
				});
			pinky_decrease.setLocation(38500, 464);
			frame.add(pinky_decrease);			

//Inky Skin Setup -------------------------------------------------------------------------	
		JButton inky_increase = new JButton(arrow_up);
		JButton inky_decrease = new JButton(arrow_down);
		JButton inky_skin = new JButton(inky_skin_display);
				
			//Inky skin icon
			inky_skin.setOpaque(false);
			inky_skin.setContentAreaFilled(false);
			inky_skin.setBorderPainted(false);
			inky_skin.setFocusPainted(false);
			inky_skin.setBorder(BorderFactory.createEmptyBorder());
			inky_skin.setContentAreaFilled(false);
			inky_skin.setSize(80, 80);
			inky_skin.setLocation(1200, 540);//This is just meant to make the button off screen
			frame.add(inky_skin);
		
			//This is a functional button that changes the ghost's skin
			inky_increase.setOpaque(false);
			inky_increase.setContentAreaFilled(false);
			inky_increase.setBorderPainted(false);
			inky_increase.setFocusPainted(false);
			inky_increase.setBorder(BorderFactory.createEmptyBorder());
			inky_increase.setContentAreaFilled(false);
			inky_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			inky_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		inky_increase.setIcon(arrow_up_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		inky_increase.setIcon(arrow_up);
			    	}
				});
			//This handles what happens when the button is actually pressed
			inky_increase.addActionListener(e ->
				{
						
				if(PacManWithUI.inky_up.equals("images/creeperu.png"))	
					{
					inky_skin.setIcon(alien_skin_display);
					inky_decrease.setIcon(arrow_down);
					PacManWithUI.inkySetSkinAlien();
					}
				else	
				if(PacManWithUI.inky_up.equals("images/robotu.png"))	
					{
					inky_skin.setIcon(creeper_skin_display);
					inky_decrease.setIcon(arrow_down);
					PacManWithUI.inkySetSkinCreeper();
					}	
				else	
				if(PacManWithUI.inky_up.equals("images/inkyu.png"))	
					{				
					inky_decrease.setIcon(arrow_down);
					inky_skin.setIcon(robot_skin_display);
					PacManWithUI.inkySetSkinRobot();
					}		
				else
				if(PacManWithUI.inky_up.equals("images/alienu.png"))	
					{				
					inky_decrease.setIcon(arrow_down);
					inky_skin.setIcon(inky_skin_display);
					
					PacManWithUI.inkySetSkinClassic();
					}	
				
				});
			inky_increase.setLocation(38500, 417);
			frame.add(inky_increase);
				
			//This is a functional button that changes the ghost's skin
			inky_decrease.setOpaque(false);
			inky_decrease.setContentAreaFilled(false);
			inky_decrease.setBorderPainted(false);
			inky_decrease.setFocusPainted(false);
			inky_decrease.setBorder(BorderFactory.createEmptyBorder());
			inky_decrease.setContentAreaFilled(false);
			inky_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			inky_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		inky_decrease.setIcon(arrow_down_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		inky_decrease.setIcon(arrow_down);
			    	}
				});
			//This handles what happens when the button is actually pressed
			inky_decrease.addActionListener(e ->
				{
				
				if(PacManWithUI.inky_up.equals("images/robotu.png"))
					{
					inky_increase.setIcon(arrow_up);
					inky_skin.setIcon(inky_skin_display);
					PacManWithUI.inkySetSkinClassic();
					}
				else
				if(PacManWithUI.inky_up.equals("images/creeperu.png"))
					{
					inky_skin.setIcon(robot_skin_display);
					inky_increase.setIcon(arrow_up);
					PacManWithUI.inkySetSkinRobot();
					}	
				else	
				if(PacManWithUI.inky_up.equals("images/alienu.png"))	
					{
					inky_skin.setIcon(creeper_skin_display);
					inky_increase.setIcon(arrow_up);
					PacManWithUI.inkySetSkinCreeper();
					}
				else
				if(PacManWithUI.inky_up.equals("images/inkyu.png"))
					{
					inky_increase.setIcon(arrow_up);
					inky_skin.setIcon(alien_skin_display);
					PacManWithUI.inkySetSkinAlien();
					}
				});
			inky_decrease.setLocation(38500, 464);
			frame.add(inky_decrease);							

//Clyde Skin Setup -------------------------------------------------------------------------	
		JButton clyde_increase = new JButton(arrow_up);
		JButton clyde_decrease = new JButton(arrow_down);
		JButton clyde_skin = new JButton(clyde_skin_display);
				
			//Clyde skin icon
			clyde_skin.setOpaque(false);
			clyde_skin.setContentAreaFilled(false);
			clyde_skin.setBorderPainted(false);
			clyde_skin.setFocusPainted(false);
			clyde_skin.setBorder(BorderFactory.createEmptyBorder());
			clyde_skin.setContentAreaFilled(false);
			clyde_skin.setSize(80, 80);
			clyde_skin.setLocation(1200, 540);//This is just meant to make the button off screen
			frame.add(clyde_skin);
		
			//This is a functional button that changes the ghost's skin
			clyde_increase.setOpaque(false);
			clyde_increase.setContentAreaFilled(false);
			clyde_increase.setBorderPainted(false);
			clyde_increase.setFocusPainted(false);
			clyde_increase.setBorder(BorderFactory.createEmptyBorder());
			clyde_increase.setContentAreaFilled(false);
			clyde_increase.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			clyde_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		clyde_increase.setIcon(arrow_up_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		clyde_increase.setIcon(arrow_up);
			    	}
				});
			//This handles what happens when the button is actually pressed
			clyde_increase.addActionListener(e ->
				{
						
				if(PacManWithUI.clyde_up.equals("images/creeperu.png"))	
					{
					clyde_skin.setIcon(alien_skin_display);
					clyde_decrease.setIcon(arrow_down);
					PacManWithUI.clydeSetSkinAlien();
					}
				else	
				if(PacManWithUI.clyde_up.equals("images/robotu.png"))	
					{
					clyde_skin.setIcon(creeper_skin_display);
					clyde_decrease.setIcon(arrow_down);
					PacManWithUI.clydeSetSkinCreeper();
					}	
				else	
				if(PacManWithUI.clyde_up.equals("images/clydeu.png"))	
					{				
					clyde_decrease.setIcon(arrow_down);
					clyde_skin.setIcon(robot_skin_display);
					PacManWithUI.clydeSetSkinRobot();
					}		
				else
				if(PacManWithUI.clyde_up.equals("images/alienu.png"))	
					{				
					clyde_decrease.setIcon(arrow_down);
					clyde_skin.setIcon(clyde_skin_display);
					
					PacManWithUI.clydeSetSkinClassic();
					}	
				
				});
			clyde_increase.setLocation(38500, 417);
			frame.add(clyde_increase);
				
			//This is a functional button that changes the ghost's skin
			clyde_decrease.setOpaque(false);
			clyde_decrease.setContentAreaFilled(false);
			clyde_decrease.setBorderPainted(false);
			clyde_decrease.setFocusPainted(false);
			clyde_decrease.setBorder(BorderFactory.createEmptyBorder());
			clyde_decrease.setContentAreaFilled(false);
			clyde_decrease.setSize(50, 50);
			//This adds a glow-on-hover effect for the button
			clyde_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
				{
			    public void mouseEntered(java.awt.event.MouseEvent evt) 
			    	{
			    		clyde_decrease.setIcon(arrow_down_glow);
			    	}

			    public void mouseExited(java.awt.event.MouseEvent evt) 
			    	{
			    		clyde_decrease.setIcon(arrow_down);
			    	}
				});
			//This handles what happens when the button is actually pressed
			clyde_decrease.addActionListener(e ->
				{
				
				if(PacManWithUI.clyde_up.equals("images/robotu.png"))
					{
					clyde_increase.setIcon(arrow_up);
					clyde_skin.setIcon(clyde_skin_display);
					PacManWithUI.clydeSetSkinClassic();
					}
				else
				if(PacManWithUI.clyde_up.equals("images/creeperu.png"))
					{
					clyde_skin.setIcon(robot_skin_display);
					clyde_increase.setIcon(arrow_up);
					PacManWithUI.clydeSetSkinRobot();
					}	
				else	
				if(PacManWithUI.clyde_up.equals("images/alienu.png"))	
					{
					clyde_skin.setIcon(creeper_skin_display);
					clyde_increase.setIcon(arrow_up);
					PacManWithUI.clydeSetSkinCreeper();
					}
				else
				if(PacManWithUI.clyde_up.equals("images/clydeu.png"))
					{
					clyde_increase.setIcon(arrow_up);
					clyde_skin.setIcon(alien_skin_display);
					PacManWithUI.clydeSetSkinAlien();
					}
				});
			clyde_decrease.setLocation(38500, 464);
			frame.add(clyde_decrease);			
		
			
			
//Ghosts Count Setup -------------------------------------------------------------------------	
	JButton ghost_increase = new JButton(arrow_up);
	JButton ghost_decrease = new JButton(blank);
	JButton ghost_number = new JButton(one);
			
		//Ghost count icon
		ghost_number.setOpaque(false);
		ghost_number.setContentAreaFilled(false);
		ghost_number.setBorderPainted(false);
		ghost_number.setFocusPainted(false);
		ghost_number.setBorder(BorderFactory.createEmptyBorder());
		ghost_number.setContentAreaFilled(false);
		ghost_number.setSize(50, 50);
		ghost_number.setLocation(320, 440);
		frame.add(ghost_number);
			
		//This is a functional button that increases the number of ghosts when clicked
		ghost_increase.setOpaque(false);
		ghost_increase.setContentAreaFilled(false);
		ghost_increase.setBorderPainted(false);
		ghost_increase.setFocusPainted(false);
		ghost_increase.setBorder(BorderFactory.createEmptyBorder());
		ghost_increase.setContentAreaFilled(false);
		ghost_increase.setSize(50, 50);
		//This adds a glow-on-hover effect for the button
		ghost_increase.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_GHOSTS != 4)
	    			{
		    		ghost_increase.setIcon(arrow_up_glow);
	    			}
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_GHOSTS != 4)
		    		{
		    		ghost_increase.setIcon(arrow_up);
		    		}
		    	}
			});
		//This handles what happens when the button is actually pressed
		ghost_increase.addActionListener(e ->
			{
				
			if(PacMan.NUM_OF_GHOSTS == 3)	
				{
				ghost_increase.setIcon(blank);
				ghost_decrease.setIcon(arrow_down);
				ghost_number.setIcon(four);
				PacMan.setGhostCount(4);
				if(skins_tab_open)
					{
					clyde_skin.setLocation(402, 567);
					clyde_skin.setIcon(clyde_skin_display);
					}
				}
			else
			if(PacMan.NUM_OF_GHOSTS == 2)	
				{
				ghost_number.setIcon(three);
				ghost_decrease.setIcon(arrow_down);
				PacMan.setGhostCount(3);
				if(skins_tab_open)
					{
					inky_skin.setLocation(326, 567);
					inky_skin.setIcon(inky_skin_display);
					}
				}	
			else
			if(PacMan.NUM_OF_GHOSTS == 1)	
				{
				ghost_number.setIcon(two);
				ghost_decrease.setIcon(arrow_down);
				PacMan.setGhostCount(2);
				if(skins_tab_open)
					{
					pinky_skin.setLocation(250, 567);
					pinky_skin.setIcon(pinky_skin_display);
					}
				}

			});
		ghost_increase.setLocation(385, 417);
		frame.add(ghost_increase);
			
		//This is a functional button that decreases the number of ghosts when clicked
		ghost_decrease.setOpaque(false);
		ghost_decrease.setContentAreaFilled(false);
		ghost_decrease.setBorderPainted(false);
		ghost_decrease.setFocusPainted(false);
		ghost_decrease.setBorder(BorderFactory.createEmptyBorder());
		ghost_decrease.setContentAreaFilled(false);
		ghost_decrease.setSize(50, 50);
		//This adds a glow-on-hover effect for the button
		ghost_decrease.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_GHOSTS != 1)
	    			{
		    		ghost_decrease.setIcon(arrow_down_glow);
	    			}
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    	if(PacMan.NUM_OF_GHOSTS != 1)
		    		{
		    		ghost_decrease.setIcon(arrow_down);
		    		}
		    	}
			});
		//This handles what happens when the button is actually pressed
		ghost_decrease.addActionListener(e ->
			{
			
			if(PacMan.NUM_OF_GHOSTS == 2)	
				{
				ghost_increase.setIcon(arrow_up);
				ghost_decrease.setIcon(blank);
				ghost_number.setIcon(one);
				PacMan.setGhostCount(1);
				pinky_skin.setLocation(1200, 540);
				inky_skin.setLocation(1200, 540);
				clyde_skin.setLocation(1200, 540);
				}
			
			if(PacMan.NUM_OF_GHOSTS == 3)	
				{
				ghost_number.setIcon(two);
				
				PacMan.setGhostCount(2);
				ghost_increase.setIcon(arrow_up);
				inky_skin.setLocation(1200, 540);
				clyde_skin.setLocation(1200, 540);
				}	
			
			if(PacMan.NUM_OF_GHOSTS == 4)	
				{
				ghost_number.setIcon(three);
				ghost_increase.setIcon(arrow_up);
				PacMan.setGhostCount(3);
				clyde_skin.setLocation(1200, 540);
				
				}
			
			});
		ghost_decrease.setLocation(385, 464);
		frame.add(ghost_decrease);
			

		
//This is a functional button that will start the game with the currently configured settings
		JButton start_button = new JButton(start);
		
		start_button.setOpaque(false);
		start_button.setContentAreaFilled(false);
		start_button.setBorderPainted(false);
		start_button.setFocusPainted(false);
		start_button.setBorder(BorderFactory.createEmptyBorder());
		start_button.setContentAreaFilled(false);
		start_button.setSize(236, 61);
		start_button.setLocation(131, 540);
		//This just adds a nice glow-on-hover effect for the start button
		start_button.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    	start_button.setIcon(start_glow);
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    	start_button.setIcon(start);
		    	}
			});
		//This is what happens when the start button is actually pressed
		start_button.addActionListener(e ->
			{
			game_has_been_set_up = true;
			PacManWithUI.main(null);//This runs the PacManWithUI.java
			frame.dispose();//This closes the setup menu
			});
		frame.add(start_button);		

		
		
//This is a functional button
		JButton skins_button = new JButton(skins);
		
		skins_button.setOpaque(false);
		skins_button.setContentAreaFilled(false);
		skins_button.setBorderPainted(false);
		skins_button.setFocusPainted(false);
		skins_button.setBorder(BorderFactory.createEmptyBorder());
		skins_button.setContentAreaFilled(false);
		skins_button.setSize(236, 61);
		skins_button.setLocation(131, 485);
		//This just adds a nice glow-on-hover effect for the start button
		skins_button.addMouseListener(new java.awt.event.MouseAdapter() 
			{
		    public void mouseEntered(java.awt.event.MouseEvent evt) 
		    	{
		    	skins_button.setIcon(skins_glow);
		    	}

		    public void mouseExited(java.awt.event.MouseEvent evt) 
		    	{
		    	skins_button.setIcon(skins);
		    	}
			});
		//This is what happens when the skins button is actually pressed
		skins_button.addActionListener(e ->
			{
			frame.setSize(514, 853);
			frame.remove(background);
			frame.add(background_2);
			start_button.setLocation(131, 728);
			
			skins_tab_open = true;
			
			p1_skin.setLocation(20, 577);
			p1_increase.setLocation(37, 515);
			p1_decrease.setLocation(37, 665);
			
			if(PacMan.NUM_OF_PLAYERS == 2)
				{
				p2_skin.setLocation(95, 577);
				}
			p2_increase.setLocation(112, 515);
			p2_decrease.setLocation(112, 665);
			
			blinky_skin.setLocation(172, 567);
			blinky_increase.setLocation(187, 515);
			blinky_decrease.setLocation(187, 665);
			
			if(PacMan.NUM_OF_GHOSTS == 2)
				{
				pinky_skin.setLocation(250, 567);
				}
			pinky_increase.setLocation(265, 515);
			pinky_decrease.setLocation(265, 665);
			
			if(PacMan.NUM_OF_GHOSTS == 3)
				{
				inky_skin.setLocation(326, 567);
				pinky_skin.setLocation(250, 567);
				}
			inky_increase.setLocation(341, 515);
			inky_decrease.setLocation(341, 665);
			
			if(PacMan.NUM_OF_GHOSTS == 4)
				{
				inky_skin.setLocation(326, 567);
				pinky_skin.setLocation(250, 567);
				clyde_skin.setLocation(402, 567);
				}
			clyde_increase.setLocation(417, 515);
			clyde_decrease.setLocation(417, 665);
			
			frame.remove(skins_button);
			});
		frame.add(skins_button);					

		
	//Some final JFrame setup -----------------------------------------------------------------------------
	frame.add(background);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	frame.setVisible(true);		
	java.awt.Image icon = new javax.swing.ImageIcon("src/sim/app/pacman/images/blinkyd.png").getImage();
	frame.setIconImage(icon);
	frame.setSize(514, 665);
	frame.setLocationRelativeTo(null);
	}
}
