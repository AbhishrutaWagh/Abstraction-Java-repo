package session_19_Abstraction_Interface;

public class TestHospital_7 {
	
	public static void main(String[] args) {
		//USMedicale_2 ref=new USMedicale_2();  we cannot create object of interface
		
		AppoloHospital_5 ref=new AppoloHospital_5();
		
		ref.ambulanceServices();
		ref.emegergencyServices();
		ref.ENTServices();
		ref.medicalInsurance();//Specialized method of AppoloHospital_5
		ref.neuroServices();
		ref.oncologyServices();
		ref.OPTServices();//Specialized method of AppoloHospital_5
		ref.orthopedicServices();
		ref.pathalogyServices();//Specialized method of AppoloHospital_5
		ref.peditricServices();
		ref.physioServices();
		ref.polioServices();
		ref.RadioLogyServices();//AppoloHospital......RadioLogyServices//from 1st interface(USMedicale_2) which implements in AppoloHospital_5
		                         // i.e means here implements USMedicale_2,UKMedicale_3,IndianMedicale_4.... 1st interface(USMedicale_2)
		
		//System.out.println(ref.minFee);//10 //but this not proper way to call static (becaz interface's vaiable defaultly final and static)variable
		                        
		System.out.println(USMedicale_2.minFee); //this proper way to call static variable with help of classname(here interface Name) as reference //10 
	//	USMedicale_2.minFee=20; we cannot chage becaz interface's vaiable defaultly final..and final cannot be changable
		
		USMedicale_2.services_911();//this proper way to call static method with help of classname(here interface Name) as reference 
		
		ref.internship();  //US ...internship //USMedicale_2's default method.....inherited
		
		ref.getPatientHistory(); //GlobalPatientData -- getPatientHistory //getPatientHistory's method.....inherited
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		//-----------------------------------------Top/Up casting------------------------------------------------------------
		USMedicale_2 objRef=new AppoloHospital_5();  //all parent(USMedicale_2) method get
		objRef.internship();
		objRef.oncologyServices();
		objRef.orthopedicServices();
		objRef.physioServices();
		objRef.RadioLogyServices();//AppoloHospital......RadioLogyServices//from USMedicale_2
		objRef.polioServices();//WHO's method
	  
		//-----------------------------------------Down casting-----------------------------------------------------------------------
		
		//we cannot create object of interface (USMedicale_2)i.e why Down castingnot allowed
	//	AppoloHospital_5 objRe1f=new USMedicale_2();
		
//		
//		
//		AppoloHospital_5 ref2=new AppoloHospital_5();
//		ref2.RadioLogyServices();  //RadioLogyServices  from GlobalPatientData
//		               
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
