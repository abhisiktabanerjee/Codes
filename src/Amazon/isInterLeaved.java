package Amazon;

class isInterLeaved {
	//static int len=0;
	static boolean result=false;
	public static void main(String args[]){
		String a="XY";
		String b = "X";
		String c= "XXY";
		isInterLeaved is = new isInterLeaved();
		System.out.println(is.isInterLeave(a, b, c));
		
	}
	public boolean isInterLeave(String a, String b, String c) {
		int i =0;
		//boolean result=false;
		while(c.length()>0){
			if(c.charAt(i)==a.charAt(i) && a.length()>0){
				result=true;
				i++;
				if(a.length()>1 && c.length()>1)
					result = isInterLeave(a.substring(i), b, c.substring(i));
				else
					return result;
			}
			else if(c.charAt(i)==b.charAt(i) && b.length()>0){
				result=true;
				i++;
				if(b.length()>1 && c.length()>1)
					result=isInterLeave(a, b.substring(i), c.substring(i));
				else
					return result;
			}
		}
		return result;
	}
}
