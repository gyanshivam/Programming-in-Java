package lastfewdoubtsresolution;

public class Experiment {
	  public static String finallyl(int count, char theCh)
	    {
	        String ans ="";
	        
			if(count>1)
	        {
	        	ans += theCh;
	    	    ans += count;
	        }
	        else
	        	ans += theCh;
	        
	        return ans;
	    }
		public static String getCompressedString(String str) {
			String strAns = "";
	        int count=1;
	        
	        for(int i=1; i<str.length();)
	        {	
	            char theCh = '\0';
	            if(str.charAt(i-1)==str.charAt(i))
	            {
	                count++;
	                i++;
	                theCh = str.chartAt(i-1);
	                
	                if(i==str.length()-1)
	                {
	                    strAns = finally1(count, theCh);
	                	return strAns;
	                }
	                continue;
	            }
	            
	            strAns = finally1(count, theCh); 
	            
	            count=1;
	            i++;
	        }
	        
	       return strAns; 
		}
		
		public static void main(String args[])
		{
			
		}
}
