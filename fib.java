

public class fib {

	public static void main(String[] args) {
		 int p=0,p1=1,p2,i,count=10;    
		 System.out.print(p+" "+p1);  
		    
		 for(i=2;i<count;++i)    
		 {    
		  p2=p+p1;    
		  System.out.print(" "+p2);    
		  p=p1;    
		  p1=p2;    
		 }    

	}

}
