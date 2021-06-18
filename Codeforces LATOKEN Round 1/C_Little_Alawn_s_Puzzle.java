/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C_Little_Alawn_s_Puzzle

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new C_Little_Alawn_s_Puzzle().run();

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

            int [] arr = intArr(n);
            int [] arr2 = intArr(n);
            int [] p1 = new int[n];
             HashMap<Integer,Integer> x = new HashMap<>();
            for(int i = 0; i<n; i++)
            {
                x.put(arr[i],arr2[i]);
               
            }
            long c = 0;
            for(int i = 0; i<n; i++)
            {
                  if(x.get(arr[i]) == -1)
                  continue;
                  else
                  {
                      int y = x.get(arr[i]);
                      x.put(arr[i],-1);
                      while(x.get(y)!= -1)
                      {
                         int yy = x.get(y);
                          x.put(y,-1);
                          y = yy;
                      }
                      c++;
                  }
               
            }
           System.out.println(power(2, c, 1000_000_007));
          
		
	}
     long power(long x, long y, long p)
    {
      long res = 1; // Initialize result
   
      x = x % p; // Update x if it is more than or
      // equal to p
   
      if (x == 0)
        return 0; // In case x is divisible by p;
   
      while (y > 0)
      {
   
        // If y is odd, multiply x with result
        if ((y & 1) != 0)
          res = (res * x) % p;
   
        // y must be even now
        y = y >> 1; // y = y/2
        x = (x * x) % p;
      }
      return res;
    }
	
 
    static void sort(int[] A){
        int n = A.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = A[i];
            int randomPos = i + rnd.nextInt(n-i);
            A[i] = A[randomPos];
            A[randomPos] = tmp;
        }
        Arrays.sort(A);
     }
     static void sort(long[] A){
	        int n = A.length;
	        Random rnd = new Random();
	        for(int i=0; i<n; ++i){
	            long tmp = A[i];
	            int randomPos = i + rnd.nextInt(n-i);
	            A[i] = A[randomPos];
	            A[randomPos] = tmp;
	        }
	        Arrays.sort(A);
	     }
  static String sort(String s) {
 	 Character ch[]=new Character[s.length()];
 	 for(int i=0;i<s.length();i++) {
 		 ch[i]=s.charAt(i);
 	 }
 	 Arrays.sort(ch);
 	 StringBuffer st=new StringBuffer("");
 	 for(int i=0;i<s.length();i++) {
 		 st.append(ch[i]);
 	 }
 	 return st.toString();
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
                arr[i] = Integer.parseInt(strs[i])-1;
               
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
