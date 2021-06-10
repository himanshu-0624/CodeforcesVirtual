/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;



import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Game_of_Life

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new A_Game_of_Life().run();

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

            char [] arr = s.nextLine().toCharArray();
           ArrayList<Integer> x = new ArrayList<>();
           for(int i = 0; i<n; i++)
           {
               if(arr[i]=='1')
               {
                  x.add(i);
               }
           }

           if(x.size() == 0)
           {
            StringBuffer ans  = new StringBuffer();
            for(char c : arr)
            {
                ans.append(c);
            }
            System.out.println(ans);
            return;
           }
           
           int p = x.get(0);
           p--;
           int pp = m;
           while(p>=0 && pp>0 )
           {
                arr[p] = '1';
                p--;
                pp--;
           }
            p = x.get(x.size()-1);
            p++;
            pp = m;
           while(p<arr.length && pp>0 )
           {
                arr[p] = '1';
                p++;
                pp--;
           }

           for(int i = 0; i<x.size()-1; i++)
           {
               int j = x.get(i);
               int k = x.get(i+1);
               j++;
               k--;
               int l = m;
               int cnt  = k-j-1;
               while(l>0 && j<k)
               {
                     arr[j] = '1';
                     arr[k] = '1';
                     j++;
                     k--;
                     l--;
               }
           }
            StringBuffer ans  = new StringBuffer();
            for(char c : arr)
            {
                ans.append(c);
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
