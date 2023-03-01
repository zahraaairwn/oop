import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(Sstem.in);
		
		Sstem.out.print("Enter number of data: ");
		int numdata = scanner.nextInt();
		
		Marks marks = new Marks(numdata);
		marks.createData();
		PrincipalName principalName = new PrincipalName("Fatin", "Farzanah");
		Address address = new Address("No 13", "71760", "Bandar Enstek", "Negeri Sembilan");
		School school = new School("Sk Super", address , principalName, marks);
	
		school.setNumberParticipants();
		System.out.println(school.toString());
		System.out.printf("Average Score     : %.2f", marks.average());
		System.out.printf("\nStandard Deviation: %.2f", marks.stanDev(marks.average()));
	}
}
