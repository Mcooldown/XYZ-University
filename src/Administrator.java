import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Administrator extends Karyawan{
	
	private String title;
	Scanner scan = new Scanner(System.in);

	public Administrator(String name, String address, String phone_number, String email, String office_location,
			int salary, Date date, String title) {
		super(name, address, phone_number, email, office_location, salary, date);
		this.title = title;
	}

	public String toString() {
		return "Administrator "+this.getName();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void menu() {
		int menu = -1;
		do{
			clear();
			System.out.println("Current User: Administrator");
			System.out.println("1.Profile");
			System.out.println("2.Add Mahasiswa");
			System.out.println("3.Add Dosen");
			System.out.println("4.Add Administrator");
			System.out.println("5.List All Mahasiswa");
			System.out.println("6.List All Dosen");
			System.out.println("7.List All Administrator");
			System.out.println("8.List All User");
			System.out.println("9.Change User");
			System.out.print("Choose >>");

			try {
				menu = scan.nextInt();				
			} catch (Exception e) {
				menu=-1;
			}
			scan.nextLine();

			String name=null;
			String address = null;
			String email = null;
			String phone_number= null;
			int year =-1;
			int hours= -1;
			String academic_level = null;
			String office_location = null;
			int salary =-1;
			String title = null;
			boolean check = false;

			switch(menu){
			case 1:
				clear();
				System.out.println("Profile");
				System.out.println("Nama: "+ super.getName());
				System.out.println("Address: "+ super.getAddress());
				System.out.println("Phone Number: "+ super.getPhone_number());
				System.out.println("Email: "+ super.getEmail());
				System.out.println("Title: "+ getTitle());
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;

			case 2:
				clear();
				System.out.print("Enter name:");
				name= scan.nextLine();
				System.out.print("Enter address:");
				address= scan.nextLine();
				do {
					System.out.print("Enter phone number: ");
					phone_number = scan.nextLine();
				}while(!phone_number.matches("[0-9]+") || phone_number.length()!=12);
				
				System.out.print("Enter email: ");
				email = scan.nextLine();
				
				do{
					System.out.print("Enter year: ");
					try {
						year = scan.nextInt();
					} catch (Exception e) {
						year= -1;
					}
					scan.nextLine();
				}while(year<2015 || year>2020);
				
				Main.UserList.add(new Mahasiswa(name,address,phone_number,email,year));
				System.out.println("New Mahasiswa Added");
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
				
			case 3:
				clear();
				System.out.print("Enter name:");
				name= scan.nextLine();
				System.out.print("Enter address:");
				address= scan.nextLine();
				do {
					System.out.print("Enter phone number: ");
					phone_number = scan.nextLine();
				}while(!phone_number.matches("[0-9]+") || phone_number.length()!=12);
				
				System.out.print("Enter email: ");
				email = scan.nextLine();
				
				do{
					System.out.print("Enter Teaching Hours: ");
					try {
						hours = scan.nextInt();
					} catch (Exception e) {
						hours=-1;
					}
					scan.nextLine();
				}while(hours<0);
				
				do{
					System.out.print("Enter academic level: ");
					academic_level = scan.nextLine();					
				}while(!academic_level.equals("Asisten Ahli") && !academic_level.equals("Lektor") && !academic_level.equals("Lektor Kepala") && !academic_level.equals("Professor"));
				
				do{
					System.out.println("Enter office location: ");
					office_location = scan.nextLine();
				}while(!office_location.equals("Kemanggisan") && !office_location.equals("Alam Sutra") && !office_location.equals("Malang")&& !office_location.equals("Bandung")&& !office_location.equals("Bekasi"));
				
				do{
					System.out.print("Enter Salary: ");
					try {
						salary = scan.nextInt();
					} catch (Exception e) {
						salary=-1;
					}
					scan.nextLine();
					
				}while(salary<0);
				
				Calendar c = Calendar.getInstance(); 
				
				Main.UserList.add(new Dosen(name,address,phone_number,email,office_location,salary,
						c.getTime(),hours,academic_level));
				System.out.println("New Dosen Added");
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			
			case 4:
				clear();
				System.out.print("Enter name:");
				name= scan.nextLine();
				System.out.print("Enter address:");
				address= scan.nextLine();
				do {
					System.out.print("Enter phone number: ");
					phone_number = scan.nextLine();
				}while(!phone_number.matches("[0-9]+") || phone_number.length()!=12);
				
				System.out.print("Enter email: ");
				email = scan.nextLine();
				
				do{
					System.out.print("Enter title: ");
					title = scan.nextLine();
					title = title.trim();
					
				}while(!title.equals("Manager") && !!title.equals("Supervisor") && !title.equals("Staff") && !title.equals("Direksi") && !title.equals("Kepala Divisi"));
				
				do{
					System.out.println("Enter office location: ");
					office_location = scan.nextLine();
				}while(!office_location.equals("Kemanggisan") && !office_location.equals("Alam Sutra") && !office_location.equals("Malang")&& !office_location.equals("Bandung")&& !office_location.equals("Bekasi"));
				
				
				do{
					System.out.print("Enter Salary: ");
					try {
						salary = scan.nextInt();
					} catch (Exception e) {
						salary=-1;
					}
					scan.nextLine();
					
				}while(salary<0);
				
				c = Calendar.getInstance(); 
				
				Main.UserList.add(new Administrator(name,address,phone_number,email,office_location,salary,
						c.getTime(),title));
				System.out.println("New Administrator Added");
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
				
			case 5:
				clear();
				check=false;
				for (int i = 0; i < Main.UserList.size(); i++) {
					if(Main.UserList.get(i) instanceof Mahasiswa){
						System.out.println(Main.UserList.get(i).getName() + " - " + ((Mahasiswa)Main.UserList.get(i)).getYear());
						check=true;
					}
				}
				if(check==false){
					System.out.println("Tidak ada Mahasiswa..");
				}
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			case 6:
				clear();
				check=false;
				for (int i = 0; i < Main.UserList.size(); i++) {
					if(Main.UserList.get(i) instanceof Dosen){
						System.out.println(Main.UserList.get(i).getName()+ " - " + ((Dosen)Main.UserList.get(i)).getAcademic_level() + " - " + ((Dosen)Main.UserList.get(i)).getOffice_location());
					}
				}
				if(check==false){
					System.out.println("Tidak ada Dosen..");
				}
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			case 7:
				clear();
				for (int i = 0; i < Main.UserList.size(); i++) {
					if(Main.UserList.get(i) instanceof Administrator){
						System.out.println(Main.UserList.get(i).getName()+ " - " + ((Administrator)Main.UserList.get(i)).getTitle() + " - " + ((Administrator)Main.UserList.get(i)).getOffice_location());
					}
				}
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			case 8:
				clear();
				for (int i = 0; i < Main.UserList.size(); i++) {
						System.out.println(Main.UserList.get(i).toString());
				}
				System.out.print("Press enter to continue");
				scan.nextLine();
				break;
			}
		}while(menu!=9);
	}

}
