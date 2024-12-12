
public class Turista extends SuperTurista {
	
	private Maleta maleta1;
	private Maleta maleta2;
	
	
	public Maleta getMaleta1() {
		return maleta1;
	}
	public void setMaleta1(Maleta maleta1) {
		this.maleta1 = maleta1;
	}
	public Maleta getMaleta2() {
		return maleta2;
	}
	public void setMaleta2(Maleta maleta2) {
		this.maleta2 = maleta2;
	}
		
	public Turista(String nombre) {
		this.setNombre(nombre);
	}	

	public double sumaPeso() {
		double sumaPeso=0;
		if(maleta1!=null)
			sumaPeso=sumaPeso+maleta1.getPeso();
		if (maleta2!=null)
			sumaPeso=sumaPeso+maleta2.getPeso();
		return sumaPeso;
	}
	public double sumaPeso(double sobrePeso) {		
		return sumaPeso()+sobrePeso;
	}
	public double sumaPeso(String tipoCarcasa) {
		double sumaPeso=sumaPeso();
		if(tipoCarcasa.equals("ligera")){
			sumaPeso=sumaPeso+2;
		}else {
			sumaPeso=sumaPeso+4;
		}
		return sumaPeso;
	}
}