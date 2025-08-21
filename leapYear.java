package java_project;

public class leapYear {

	
	
	public static void leapYearOrNot() {
	int leapYear=1986;

    if (leapYear <= 0) {
        System.out.println("Invalid year");
    } else if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
        System.out.println("It is a leap year");
    } else {
        System.out.println("Not a leap year");
    }
	}
	
	public static void main(String args[]) {
		
		leapYearOrNot();
	}
}
