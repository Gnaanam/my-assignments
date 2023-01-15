package Week4day2;

public class LearnString {

	public static void main(String[] args) {
		String name="Deivanai";
		char[] charArray = name.toCharArray();
		//for(int i=charArray.length-1;i>=0;i--) {
			//System.out.print(charArray[i]);
		int count=0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='a') {
				count++;
				}
		}
		System.out.println(count);
		
	}
}
