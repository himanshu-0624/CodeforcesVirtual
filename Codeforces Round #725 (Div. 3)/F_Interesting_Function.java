/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class F_Interesting_Function

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
            new F_Interesting_Function().run();

	}
	void run()
	{
	    s = new FastReader();
	    solve();
	}
	 
	void solve()
	{
	    for(int T = s.nextInt();T > 0;T--)
	    start();
	}
	long count (long x)
    {
        
            long cnt=0;
            if(x==1000000000){
                cnt+=1111111111;
                x=x%1000000000;
            }
            if(x>=100000000){
                cnt+=(x/100000000)*111111111;
                x=x%100000000;
            }
            if(x>=10000000){
                cnt+=(x/10000000)*11111111;
                x=x%10000000;
            }
            if(x>=1000000){
                cnt+=(x/1000000)*1111111;
                x=x%1000000;
            }
            if(x>=100000){
                cnt+=(x/100000)*111111;
                x=x%100000;
            }
            if(x>=10000){
                cnt+=(x/10000)*11111;
                x=x%10000;
            }
            if(x>=1000){
                cnt+=(x/1000)*1111;
                x=x%1000;
            }
            if(x>=100){
                cnt+=(x/100)*111;
                x=x%100;
            }
            if(x>=10){
                cnt+=(x/10)*11;
                x=x%10;
            }
                cnt+=x;
            return cnt;
        
    }
	
    void start()
	{ 
        long l = s.nextLong();
        long r = s.nextLong();
         long cnt = count(r)-count(l);

       

       
System.out.println(cnt);
           
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
