package Assignment28;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=0;
     int[]a= {1,2,3,4,5,6};
     for(int i=1;i>a.length;i++)
     {
    	 if(a[i]>max)
    	 {
    		 max=a[i];
    		 //System.out.println("max is="+max);
    	 }
     }
     System.out.println("max is="+max);
     for(int j=0;j<6;j++)
     {
    	 sum=sum+a[j];
    	 
     }
     System.out.println("sum is="+sum);
     double avg=sum/a.length;
     System.out.println(avg);
	}

}
