import java.utils.*;
public class Calculator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("enter first num: ");
    int x = scan.nextInt();
    System.out.println();
    System.out.print("enter second num: ");
    int y = scan.nextInt();
    System.our.println();
        System.out.print("enter opperation: ");
    int op = scan.next();
    System.our.println();

    if op.equals("+"){
      System.out.println("sum is "+x+y);
    }
  }

}
