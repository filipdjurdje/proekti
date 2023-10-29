package triagolnik;
import java.util.Scanner;
public class Triagolnik {
public static void main(String[] args) {
int a, b ,c;
Scanner tastatura = new Scanner(System.in);
System.out.println("Vnesi vrednost za A");
a=tastatura.nextInt();
System.out.println("Vnesi vrednost za B");
b=tastatura.nextInt();
System.out.println("Vnesi vrednost za C");
c=tastatura.nextInt(); 
if (a+b>c && b+c>a && a+c>b) {
System.out.println("Moze da se formira triagolnik");
} else { 
System.out.println("Ne moze da se formira triagolnik");
}

{
if (a*a + b*b == c*c && a*a + c*c == b*b && b*b + c*c == a*a);
System.out.println("Triagolnikot e pravoagolen");
}

{
 if (a*a + b*b > c*c && a*a + c*c > b*b && b*b + c*c > a*a);
System.out.println("Triagolnikot e ostroagolen");
}

 {
System.out.println("Triagolnikot e tapoagolen");
	
	
}
}
}

