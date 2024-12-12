import java.util.ArrayList;
import java.util.Iterator;

public class Cie2 {

	public static void main(String[] args) {
		TuristaRico pepito=new TuristaRico("Pepito");
		Maleta m1= new Maleta("Sansonite",10);
		Maleta m2= new Maleta("Benzi",5);
		
		pepito.addMaleta(m1);
		pepito.addMaleta(m2);
		
		ArrayList<Maleta> maletas= pepito.getMaletas();
		
		Iterator<Maleta> it=maletas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getModelo());
		
		}
		Iterator<Maleta> it1=maletas.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next().getPeso());
		
}
}
}