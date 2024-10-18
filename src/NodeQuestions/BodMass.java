package NodeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BodMass {

	public static void main(String[] args) {
		String[] ar = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		List<String> sign = Arrays.asList("+","-","*","/");
		
	    CopyOnWriteArrayList cp = new CopyOnWriteArrayList(Arrays.asList(ar));
	    
	    
	    
	    
	    
	    for(int i=0;i<cp.size();i++) {
	    	if(sign.contains(cp.get(i))) {
	    		int a = Integer.parseInt(cp.get(i-1).toString());
	    		int b = Integer.parseInt(cp.get(i-2).toString());
	    		int c =  mathematics(a,b,cp.get(i).toString());
	    		System.out.println(c);
	    		cp.remove(i);
	    		cp.remove(i-1);
	    		cp.remove(i-2);
	    		cp.add(i-2, c);
	    		i=i-2;
	    	}
	    }
	    
	    System.out.println(cp.get(0));

	}
	
	public static int mathematics(int a,int b,String sign) {
		if(sign.equals("+")) {
			return b + a;
		} else if(sign.equals("-")) {
			return b-a;
		} else if(sign.equals("*")) {
			return b*a;
		}else {
			return b/a;
		}
	}

}
