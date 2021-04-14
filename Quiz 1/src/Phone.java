import java.util.Scanner;

public class Phone {
	Scanner scan = new Scanner(System.in);
	String brand, os, model;
	int ram;
	double weight;
	
		public void setBrand() {
			System.out.print("Please enter the brand of the phone> ");
			this.brand = scan.next();
		}
		
		public void setModel() {
			System.out.print("Please enter the model of the phone> ");
			this.model = scan.next() + scan.nextLine();
		}
	
		public void setOS() {
			System.out.print("Please enter the operating system of the phone> ");
			this.os = scan.next();
		}
		
		public void setRAM() {
			System.out.print("Please enter the RAM size of the phone> ");
			this.ram = scan.nextInt();
		}
		
		public void setWeight() {
			System.out.print("Please enter the weight of the phone> ");
			this.weight = scan.nextDouble();
		}
		
		public String getBrand() {
			return this.brand;
		}
		
		public String getModel() {
			return this.model;
		}
		
		public String getOS() {
			return this.os;
		}
		
		public int getRAM() {
			return this.ram;
		}
		
		public double getWeight() {
			return this.weight;
		}

}
