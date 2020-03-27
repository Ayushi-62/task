import java.util.Scanner;
public class Integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("enter no.:");
        int n = sc.nextInt();
        Integer obj=new Integer();
        obj.pint(n);
        
    }
    public void  pint(int n){
	         if(n>1){
		     System.out.println(n);
		     pint(n-1);
			 }
		     else
				 System.out.println("1");
			 
	}
}
