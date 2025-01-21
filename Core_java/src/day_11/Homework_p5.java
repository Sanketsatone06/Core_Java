package day_11;

public class Homework_p5 {
	
	private String company_name;
	private String model_name;
	private int car_year;
	private int car_milage;
	
	
	public void setCompany_name(String company_name) {
		this.company_name=company_name;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setModel_name(String model_name) {
		this.model_name=model_name;
	}
	
	public String getModel_name() {
		return model_name;
	}
	
	public void setCar_year(int car_year) {
		this.car_year=car_year;
	}
	public int getCar_year() {
		return car_year;
	}
	
	public void setCar_milage(int car_milage) {
		this.car_milage = car_milage;
	}
	public int getCar_milage() {
		return car_milage;
	}

	public static void main(String[] args) {
		
		Homework_p5 obj = new Homework_p5();
		
		obj.setCompany_name("ford");
		obj.setModel_name("Endever");
		obj.setCar_year(1999);
		obj.setCar_milage(15);
		
		System.out.println("company name : " +obj.getCompany_name());
		System.out.println("Model_name : " + obj.getModel_name());
		System.out.println("Car_year : " + obj.getCar_year());
		System.out.println("Car_milage : "+ obj.getCar_milage());
	}

}
