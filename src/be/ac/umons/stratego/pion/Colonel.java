package be.ac.umons.stratego.pion;

public class Colonel extends PionGeneral {

	public Colonel(int lvl, int posY, int posX , String equipe) {
		super(lvl, posY, posX, equipe);
        }

	public String toString() {
	        String a = "CO";
		if (this.equipe.equals("Friend"))
		        return a +"-F";
		else 
		        return a + "-E";
		
	}
}
