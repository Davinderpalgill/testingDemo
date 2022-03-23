import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(LocalDate.now());
		 LocalDate newDate2 =  LocalDate.now().plusDays(7);  
		
	        System.out.println(newDate2+" is a day after adding 7 day to the current date");  

	}

}
