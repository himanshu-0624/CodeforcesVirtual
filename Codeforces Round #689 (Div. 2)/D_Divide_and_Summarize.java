/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class D_Divide_and_Summarize

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new D_Divide_and_Summarize().run();

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
    HashSet<Long> x;
     void make(long arr[], int i, int j, long sum)
     {
         x.add(sum);
         if(arr[i] == arr[j])return;
         long y = (arr[i]+arr[j])/2;
        long pp = 0;
        int u = i;
        while(arr[u]<=y)
        {
            pp+=arr[u];
            u++;
        }
        make(arr,i,u-1,pp);
        make(arr,u,j,sum-pp);
        return;

     }
	void start()
	{
	    	
		
		  int n = s.nextInt();
          int q = s.nextInt();
          long arr[] = longArr(n);
          x = new HashSet<>();
          Arrays.sort(arr);
          long sum =0;
          for(int i=0;i<n;i++)sum+=arr[i];
          make(arr, 0,n-1,sum);     
          while(q-->0)
          {
             if(x.contains(s.nextLong()))
             {
                 System.out.println("Yes");
             }
             else
             {
                 System.out.println("No");
             }
          }
		     
		
	}
	

 //  print Int arr  
    public void printIntarr(int [] arr)
    {
           StringBuffer sb = new StringBuffer(); 
              for (int i = 0; i < arr.length;i++) 
             sb.append(arr[i] + " "); 
          
            System.out.println(sb);  
    }
// print long arr
    public void printLongarr(long [] arr)
    {
              StringBuffer sb = new StringBuffer(); 
              for (int i = 0; i < arr.length;i++) 
             sb.append(arr[i] + " "); 
          
            System.out.println(sb);  
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
