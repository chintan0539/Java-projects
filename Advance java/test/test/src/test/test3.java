package test;

public class test3 {
	public static void main(String args[]) {
		String s="chintann";
		
		for(int i=0;i<s.length();i++) {
			char q=s.charAt(i);
			int z=0;
			for(int j=0;j<s.length();j++) {
				char w=s.charAt(j);
					if(q==w) {
						z++;
					}
				
			}
			System.out.println(q+"  "+z);
		}
		
	}
}
