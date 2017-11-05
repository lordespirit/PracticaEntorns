package main;

public class Quadrat extends ObjecteGeometric {

	private float costat;
	
	public Quadrat(float x, float y, String color, float costat) {
		super(x, y, color);
		this.costat=costat;
	}
	
	public float perimetre(){
		return 4*costat;
	}
	
	public float area(){
		return costat*costat;
	}
	
	@Override
	public String toString(){
		return "*Quadrat* "+" | Costat : "+this.costat+" | "+super.toString();
	}
	

}
