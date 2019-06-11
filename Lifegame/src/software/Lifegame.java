package software;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;




public class Lifegame extends Applet implements Runnable,MouseListener,MouseMotionListener,KeyListener{
	private int interval = 500;
	boolean flag = false;
	Color live = Color.cyan;
	Color dead = Color.white;
	MyThread t;
	Map m = new Map();
 
	class MyThread extends Thread {
		long time = System.currentTimeMillis();
		
	     public void run( ) {
	         while(Thread.currentThread()==t){
	        	 if(flag == true){
	        		 getlifenumber();
	        		 newmap();
	        		 repaint();
	        		 time+=interval;
	        		 try {
						t.sleep(time-System.currentTimeMillis()>0?time-System.currentTimeMillis():0);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	        		 
	        	 }
	        	 else{
	        		 System.out.println("");
	        	 }
	         }  	 
	      }
	 }
    @Override public void init()  {
    	t = new MyThread();     
    	flag = false;    
//
    	setBackground(Color.yellow);        
    	setBackground(new Color(199,237,204));        
    	addMouseListener(this);        
    	addMouseMotionListener(this);        
    	addKeyListener(this);
    }
    @Override public void start() {        
    t.start();
    }
    @Override public void stop()    {
    	t=null;
          

    }
    @Override public void paint(Graphics g) {
       setSize(1000, 1000);
       setLocation(100, 100);
   		//System.out.println(this.getSize());
   		//System.out.println(this.getLocation());
       update(g);


    }

    

    @Override public void update(Graphics g) {
    	m.updateMap(g);
    }


    public void getlifenumber() { 
    		m.getlifenumber();
    }


    public void newmap() {
    	m.newmap();
    	
    	
    	
    }

    public void mouseClicked(MouseEvent e){ 
    	
    	
    	
    }   

    public void mousePressed(MouseEvent e){
    	int tx = e.getX()/m.getgridsize();
        int ty = e.getY()/m.getgridsize();
        m.map[tx+1][ty+1] = 1;
        repaint();

    }

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mouseDragged(MouseEvent e){
    	this.mousePressed(e);

    }

    public void mouseMoved(MouseEvent e){}     

    public void keyTyped(KeyEvent e){}

    public void keyPressed(KeyEvent e){
    	if(e.getKeyChar()==' '){

    		flag = !flag;
            repaint();

        }

    }

    public void keyReleased(KeyEvent e){}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
