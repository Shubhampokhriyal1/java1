class coustomer{
	int bal=0;
	synchronized public void debit(int amt){
		if( ((this.bal)>=amt)){
			this.bal=this.bal-amt;System.out.println("Debit Done "+this.bal);
		}
		else {
			System.out.println("Wating for deposit "+this.bal);
			try{
				wait();
			}
			catch(Exception e){System.out.println(e);}
			System.out.println("Debit Done a "+this.bal);
		}
	}
	synchronized public void credit(int amt){
		this.bal=this.bal+amt;
		System.out.println("credit Done "+this.bal);
		try{
			notify();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class Main{
	public static void main(String args[]){

		coustomer c=new coustomer();

		Thread obj=new Thread(){public void run(){c.debit(100);}};
		obj.start();

		Thread obj1=new Thread(){public void run(){c.credit(100);}};
		obj1.start();
	} 
}
