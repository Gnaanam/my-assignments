package week2.day2assignments;

public class NegtoPos {
	public void enterVal(int n) {
		if (n>0) {
	    	System.out.println(n+ " is a positive number");
	    }
	    else if(n<0) {
	    	int r;
	    	System.out.println(n+ " is a negative number");
	    	r=n*(-1);
	    	System.out.println(n+ " is converted to " +r);
		// TODO Auto-generated method stub
	    }
	    else {
	    	System.out.println(n+ " is equal to zero");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NegtoPos obj=new NegtoPos();
    obj.enterVal(-11);
    
    }
	}

	

