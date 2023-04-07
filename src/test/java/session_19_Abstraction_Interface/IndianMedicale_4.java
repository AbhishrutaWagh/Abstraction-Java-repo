package session_19_Abstraction_Interface;

public interface IndianMedicale_4 {
	
	public void emegergencyServices(); //abstract(prototype)method //can be overrriden

	public void neuroServices(); //abstract(prototype)method //can be overrriden

	public void peditricServices(); //abstract(prototype)method //can be overrriden
	
	public void RadioLogyServices(); //abstract(prototype)method //can be overrriden 
	                                  //[Common service also available in Us,Uk,Indiaa interfaces]
	
	public static void dengueServices() //static 
	{
		System.out.println("Indian --- dengueServices");
	}

	
	
	
	
	
	
	

}
