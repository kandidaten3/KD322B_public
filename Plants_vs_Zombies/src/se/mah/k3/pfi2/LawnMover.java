package se.mah.k3.pfi2;

public class LawnMover {

	private int positionX;
	private int positionY;
	

	public LawnMover(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}



	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public int getPositionX() {
		return positionX;
	}



	public void isItTimeToAct() {
		positionX = positionX+1;
		positionY = positionY+2;
		
	}

}

