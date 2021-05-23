import java.util.*;

public class Main implements Runnable{

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	public static Vector<Orang> UserList = new Vector<>();
	Vector<Thread> userThread = new Vector<>();

	public static void main(String[] args) {
		new Main();
	}
	public Main() {

		Calendar c= Calendar.getInstance();
		
//		INITIATE DUMMY DATA
		UserList.add(new Administrator("Vincent Hadinata","Jakarta", "081310450294", "vincent@gmail.com", "Kemanggisan",
				5000000, c.getTime(),"Supervisor"));
		UserList.add(new Administrator("Jennie Blackpink","Seoul", "080149823232", "jennie@gmail.com", "Alam Sutra",
				10000000, c.getTime(),"Manager"));

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		
		int randomAccount;
		int oldRandomAccount =2;
		while(UserList.isEmpty()==false){
			do{
				randomAccount = rand.nextInt(UserList.size());				
			}while(randomAccount == oldRandomAccount);
			UserList.get(randomAccount).menu();
			oldRandomAccount = randomAccount;
			
			System.out.println("User successfully changed");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}
		
	}

}





