package be.ac.umons.stratego.graphic;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


@SuppressWarnings("serial")
public class PanelOption extends JPanel 
{
		//...........................................
		//Permet de placer l'image dans la fenêtre
		//...........................................
		
		/**
	 * 
	 */

		public void paintComponent( Graphics g)
		{
			try
			{
				
			Image image= ImageIO.read(new File("stratego.png"));
			g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);

			}
			
			catch ( IOException e)
			{
				System.out.println("option pas lancer");
			}
				
		}

	}
