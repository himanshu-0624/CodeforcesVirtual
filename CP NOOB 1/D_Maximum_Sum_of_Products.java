/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class D_Maximum_Sum_of_Products

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new D_Maximum_Sum_of_Products().run();
            
	}
	void run()
	{
	    s = new FastReader();
	    solve();
	}
	 
	void solve()
	{
	    //for(int T = s.nextInt();T > 0;T--)
	    start();
	}
	
	void start()
     { 
        int n = s.nextInt();
        long [] a = longArr(n);
        long [] b = longArr(n);
        long ans  = 0;
        for(int i=0;i<n;i++)
        {
            ans+=(a[i]*b[i]);
        }
       long maxi = ans;
        for(int i = 0; i<n; i++)
        {
            int l = i-1;
            int r = i+1;
            long sum = ans;
          
            while(l>=0 && r<n)
            {
                sum=sum-(a[l]*b[l]+a[r]*b[r]);
                sum=sum+(a[r]*b[l]+a[l]*b[r]);
              maxi =  Math.max(sum,maxi);
                l--;
                r++;
            }
        }
        for(int i = 0; i<n; i++)
        {
            int l = i;
            int r = i+1;
            long sum = ans;
            while(l>=0 && r<n)
            {
                sum=sum-(a[l]*b[l]+a[r]*b[r]);
                sum=sum+(a[r]*b[l]+a[l]*b[r]);
              maxi =  Math.max(sum,maxi);
                l--;
                r++;
            }
        }
        System.out.println(maxi);

     }
	
	
 
    static void sort(int[] A){
        int n = A.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = A[i];
            int randomPos = i + rnd.nextInt(n-i);
            A[i] = A[randomPos];
            A[randomPos] = tmp;
        }
        Arrays.sort(A);
     }
     static void sort(long[] A){
	        int n = A.length;
	        Random rnd = new Random();
	        for(int i=0; i<n; ++i){
	            long tmp = A[i];
	            int randomPos = i + rnd.nextInt(n-i);
	            A[i] = A[randomPos];
	            A[randomPos] = tmp;
	        }
	        Arrays.sort(A);
	     }
  static String sort(String s) {
 	 Character ch[]=new Character[s.length()];
 	 for(int i=0;i<s.length();i++) {
 		 ch[i]=s.charAt(i);
 	 }
 	 Arrays.sort(ch);
 	 StringBuffer st=new StringBuffer("");
 	 for(int i=0;i<s.length();i++) {
 		 st.append(ch[i]);
 	 }
 	 return st.toString();
  }
 

    //long array input
	public long [] longArr(int len)
    {
        // long arr input
            long [] arr = new long[len];
            String [] strs =  s.nextLine().trim().split("\\s+");
            for(int i =0; i<len; i++)
            {
                arr[i] = Long.parseLong(strs[i]);
               
            }
            return arr;
    }
    // int arr input
    public int [] intArr(int len)
    {
        // long arr input
            int [] arr = new int[len];
            String [] strs =  s.nextLine().trim().split("\\s+");
            for(int i =0; i<len; i++)
            {
                arr[i] = Integer.parseInt(strs[i]);
               
            }
            return arr;
    }
	  	
	  // FastReader
  static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

	
    
}
