
public class ElektirikselYük {

	int q1;
	int q2;
	int d;
	int s;
	
	public ElektirikselYük (int a) {
		this.d=a;
	}
	
	public ElektirikselYük (int a, int b) {
		this(a);
		this.q1=b; // overloding Bro XD
	}
	
	public ElektirikselYük (int a, int b , int c ) {
		this(a,b);
		this.q2=c; // last overloding Bro XD
	}
	
 void Hesapla() {
	 
	s=q1*q2/d*d; 
	 
	 
	 System.out.print(s);
	 
	 
 }
	
	
}
