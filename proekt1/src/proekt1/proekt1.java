import java.util.Scanner;
public class proekt1 { 
	public static void main (String[] args) {
		int a, b, c ;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Vnesi gi vrednost za A:");
		System.out.println("Vnesi gi vrednost za B:");
		System.out.println("Vnesi gi vrednost za C:");
		a = tastatura.nextInt();
		b = tastatura.nextInt();
		c = tastatura.nextInt();
		if(a+b>c && b+c>a) {
			System.out.println("So dodenite strani se formira triagolnikot. ") ;
		}else {
			System.out.println("So dodenite strani ne se formira traigolnikot.");
			Szstem.exit(0);
			
		}
	}
	
}


 