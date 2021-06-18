/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class D_Another_Problem_About_Dividing_Numbers

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new D_Another_Problem_About_Dividing_Numbers().run();

	}
	void run()
	{
	    s = new FastReader();
	    solve();
	}
    static StringBuffer ans = new StringBuffer();
	void solve()
	{
	    for(int T = s.nextInt();T > 0;T--)
	    start();

        System.out.print(ans.toString());
	}
    int primeF(int n)
{
    int cnt=0;
    while ((n & 1) == 0)
    {
        cnt++;
        n = n/2;
    }
  
 
    for (int i = 3; i <= Math.sqrt(n); i = i + 2)
    {
        while (n % i == 0)
        {
            cnt++;
            n = n/i;
        }
    }
 
    if (n > 2)
        cnt++;

    return cnt;
}

	void start()
	{
           int a = s.nextInt();
           int b = s.nextInt();
           int k = s.nextInt();
           if(k == 0)
           {
               if(a == b)
               ans.append("YES\n");
               else
               ans.append("NO\n");

               return;
           }
                   
           if(a == b && k == 1)
                    {
                        ans.append("NO\n");
                        return;
                    }

           if(k==1)
           {
                   
            if(b%a==0||a%b==0){
                ans.append("YES\n");
            }
            else{
                ans.append("NO\n");
               
            }
            return;
        }

           int a1 = primeF(a);
           int a2 = primeF(b);

          
         if(a1+a2>=k){
            ans.append("YES\n");
        }
        else 
        {
            ans.append("NO\n");
        }
    
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
