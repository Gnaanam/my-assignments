package week2.day2assignments;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] num1= {1,2,3,4,6,7,8};
    for (int i=1;i<num1.length;i++) {
    	if(num1[i-1]!=i) {
    		System.out.println(i);
    		break;
    	}
    	}
    }
    
	}


