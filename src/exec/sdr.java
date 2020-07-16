package exec; 
import villesclasses.*;
import mesexceptions.NombreHabitantException; 



public class sdr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v = null;
		try {
			int nbreh=0;
			
			if(nbreh<=0)
			{
				throw new NombreHabitantException();  
			}
			else
			{
				v= new Ville("Dakar", "Senegal", nbreh);
				 System.out.println("ne"+v.toString());
			}
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
			   System.out.println(v.toString());
		}
    
	}

}
