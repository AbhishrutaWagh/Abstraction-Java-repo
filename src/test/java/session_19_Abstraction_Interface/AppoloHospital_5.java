package session_19_Abstraction_Interface;

public class AppoloHospital_5 extends GlobalPatientData_6 implements USMedicale_2,UKMedicale_3,IndianMedicale_4{

	@Override
	public void polioServices() //from WHO interface  USMedicale_2
	{
		System.out.println("AppoloHospital......polioServices");
		
	}

	@Override
	public void emegergencyServices() {
		System.out.println("AppoloHospital......emegergencyServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("AppoloHospital......neuroServices");
	}

	@Override
	public void peditricServices() {
		System.out.println("AppoloHospital......peditricServices");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("AppoloHospital......ambulanceServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("AppoloHospital......ENTServices");
	}

	@Override
	public void physioServices() {
		System.out.println("AppoloHospital......physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("AppoloHospital......oncologyServices");
	}

	@Override
	public void orthopedicServices() {
		System.out.println("AppoloHospital......orthopedicServices");
	}

	@Override
	public void RadioLogyServices() {
		System.out.println("AppoloHospital......RadioLogyServices"); //from 1st interface(USMedicale_2) 
		                       //if we comment this method and try to call in TestHospital_7 with creating object of AppoloHospital_5
		                       //AppoloHospital_5 ref2=new AppoloHospital_5();
                              //ref2.RadioLogyServices();//RadioLogyServices  from GlobalPatientData
	}

	// non overridden methods: (Specialized methods of ApolloHospital)
		public void OPTServices() {
			System.out.println("Specialized in Apollo - OPTServices");
		}

		public void medicalInsurance() {
			System.out.println("Specialized in Apollo - medicalInsurance");
		}

		public void pathalogyServices() {
			System.out.println("Specialized in Apollo - pathalogyServices");
		}
	
	
	
	
	
	
	
}
