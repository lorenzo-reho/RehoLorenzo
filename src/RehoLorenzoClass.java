/*
 * RehoLorenzoClass
 * 
 * @author <b>Reho Lorenzo</b> <u>4CI</u> 04/05/2022
 * @version 1.0
 * 
 * <i>04/05/2022</i>
 * 
 * */
public class RehoLorenzoClass {
	
	/*
	 * Costruttore di RehoLorenzoClass
	 * 
	 * */
	
	public RehoLorenzoClass() {
		
	
	}
	
	/*
	 * 
	 * Metodo che calcola la sommatoria da f a 0
	 * 
	 * @param f valore max della sommatoria
	 * @return risultato della sommatoria
	 * 
	 * */
	// Sono stati individuati degli errori nel codice per il calcolo della sommatoria
	// sono stati corretti
	public int rehoMet(int f) {
		int r = 0;
		for(int i = f; i >= 0; i--)
			r += i;
		return r;
	}
	
	/*
	 * 
	 * Metodo main
	 * 
	 * */
	
	public static void main(String[] args) {
		RehoLorenzoClass rehoClass = new RehoLorenzoClass();
		System.out.println(rehoClass.rehoMet(5));
	}
}
