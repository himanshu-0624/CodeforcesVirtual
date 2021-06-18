/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C_Number_of_Pairs

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new C_Number_of_Pairs().run();

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
           long l = s.nextLong();
           long r = s.nextLong();
           long [] arr = longArr(n);
           Arrays.sort(arr);
           int i = 0;
           int k = i+1;
           int j = n-1;
           long ans  = 0;
           while(k<=j)
           {
               
                if(arr[i]+arr[j] > r) 
               {
                 j--;
               }
              else if(arr[i]+arr[k] < l)
               {
                   int a = i+1;
                   int b = j;
                   boolean bb = false;
                     while(a<b)
                     {
                         int mid = (a+b)/2;
                         if(arr[mid]+arr[i] == l)
                         {
                             k = mid;
                             bb = true;
                             break;
                         }
                         else if(arr[mid]+arr[i] > l)
                         {
                             b  = mid;
                         } 
                         else
                         {
                             a = mid+1;
                         }    
                     }
                     if(bb )
                     {
                        ans+= j-k+1;
                        i++;
                         k = i+1;     
                     }
                     else if(a <=j && arr[a]+arr[i] >=l)
                     {
                        ans+= j-a+1;
                        i++;
                         k = i+1; 
                     }
                     else 
                     {
                         i++;
                         k = i+1;
                     }
               } 
               else
               {
                 ans+= j-k+1;
                i++;
                 k = i+1; 
               }   
               
               
           }
           System.out.println(ans);
           
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
