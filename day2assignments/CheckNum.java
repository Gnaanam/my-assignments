package week2.day2assignments;

public class CheckNum {
	public void posorNeg(int n) {
		// TODO Auto-generated method stub
    if (n>0) {
    	System.out.println(n+ " is a positive number");
    }
    else if(n<0) {
    	System.out.println(n+ " is a negative number");
    }
    else {
    	System.out.println(n+ " is neither negative nor positive");
    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CheckNum obj=new CheckNum();
     obj.posorNeg(0);
	}

}
