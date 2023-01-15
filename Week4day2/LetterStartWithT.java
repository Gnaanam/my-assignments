package Week4day2;

public class LetterStartWithT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input="Testleaf located in twin towers Tenambet";
    String[] split = input.split(" ");
    for(int i=0;i<split.length;i++) {
    	if(split[i].startsWith("T")||split[i].startsWith("t"))
    	{
    		System.out.println(split[i]);
    	}
    }
    		
	}

}
