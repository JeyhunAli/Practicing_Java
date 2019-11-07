package AbstarctionTT;

public class DemoInterface implements Employees, Administrators  {

	public static void main(String[] args) {
	

	}

	@Override
	public void workHours() {
		System.out.println("total work hours ");
		
	}

	@Override
	public void vacationHours() {
		System.out.println("total vacation hours");
		
	}

	@Override
	public void teamBuilding() {
		System.out.println("teambuilding");
		
		
		
	}

}
