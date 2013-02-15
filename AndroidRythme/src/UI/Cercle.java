package UI;

public class Cercle {

	private int rayon;
	private int x; 
	private int y; 


	public Cercle(){
		rayon=0;
		x=0; 
		y=0;
	}

	public Cercle(int x, int y,int rayon){
		this.rayon = rayon;
		this.x=x;
		this.y=y;
	}

	public Cercle(int rayon ){
		this.rayon = rayon;		 
	}


	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
