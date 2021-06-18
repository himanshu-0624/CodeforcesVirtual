/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Colour_the_Flag

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new A_Colour_the_Flag().run();

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
            char [][] x = new char[n][m];
            char [][] a = new char[n][m];
            char [][] b = new char[n][m];

            for(int i =0; i<n; i++)
            {   char c = 'R';
                  if(i%2 == 0)
                {
                    c = 'W';
                }
                for(int j =0; j<m; j++)
                {
                    a[i][j] = c;
                    if(c == 'W')
                    {
                        c = 'R';
                    }
                    else
                    {
                        c = 'W';
                    }
                    
                }
            }
            for(int i =0; i<n; i++)
            {   char c = 'W';
                  if(i%2 == 0)
                {
                    c = 'R';
                }
                for(int j =0; j<m; j++)
                {
                    b[i][j] = c;
                    if(c == 'W')
                    {
                        c = 'R';
                    }
                    else
                    {
                        c = 'W';
                    }
                    
                }
            }
           
            for(int i =0; i<n; i++)
            {
                char [] p = s.nextLine().toCharArray();
                for(int j =0; j<m; j++)
                {
                    x[i][j] = p[j];
                    
                }
            }
            
            boolean aa = true;
            boolean bb = true;
            for(int i =0; i<n; i++)
            {
                for(int j =0; j<m; j++)
                {
                   if( x[i][j]!= '.')
                   {
                      char c = x[i][j];
                      if(c != a[i][j])
                      {
                          aa = false;
                      }

                      if(c != b[i][j])
                      {
                          bb = false;
                      }
                   }
                 
                }
                if(!(aa||bb))
                break;
            }

		    if(aa)
            {
                System.out.println("YES");
                for(int i =0; i<n; i++)
            {
                for(int j =0; j<m; j++)
                {
                    
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

            } 
          else  if(bb)
            {
                System.out.println("YES");
                for(int i =0; i<n; i++)
            {
                for(int j =0; j<m; j++)
                {
                    
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }

            } 
            else{
                System.out.println("NO");
            }
		
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
