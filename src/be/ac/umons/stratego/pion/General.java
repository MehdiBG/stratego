package be.ac.umons.stratego.pion;

public class General extends PionGeneral {

	public General (int lvl, int posY, int posX , String equipe) {
		super(lvl, posY, posX, equipe);
        }

	public String toString() {		
		String a = "G";
		if (this.equipe=="Friend" )
		        return a +"-F";
		else 
		        return a + "-E";
	}
}