package main;

public class MainProves {

	public static void main(String[] args) {
		
		Cercle crc1 = new Cercle(1f,1f,"Negre",2.3f);
		Cercle crc2 = new Cercle(3.1f,5.5f,"Blau",6.63f);
		Quadrat qua1 = new Quadrat(1.8f,3f,"Groc",4.4f);
		Quadrat qua2 = new Quadrat(1.1f,6.7f,"Verd",2.77f);
		
		// Area i perimetre de tots:
		System.out.println(crc1.toString());
		System.out.println(crc1.area());
		System.out.println(crc1.perimetre());
		
		System.out.println(crc2.toString());
		System.out.println(crc2.area());
		System.out.println(crc2.perimetre());
		
		System.out.println(qua1.toString());
		System.out.println(qua1.area());
		System.out.println(qua1.perimetre());
		
		System.out.println(qua2.toString());
		System.out.println(qua2.area());
		System.out.println(qua2.perimetre());
		
	}

}
