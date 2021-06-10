/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C_Unstable_String 

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new C_Unstable_String().run();

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
	    char [] x = s.nextLine().toCharArray();
        if(x.length == 1)
        {
            System.out.println("1");
            return;
        }
        long p = 0;
        while(p<x.length &&x[(int)p] == '?')
        p++;
        
        if(p == x.length)
        {
            System.out.println(p*(p+1)/2);
            return;
        }
        char g = '0';
        if(x[(int)p] == '0')
        {
          g = '1';
        }
        p--;
        while(p>=0)
        {
            x[(int)p] = g;
            if(g == '1')g = '0';
            else g = '1';
            p--;
        }
         p = x.length-1;
        while(x[(int)p] == '?')
        p--;
       g = '0';
       if(x[(int)p] == '0')
       g = '1';
       p++;
        while(p<x.length)
        {
            x[(int)p] = g;
            if(g == '1')g = '0';
            else g = '1';
            p++;
        }


       long ans  =0 ;
		long i = 0;
        long j = 1;
       
        long neg = 0;

       while(j<x.length)
       {
           if(x[(int)j] == '?')
           {
               long k = j;
               while(x[(int)k] == '?')
               k++;
               
               if(x[(int)j-1] == x[(int)k])
               {
                    if((k-j)%2 == 0)
                    {
                        long h = k-i;
                     h = h*(h+1)/2;
                       ans+= h;
                       neg-=(k-j)*(k-j+1)/2;
                      i = j;
                      j = k;

                      
                    }
                    else{
                        j = k;
                    }
               }
               else
               {
                if((k-j)%2 == 0)
                {
                      j = k;
                }
                else{
                    long h = k-i;
                     h = h*(h+1)/2;
                       ans+= h;

                       neg-=(k-j)*(k-j+1)/2;
                      i = j;
                      j = k;
                }
               }  

           }
           else if(x[(int)j-1] == x[(int)j]){
        long h = j-i;
           h = h*(h+1)/2;
           ans+=h;
           i = j;
           j = j+1;
           }
           else
           {
               j++;
           }
       }
         
       long h = j-i;
           h = h*(h+1)/2;
           ans+=h;
           
		    //  System.out.println(neg);

       System.out.println(ans+neg);
		
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
