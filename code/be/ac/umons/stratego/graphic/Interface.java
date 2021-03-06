package be.ac.umons.stratego.graphic;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Interface extends JFrame implements ActionListener
	{
		private Panneau emplacement1=new Panneau();
		//public final static DrawPlateau plateauGameGraphic= new DrawPlateau(new BaseBoard());
		private JButton bouton1 = new JButton("Jeu");
		private JButton bouton2 = new JButton("Option");
		private JButton bouton3 = new JButton("Quitter");
		
		public Interface()
		{
			this.setTitle("Bienvenue dans le Stratego");
			this.setSize(800,800);
			this.setLocationRelativeTo(null);
			
			//on prévient notre JFrame que ce sera notre Jpannel
			this.getContentPane().add(emplacement1);
			emplacement1.add(bouton1); // on ajoute les boutons au JPanel, ainsi l'image est sauvegarder
			emplacement1.add(bouton2);
			emplacement1.add(bouton3); 
			
			bouton1.addActionListener(this);
			bouton2.addActionListener(this); 
			bouton3.addActionListener(this); 
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public void actionPerformed(ActionEvent e)
		{
			if((JButton)e.getSource()==bouton1)
			{
				this.dispose();
				new BeforeGame();// permet de fermer la fenetre
				//new FenetreGame(new DrawPlateau(new BaseBoard()));
				//new FenetreGame(plateauGameGraphic);
			}
			else if ((JButton)e.getSource()==bouton3)
			{
				System.exit(0); // permet de quitter le programme définitevement
			}
			
			else {
				this.dispose();
				new WindowOption();
			}
				
		}
		
		
		public static void main(String argv[]){
			Interface fenetre = new Interface();
			
		}


	}
