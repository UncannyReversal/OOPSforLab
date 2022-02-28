package thread_divisor;
class DivisorThread extends Thread{
	int l,u;
	Thread t;
	int [] a=new int[10000];
	DivisorThread(int l,int u){
            this.l=l;
            this.u=u;
            t=new Thread(this);
            t.start();	
	}
	public void run(){
            try{
		int i;
		for(i=l;i<=u;i++){
                    a[i-1]=0;
                    for(int j=2;j<=i/2;j++){
			if(i%j==0)
                            a[i-1]+=1;
			}
                    }		
                }
            catch(Exception e){
		System.out.println(e);
            }
	}
	int [] evaluate(int l,int u){
		int [] b=new int[2000];
		int i;
		for(i=0;i<=u-l;i++) {
			b[i]=a[l-1+i];
		}
		return b;
	}
}
public class Thread_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1=new int[2000];
		int [] a2=new int[2000];
		int [] a3=new int[2000];
		int [] a4=new int[2000];
		int [] a5=new int[2000];
		DivisorThread t1=new DivisorThread(1,2000);
		DivisorThread t2=new DivisorThread(2001,4000);
		DivisorThread t3=new DivisorThread(4001,6000);
		DivisorThread t4=new DivisorThread(6001,8000);
		DivisorThread t5=new DivisorThread(8001,10000);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		a1=t1.evaluate(1,2000);
		a2=t2.evaluate(2001, 4000);
		a3=t3.evaluate(4001, 6000);
		a4=t4.evaluate(6001, 8000);
		a5=t5.evaluate(8001, 10000);
		int m=0,x=0,i;
		for(i=0;i<a1.length;i++) {
			if(m<a1[i]) {
				m=a1[i];
				x=i;
			}
		}
		for(i=0;i<a2.length;i++) {
			if(m<a2[i]) {
				m=a2[i];
				x=i+2000;
			}
		}
		for(i=0;i<a3.length;i++) {
			if(m<a3[i]) {
				m=a3[i];
				x=i+4000;
			}
		}
		for(i=0;i<a4.length;i++) {
			if(m<a4[i]) {
				m=a4[i];
				x=i+6000;
			}
		}
		for(i=0;i<a5.length;i++) {
			if(m<a5[i]) {
				m=a5[i];
				x=i+8000;
			}
		}
		System.out.println("Element with maximum divisor in range 1 to 100000 is "+(x+1));
	}
}
