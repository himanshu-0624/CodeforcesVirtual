/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C1_Potions_Easy_Version_

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new  C1_Potions_Easy_Version_().run();

	}
	void run()
	{
	    s = new FastReader();
	    solve();
	}
	 
	void solve()
	{
	    // for(int T = s.nextInt();T > 0;T--)
	    start();
	}
	
	void start()
	{

     
     int len = s.nextInt();
     long [] arr = longArr(len);
     PriorityQueue<Long> q = new  PriorityQueue<>();
    long h = 0;
    int c = 0;
    int max = 0;
    for(int i = 0; i<len; i++)
    {
        if(arr[i]>=0)
        max++;
    }
    for(int i = 0; i<len; i++)
    {
        if(arr[i]<0 && h+arr[i]>=0)
        {
            q.add(arr[i]);
            h+=arr[i];
            c++;
            max = Math.max(c,max);
        }
       else if(arr[i]>=0)
        {
            h+=arr[i];
            c++;
            max = Math.max(c,max);
        }
        else
        {

            if(h+arr[i]<0 && !q.isEmpty() && q.peek() < arr[i])
            {
                h-=q.poll();
                h+=arr[i];
                q.add(arr[i]);
                // c++;
                max = Math.max(c,max);
            }
            else
            {
                continue;
            }
            
            
        }
    }
    System.out.println(max);
   
		
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
