import java.util.ArrayList;

public class Cie00 {

	public static void main(String[] args) {
		TuristaRico pepito=new TuristaRico("Pepito");
		Maleta m1= new Maleta("Sansonite",10);
		Maleta m2= new Maleta("Benzi",5);
		
		pepito.addMaleta(m1);
		pepito.addMaleta(m2);
		
		ArrayList<Maleta> maletas= pepito.getMaletas();
		for (int i=0;i<maletas.size();i++) {
			Maleta maletaR=maletas.get(i);
			System.out.println(maletaR.getModelo());
			System.out.println(maletaR.getPeso());
			System.out.println("*********");
			System.out.println(maletas.get(i).getModelo());
			System.out.println(maletas.get(i).getPeso());
			System.out.println("************");
	}

}
}
