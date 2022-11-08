package week3.day2;

public class Iphone extends Android{

	public void videoCalls() {
		System.out.println("Make Videocalls using facetime");
	}

public static void main(String[] args) {
		
      Iphone i=new Iphone();
      i.mobileModels();
      i.findPhone();
      i.videoCalls();
      i.makecalls();
	}

}
