import java.util.Scanner;
public class Login{
    String result = "";
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter username: ");
  String username = scanner.nextLine();
  
  System.out.print("Enter password: ");
  String password = scanner.nextLine();
  
  if(username.equals("admin") && password.equals("password123")){
   System.out.println("Ok");
  } else {
   System.out.println("Invalid username or password.");
  }
  
  scanner.close();
 }
}   