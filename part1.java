import java.util.Scanner;

public class part1{
public static void main (String [] args){

Scanner scanner = new Scanner (System.in);
String firstName;
String middleName;
String lastName;
String fullname;

System.out.println("Enter your first name: ");
firstName = scanner.nextLine();

System.out.println("Enter your middle name: ");
middleName = scanner.nextLine();

System.out.println("Enter your last name: ");
lastName = scanner.nextLine();

System.out.printf("%s %s %s \n" , firstName,middleName,lastName);




}
}


