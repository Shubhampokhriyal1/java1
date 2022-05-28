class th extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("th "+i);
		}
	}
}
class th1 extends Thread{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("th1 "+i);
		}
	}
	public static void main(String args[]){
		th t1=new th();
		th1 t2=new th1();
		t1.start();
		try{
			t1.join();
		}
		catch (Exception e){
			System.out.println(e);
		}
		t2.start();
	} 
}
