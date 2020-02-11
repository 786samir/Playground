import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int N1= num/100;
        int N2 = num%10;
      int Add = N1+N2;
      System.out.println(Add);
       
	}
}