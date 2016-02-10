import java.util.Scanner;

public class InvestmentValue {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter investment amount: ");
      double investment = input.nextDouble();
      System.out.print("Enter annual interest rate in percentage: ");
      double interest = input.nextDouble();
      System.out.print("Enter number of years: ");
      int years = input.nextInt();
      
      double future_value = investment * 
              (Math.pow((1+(interest/1200)), (years * 12)));
      
      System.out.println("Accumulated value is $" + future_value);
  }    
}
