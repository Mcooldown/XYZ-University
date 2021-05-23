import java.util.Scanner;

public class Mahasiswa extends Orang{
	
	Scanner scan = new Scanner(System.in);
	private int year;
	
	public Mahasiswa(String name, String address, String phone_number, String email, int year) {
		super(name, address, phone_number, email);
		this.year = year;
	}
	
	public String toString() {
		  return "Mahasiswa "+this.getName();
		}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void menu() {
		
		int menu = -1;
		do{
			clear();
			System.out.println("Current User: Mahasiswa");
			System.out.println("1.Profile");
			System.out.println("2.Change Address");
			System.out.println("3.Change phone number");
			System.out.println("4.Change Email");
			System.out.println("5.Change user");
			System.out.print("Choose >>");
				
			try {
				menu = scan.nextInt();				
			} catch (Exception e) {
				menu=-1;
			}
			scan.nextLine();
			
			switch(menu){
			case 1:
				clear();
				System.out.println("Profile");
				System.out.println("Nama: "+ super.getName());
				System.out.println("Address: "+ super.getAddress());
				System.out.println("Phone Number: "+ super.getPhone_number());
				System.out.println("Email: "+ super.getEmail());
				System.out.println("Year: "+ getYear());
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			case 2:
				clear();
				String new_address = null;
				System.out.print("Insert new address: ");
				new_address = scan.nextLine();
				super.setAddress(new_address);
				System.out.println("Address successfully changed!");
                scan.nextLine();
				break;
				
			case 3:
				clear();
				String new_number = null;
				do {
				System.out.print("Insert new phone number: ");
				new_number = scan.nextLine();
				}while(!new_number.matches("[0-9]+") || new_number.length()!=12);
				super.setPhone_number(new_number);
                System.out.println("Phone number successfully changed!");
                scan.nextLine();
				break;
			case 4:
				clear();
				String new_email = null;
				System.out.print("Insert new email: ");
				new_email = scan.nextLine();
				super.setEmail(new_email);
				System.out.println("Email successfully changed!");
                scan.nextLine();
				break;
			}
			
		}while(menu!=5);
		
		
	}

}
