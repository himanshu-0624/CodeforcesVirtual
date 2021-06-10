/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Prinzessin_der_Verurteilung

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new  B_Prinzessin_der_Verurteilung().run();

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
        String xx = s.nextLine();

         int [] ans = new int[26];
         for(char c : xx.toCharArray())
         {
             ans[c-'a']++;
         }
         for(int i = 0; i<26; i++)
         {
             if(ans[i] == 0)
             {
                 System.out.println((char)(i+'a'));
                 return;
             }
         }

        HashSet<String> x = new HashSet<>();
        
        for(int i = 0; i<n-1; i++)
        {
            x.add(xx.substring(i, i+2));
        }
        char [] p = new char[2];
        p[0] = 'a';
        p[1] = 'a';
        if(x.size()<676)
        {
          for(int i = 0; i<26; i++)
          {
              for(int j = 0; j<26; j++)
              {
                  char a = (char)(i+'a');
                  char b = (char)(j+'a');
                  StringBuffer pp = new StringBuffer();
                  pp.append(a);
                  pp.append(b);
                  if(!x.contains(pp.toString()))
                  {
                      System.out.println(pp);
                      return;
                  }
              }
          }
        }
        
         x = new HashSet<>();
        
        for(int i = 0; i<n-2; i++)
        {
            x.add(xx.substring(i, i+3));
        }
        for(int i = 0; i<26; i++)
        {
            for(int k = 0; k<26; k++)
            for(int j = 0; j<26; j++)
            {
                char a = (char)(i+'a');
                char b = (char)(k+'a');
                char c = (char)(j+'a');
                StringBuffer pp = new StringBuffer();
                pp.append(a);
                pp.append(b);
                pp.append(c);
                if(!x.contains(pp.toString()))
                {
                    System.out.println(pp);
                    return;
                }
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
