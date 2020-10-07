import java.util.Scanner;
 /**
 * Asks the user for a start and end value then prints out all even values between those values.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask the user to enter a start counting value
    System.out.println("What number do you want to begin counting from?");
    // create a variable for user input
    int startValue = input.nextInt();
    
    // ask the user to enter a value to stop at
    System.out.println("What number do you want to end counting at?");
    // create a variable for user input
    int endValue = input.nextInt();
    
    // repeats code until reaches endValue and adds 2 each time
    for(int count = startValue; count <= endValue; count+= 2){
      // if starting value is odd adds one
      if(count%2 == 1){
        count++;
      }
      // prints out values
      System.out.println(count);
    }
      
    
  }
}
 