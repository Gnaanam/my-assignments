package week1.day1assignments;

public class Mobile {
    public void makeCall() {
		// TODO Auto-generated method stub
     String mobileModel="Iphone";
     float  mobileWeight=2.4f;
     System.out.println(mobileModel);
     System.out.println(mobileWeight);
     }
    public void sendMsg() {
		// TODO Auto-generated method stub
     boolean fullCharged=true;
     int mobileCost=10000;
     System.out.println(fullCharged);
     System.out.println(mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mobile obj=new Mobile();
    obj.sendMsg();
    obj.makeCall();
    System.out.println("This is my Mobile");
	}

}
