import java.util.Date;
import java.util.Scanner;

public class Dosen extends Karyawan{
	
	Scanner scan = new Scanner(System.in);
	private int teaching_hours;
	private String academic_level;
	
	public Dosen(String name, String address, String phone_number, String email, String office_location, int salary,
			Date date, int teaching_hours, String academic_level) {
		super(name, address, phone_number, email, office_location, salary, date);
		this.teaching_hours = teaching_hours;
		this.academic_level = academic_level;
	}
	
	public String toString() {
		  return "Dosen "+this.getName();
		}

	public int getTeaching_hours() {
		return teaching_hours;
	}

	public void setTeaching_hours(int teaching_hours) {
		this.teaching_hours = teaching_hours;
	}

	public String getAcademic_level() {
		return academic_level;
	}

	public void setAcademic_level(String academic_level) {
		this.academic_level = academic_level;
	}

	@Override
public void menu() {
		
		int menu = -1;
		do{
			clear();
			System.out.println("Current User: Dosen");
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
				System.out.println("Teaching Hours: "+ getTeaching_hours());
				System.out.println("Academic Level: "+ getAcademic_level());
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
