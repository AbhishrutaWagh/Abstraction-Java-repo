package session_19_Abstraction_Interface;

public interface USMedicale_2 extends WHO_1{

	int minFee=10;  //by default interface's variables are static as well as final

	public void physioServices(); //abstract(prototype)method //can be overrriden

	public void oncologyServices();//abstract(prototype)method //can be overrriden

	public void orthopedicServices();//abstract(prototype)method //can be overrriden

	public void RadioLogyServices();//abstract(prototype)method //can be overrriden 
	                                 //[Common service also available in Us,Uk,Indiaa interfaces]

	//note:
	//cannot create object of interface
	//interface variables are static and final by default
	//only method decleration no method body ...called as abstact(prototype)method
	//cannot Create static abstract method in interface->..becaz we cannot override static method 
	//example: public static void testService();
	//from JDK 1.8 we can have static method in interface but with body
	//example:
	public static void services_911() //constant(static)
	{
		System.out.println("US Medicale service 911 toll free number");
	}

	//default method cannot be overrriden
	default void internship() //as we known there is no kind of default keyword to use with method as wel as variable in java
	                             //but in interface we can use default keyword for method but this method can't be ovrrriden
	{
		System.out.println("US ...internship");
	}



 //note:
	//inside interface we can't create method which having body..thats why interface provide 100% Abstraction.
	//ony this can we create->in interface we can create method with body only in case of static(from JDK 1.8)and default


}
