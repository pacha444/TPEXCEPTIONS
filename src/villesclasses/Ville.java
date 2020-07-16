package villesclasses;
import mesexceptions.NombreHabitantException;


public class Ville {
	
	private String nomVille;
	private String nomPays;
	private int nbrehbts;
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public int getNbrehbts() {
		return nbrehbts;
	}
	public void setNbrehbts(int nbrehbts) {
		this.nbrehbts = nbrehbts;
	}
	public Ville(String pNom, String pPays, int pNbre) throws NombreHabitantException {
		super();
		this.nomVille = pNom  ;
		this.nomPays = pPays  ;
		this.nbrehbts = pNbre;
		 if(pNbre < 0)
		 {
		      throw new NombreHabitantException();
		 }   
		    else
		    {
		   

		      nomVille = pNom;
		      nomPays = pPays;
		      nbrehbts = pNbre;
		     
		    }
	}
	
	
	
	
	

}
