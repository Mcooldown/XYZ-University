import java.util.Date;

public abstract class Karyawan extends Orang{

	protected String office_location;
	protected int salary;
	protected Date date;

	public Karyawan(String name, String address, String phone_number, String email, String office_location, int salary,
			Date date) {
		super(name, address, phone_number, email);
		this.office_location = office_location;
		this.salary = salary;
		this.date = date;
	}
	
	public String getOffice_location() {
		return office_location;
	}

	public void setOffice_location(String office_location) {
		this.office_location = office_location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
