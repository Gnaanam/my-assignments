package week2.day2assignments;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int range=8,firstnum=0,secondnum=1,sum;
    for(int i=1;i<range;i++) {
    	System.out.println(firstnum);
    	sum=firstnum+secondnum;
    	firstnum=secondnum;
    	secondnum=sum;
    	
    }
	}
	

}
