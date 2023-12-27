import java.util.Scanner;

public class OnlineReservationSystem 
{
public static void setScanner(Scanner scanner) {
	OnlineReservationSystem.scanner = scanner;
}
private static String username="Renuka";
private static String password="pass@123";

private static Scanner scanner=new Scanner(System.in);

public static void main(String[]args)
{
	ReservationDetails r1=new ReservationDetails("a123","vande bharat",123);
	System.out.println(r1);

login();
}
private static void login()
{
	System.out.println("First login to your account");
	System.out.println("Enter Username:");
	String enteredUsername=scanner.nextLine();
	
	System.out.println("Enter password: ");
	String enteredPassword=scanner.nextLine();
	
	if(enteredUsername.equals(username) && enteredPassword.equals(password))
{
	System.out.println("Login Successfull!");
	showMainMenu();
}
else
{
	System.out.println("Invalid credentials.please enter correct information.");
}
	
}
private static void showMainMenu()
{
	System.out.println("1:Reversation");
	System.out.println("2:cancellation");
	System.out.println("3:exit");
	System.out.println("Enter your Choice:");
	
	int choice=scanner.nextInt();
	
	switch(choice)
	{
	case 1:makeReservation();
	System.out.println("Enter the train name:");
	break;
	case 2:cancelReservation();
	break;
	case 3:System.out.println("Exiting program.Goodbye!");
	System.exit(0);
	break;
	default:
		System.out.println("invalid choice.please try again.");
		showMainMenu();
	}
}
private static void cancelReservation() {
	System.out.println("your reservation is cancelled");
	
}
private static void makeReservation()
{
	System.out.println("your reservation is made");
}	
}

