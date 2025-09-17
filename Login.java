import java.util.Scanner;
public class Login{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
    String result = "";
  
  System.out.print("Enter username: ");
  String username = scanner.nextLine();
  
  System.out.print("Enter password: ");
  String password = scanner.nextLine();
  
  if(username.equals("admin") && password.equals("password123")){
   System.out.println("Ok");
   result = "Success";
  } else {
   System.out.println("Invalid username or password.");
  }
  
  scanner.close();
 }
}   