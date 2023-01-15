package department.inheritance;

public class AxisBank extends Bankinfo  {
	
    @Override
    public void deposit() {
    	// TODO Auto-generated method stub
    System.out.println("deposit is 20000");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AxisBank obj=new AxisBank();
    obj.deposit();
    obj.fixed();
    obj.savings();
	}

}
