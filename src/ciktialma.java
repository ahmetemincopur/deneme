import java.util.Scanner;
import java.io.Reader;


public class ciktialma {

	
	public static void main(String[]Args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Bir sayı giriniz.:");
		int n= reader.nextInt();
		System.out.println(n);
		reader.close();
		ElektirikselYük Omer = new ElektirikselYük(2,12,12);
Omer.Hesapla();
		
		
	}
}
