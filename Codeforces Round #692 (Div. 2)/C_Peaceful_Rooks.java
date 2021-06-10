/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C_Peaceful_Rooks

{
     FastReader s;

    
	public static void main (String[] args) throws java.lang.Exception
	{
	
		new C_Peaceful_Rooks().run();

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
    ArrayList<Integer> adj;
    boolean  vis [];
	void start()
	{
	    int n = s.nextInt();
        int m = s.nextInt();
          adj = new ArrayList<>();            
		for(int i = 0; i<=n; i++)
        {
            adj.add(-1);
        }
        long ans = 0;
        for(int i = 0; i<m; i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();
             if(a != b)
             {
                adj.set(a,b);
               // adj.set(b,a);
                 ans++;
             }
           
        }
          vis  = new boolean[n+1];
        for(int i= 1; i<=n ; i++)
        {
            
            int prev  = -1;
           if(!vis[i] && adj.get(i)!=-1)
            {
                vis[i] = true;
                int ll = adj.get(i);
           
                while(adj.get(ll) != -1)
                {
                    if(vis[ll] && prev != ll){
                        ans++;
                        break;
                    }
                    vis[ll] = true;
                    ll = adj.get(ll);
                }
               
               
            }
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
