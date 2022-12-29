package week2.day2assignments;

public class PrimeNumber {
	public void primeNo(int num) {
		// TODO Auto-generated method stub
    int i;
    for ( i=2;i<num;i++) {
    	int n=num%i;
    	if(n==0) {
    		System.out.println(num+ "is not a prime number");
    		break;
    	}
    }
        if(i==num) {
    		System.out.println(num+ "is a prime number");
    	}
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PrimeNumber obj=new PrimeNumber();
    obj.primeNo(11);
	}

}
