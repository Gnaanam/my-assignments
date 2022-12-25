package week1.day1assignments;

public class Calculator {
	public int add(int a,int b) {
		// TODO Auto-generated method stub
       return(a+b);
	}
    public int add1(int a,int b,int c) {
		// TODO Auto-generated method stub
        return(a+b+c);
	}
    public int mul(int a,int b) {
		// TODO Auto-generated method stub
         return(a*b);
	}
    public double mul1(int a,double b) {
		// TODO Auto-generated method stub
        return(a*b);
	}
    public int sub(int a,int b) {
		// TODO Auto-generated method stub
        return(a-b);
	}
    public double sub1(double a,double b) {
		// TODO Auto-generated method stub
        return(a-b);
	}
    public int div(int a,int b) {
		// TODO Auto-generated method stub
        return(a/b);
	}
    public double div1(double a,int b) {
		// TODO Auto-generated method stub
         return(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator obj=new Calculator();
     System.out.println(obj.add(5, 4));
     System.out.println(obj.add1(5, 4, 9));
     System.out.println(obj.mul(5, 4));
     System.out.println(obj.mul1(5, 4.7));
     System.out.println(obj.sub(5, 4));
     System.out.println(obj.sub1(5.9, 4.3));
     System.out.println(obj.div(20, 5));
     System.out.println(obj.div1(34.5, 7));
    
	}

}
