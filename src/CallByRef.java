
public class CallByRef {
static int a;
static int b;
	public static int checks(CallByRef cs1){

	int k = a+b;
	return k;
	}
	
	public static void main(String[] args) {
	

	CallByRef cs2 = new CallByRef();
	CallByRef cs3 = new CallByRef();
	cs3.a = 10;
	cs3.b = 70;
	System.out.println(cs2.checks(cs3));
	
	int a[][] = new int[1][2];
	a[0][0]=1;
	a[0][1]=2;
	for(int[] k:a){
		for(int b:k){
		System.out.println(b);	
		}
	}
	}
}
