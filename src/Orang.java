
public abstract class Orang {

	protected String name;
	protected String address;
	protected String phone_number;
	protected String email;
	
	public abstract void menu();
	
	public void clear(){
		for (int i = 0; i < 25; i++) {
			System.out.println("");
		}
	}
	
	public Orang(String name, String address, String phone_number, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
