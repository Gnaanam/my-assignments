package week2.day2assignments;

public class Palindrome {
	public void palin() {
		// TODO Auto-generated method stub
		int temp,sum=0,r;	    
	    int n=454;
	    temp=n;
	    while(n>0) {
	    	r=n%10;
	    	sum=(sum*10)+r;
	    	n=n/10;
	    }
	    if (temp==sum) 
	    	System.out.println(temp+ " is a palindrome number");
	    
	    else 
	    	System.out.println(temp+ " is not a palindrome number");
	} 
		
	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.palin();
	}
}

	         
