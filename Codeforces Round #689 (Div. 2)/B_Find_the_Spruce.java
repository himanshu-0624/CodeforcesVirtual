/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Find_the_Spruce

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new B_Find_the_Spruce().run();

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
	
	void start()
	{
	    	int n = s.nextInt();
	    	int m = s.nextInt();
		int [][]  mat = new int[n+1][m];

        for(int i=0;i<n;i++)
       {
           char [] p = s.nextLine().toCharArray();
           for(int j=0;j<m;j++)
           {
               if(p[j] == '*')
               {
                   mat[i][j] = 1;
               }
           }
       }
		  
       for(int i = n-1; i>= 0; i--)
       {
           for(int j = m-2; j>=1; j--)
           {
                 if(mat[i][j] == 1)
                 {
                     mat[i][j] = 1+Math.min(Math.min(mat[i+1][j-1],mat[i+1][j]), mat[i+1][j+1]);
                 } 
           }
       }
		 int ans = 0;
             
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 
                     ans+=mat[i][j];
                 
             }
         }
         System.out.println(ans);
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
