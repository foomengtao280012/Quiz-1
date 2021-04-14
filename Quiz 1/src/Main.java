public class Main {
	
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		
		phone1.setBrand();
		phone1.setModel();
		phone1.setOS();
		phone1.setRAM();
		phone1.setWeight();
		
		System.out.println("\n=======Phone1=======");
		System.out.println("Brand: " + phone1.getBrand());
		System.out.println("Model: " + phone1.getModel());
		System.out.println("OS: " + phone1.getOS());
		System.out.println("RAM: " + phone1.getRAM() +"GB");
		System.out.println("Weight: " + phone1.getWeight() +"g");
		
		Phone phone2 = new Phone();
		phone2.setBrand();
		phone2.setModel();
		phone2.setOS();
		phone2.setRAM();
		phone2.setWeight();
		
		System.out.println("\n=======Phone2=======");
		System.out.println("Brand: " + phone2.getBrand());
		System.out.println("Model: " + phone2.getModel());
		System.out.println("OS: " + phone2.getOS());
		System.out.println("RAM: " + phone2.getRAM() +"GB");
		System.out.println("Weight: " + phone2.getWeight() +"g");

	}

}
