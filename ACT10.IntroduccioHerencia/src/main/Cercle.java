package main;

public class Cercle extends ObjecteGeometric {

	private float radi;
	
	public Cercle(float x, float y, String color,float radi) {
		super(x, y, color);
		this.radi = radi;
	}
	
	public float perimetre(){
	 return (float) Math.PI*2*radi;	
	}
	
	public float area(){
		return (float) Math.PI*(radi*radi);
	}
	
	@Override
	public String toString(){
		return "*Cercle* "+" | Radi : "+this.radi+" | "+super.toString();
	}
	
}
