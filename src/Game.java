import javax.swing.*;
import javax.swing.text.Position;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 

	private Prey prey;	
	private ImageIcon background;
	private ArrayList<Predators> predators;
	private String modescreen = "start";
	//private ArrayList <Coins> coins;
	//new

	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		setBackground(getBackground());
		predators = setPreds();
		//coins=setCoins();
		background = new ImageIcon ("backgroundproj.gif");
		prey = new Prey(400,400, 70, 70);
	}

	
		private ArrayList<Predators> setPreds() {
			// TODO Auto-generated method stub
			ArrayList<Predators> temp = new ArrayList();
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					temp.add(new Predators(i*150, j*50));
					
				}
			}
			return temp;
		
	}


	

	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}


	
		  public int getRandomNumber() {
			return (int)(Math.random()*predators.size());
		}
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		
		
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
			Graphics g2d = back.createGraphics();

		
		g2d.clearRect(0,0,getSize().width, getSize().height);
		if(modescreen.equals("start")){
			g2d.drawImage(background.getImage(),  0,  0,  getWidth(),  getHeight(),  this);
			g2d.setFont(new Font("Baskerville Old Face", Font.BOLD, 45));
			g2d.setColor(Color.WHITE);
		g2d.drawString("Press Space to Start", 700, 600);
		} else if(modescreen.equals("play")){
			g2d.drawImage(prey.getShipImg().getImage(), prey.getX(), prey.getY(), prey.getW(), prey.getH(), this);
			drawPredators(g2d);
			movePredators();
		}
		
		
		twoDgraph.drawImage(back, null, 0, 0);
	}

		private boolean checkWall() {
			for(Predators inv : predators) {
				if(inv.getX()<0 || inv.getX()+inv.getW()>=1800) {
					return true;
			}
				
			}
			return false;
			
		}
		private void movePredators() {
			if(checkWall() == true) {
				for(Predators inv : predators) {
				
					inv.reverseHorz();
					inv.setY(inv.getY()+10);	
				}	
			}
			for(Predators inv : predators) {
				
				inv.Hmove();
			}
	}
private void drawPredators(Graphics g2d) {
			// TODO Auto-generated method stub
			for(Predators inv : predators) {
				g2d.drawImage(inv.getShipImg().getImage(), inv.getX(), inv.getY(), inv.getW(), inv.getH(), this);
			}
			}

	
					
		
	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//key= e.getKeyCode();
		//System.out.println(key);
		if(e.getKeyCode()==32){
			modescreen = "play";
		}
	}

	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		prey.setX(arg0.getX());
		prey.setY(arg0.getY());
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
}
	@Override
	public void mouseReleased(MouseEvent e) {
	}}