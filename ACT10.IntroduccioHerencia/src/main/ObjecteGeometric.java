package main;

public class ObjecteGeometric {
	
	private float x;
	private float y;
	private String color;
	
	public ObjecteGeometric(float x, float y, String color){
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString(){
		return "Posici� x: "+this.x+" | Posici� y : "+this.y+" | Color : "+this.color;
	}

}
