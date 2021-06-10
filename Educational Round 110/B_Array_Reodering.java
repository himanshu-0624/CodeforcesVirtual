/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Array_Reodering

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new  B_Array_Reodering().run();

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
	    	
       int n =s.nextInt();
       int arr[] = intArr(n);
       int od = 0;
       int ev = 0;
       ArrayList<Integer> p = new ArrayList<>();
       for(int i = 0; i<n; i++)
       {
           if(arr[i]%2 == 0)
           ev++;
           else 
           {
            od++;
            p.add(arr[i]);
           }
          
       }
       long ans  = 0;
       int d = n-1;
       for(int i = 0; i<ev; i++)
       {
          ans+=d;
          d--;
       }
       Collections.sort(p);
       for(int i = 0; i<p.size()-1; i++)
       {
           for(int j = i+1; j<p.size(); j++)
           {
                  if(gcd(p.get(i),p.get(j))>1)
                  ans++; 
           }
       }

       System.out.println(ans);
		  
		     
		
	}
     int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
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
