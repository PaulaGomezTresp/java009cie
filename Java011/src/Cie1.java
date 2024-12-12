import java.util.ArrayList;

public class Cie1 {

	public static void main(String[] args) {
		TuristaRico pepito=new TuristaRico("Pepito");
		Maleta m1= new Maleta("Sansonite",10);
		Maleta m2= new Maleta("Benzi",5);
		
		pepito.addMaleta(m1);
		pepito.addMaleta(m2);
		
		ArrayList<Maleta> maletas= pepito.getMaletas();
		
		//solo para ArrayList o parecidos
		//Se llama bucle for each
		for (Maleta m:maletas) {
			System.out.println(m.getModelo());
			System.out.println(m.getPeso());
			System.out.println("*********");
	}

}
}
