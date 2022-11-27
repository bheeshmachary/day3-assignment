
public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1 ;
	double empcheck	= Math.floor(Math.random() * 10) % 2;
	if (empcheck == IS_FULL_TIME)
		System.out.println("Employee is present");
	else
		System.out.println("Employee is absent");			
	}
}
