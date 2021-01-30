public class PaintBuckets {
	
	//Method with 4 parameters
	public int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) 
    { 
		if (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
			return -1; 
		else
			return (int) Math.ceil(width*height/areaPerBucket)-extraBuckets; 
    } 
  
	//Method with 3 parameters
	 public int getBucketCount(double width, double height, double areaPerBucket) 
	    { 
		 if (width<=0 || height<=0 || areaPerBucket<=0 )
			return -1; 
		 else
			return (int) Math.ceil(width*height/areaPerBucket); 
	    } 
	  
	//Method with 2 parameters
	    public int getBucketCount(double area, double areaPerBucket) 
	    { 
	    	if (area<=0 || areaPerBucket<=0 )
				return -1; 
			else
				return (int) Math.ceil(area/areaPerBucket); 
	    } 
	
	public static void main(String[] args) {
		  
		//Examples of input
		        PaintBuckets k = new PaintBuckets(); 
		        System.out.println(k.getBucketCount(-3.4,2.1,1.5,2)); // Returns -1
		        System.out.println(k.getBucketCount(3.4,2.1,1.5,2)); // 3
		        System.out.println(k.getBucketCount(2.75,3.25,2.5,1) + "\n");  // 3
		        
		        System.out.println(k.getBucketCount(-3.4, 2.1, 1.5)); // -1
		        System.out.println(k.getBucketCount(3.4, 2.1, 1.5));  // 5
		        System.out.println(k.getBucketCount(7.25, 4.3, 2.35) + "\n"); // 14
		        
		        System.out.println(k.getBucketCount(3.4,1.5));  // 3
		        System.out.println(k.getBucketCount(6.26,2.2));  // 3
		        System.out.println(k.getBucketCount(3.26,0.75));  // 5
		        
		} 

	}


