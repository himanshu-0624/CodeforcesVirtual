/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Omkar_and_Bad_Story

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new A_Omkar_and_Bad_Story().run();

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
           // long [] x = longArr(n);

            ArrayList<Long> x = new ArrayList<>();
            for(int i = 0; i<n; i++)
            { 
                x.add(s.nextLong());

            }
            


                HashSet<Long> p = new HashSet<>();
                for(long h : x)
                {
                    p.add(h);
                    if(h<0)
                    ne++;
                }
               
                int add = 0;
                for(int i = 0; i<x.size(); i++)
                {
                    for(int j = 0; j<x.size(); j++)
                    {
                        if(j==i)continue;

                            if(!p.contains(Math.abs(x.get(i)-x.get(j))))
                            {
                                p.add(Math.abs(x.get(i)-x.get(j)));
                                x.add(Math.abs(x.get(i)-x.get(j)));
                                add++;
                            }
                            if(add>300)break;
                    }
                    if(add>300)break;
                }
            
               
		  
		 if(add>300 )
         {
             System.out.println("NO");
         }
         else
         {
             System.out.println("Yes");
             System.out.println(p.size());
             for(long g : p)
             {
                 System.out.print(g+" ");
             }
             System.out.println();
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
