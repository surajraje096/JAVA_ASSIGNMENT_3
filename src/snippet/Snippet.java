package snippet;

public class Snippet {
	public static boolean validateTime( String time) {
			
			//Displaying current time in 12 hour format with AM/PM
			
			//boolean status;
			String timePattern="(1[012]|[1-9]):[0-5][0-9](\\\\s)?(?i)(am|pm|AM|PM)";
			Pattern pat = Pattern.compile(timePattern); 
	        if (time == null) 
	            return false; 
	        
	        return pat.matcher(time).matches(); 
	        
	    }
	
		    public static void main(String[] args)
		    {	
		    	//Displaying current time in 12 hour format with AM/PM
		    	
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter time (hh:mm AM/PM) =");
			String n = sc.nextLine();
			boolean result=validateTime(n);
		   System.out.println(result);
		    
		    } 
		}
}

