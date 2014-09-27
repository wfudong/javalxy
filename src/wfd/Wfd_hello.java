package wfd;

public class Wfd_hello {
	public int my_id_ns;//闈為潤鎬�
	public static int my_id_s=2011;
	
	public Wfd_hello(){
		my_id_ns++;
		my_id_s++;
	}
	
	public void Prt_ns(){
		System.out.println("Now,my_id_ns is锛�"+my_id_ns);
	}
	public void Prt_s(){
		System.out.println("Now,my_id_s is锛�"+my_id_s);
	}
	
	public static void main(String[] args){
		Wfd_hello a=new Wfd_hello();
		Wfd_hello b=new Wfd_hello();
//		StaticTST1 c=new StaticTST1();
		a.my_id_ns=122;
		b.my_id_ns=232;
		a.Prt_ns();
		a.Prt_s();
		b.Prt_ns();
		b.Prt_s();
	}
}
