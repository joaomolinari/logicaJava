package exemplosAulas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  
	  
	  
		public class AWTExample1 extends Frame {    
	  
	   AWTExample1() {  
		   
		   addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
	  
	      Button b = new Button("Clique aqui!!"); 
	      
	      // x30, y100, alt80, largura30
	      b.setBounds(30,100,80,30);  
	  
	      // adding button no frame    
	      add(b);  
	  
	      // frame size 300 width and 300 height    
	      setSize(300,300);  
	  
	      setTitle("Exemplo frame");   
	   
	      setLayout(null);   
	     
	      setVisible(true);  
	}    
	  
	public static void main(String args[]) {   
	  
	AWTExample1 f = new AWTExample1();    
	  
	}  
	  
	}    


