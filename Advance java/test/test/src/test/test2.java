package test;

public class test2 {
	public static void main(String args[]) {
		String a="((())";
		int l=0,r=0;
		for (int i=0;i<a.length();i++){
			char z=a.charAt(i);
			
			if (z=='(') {
				l++;
			}
			if(z==')') {
				r++;
			}
			
		}
		if(l==r) {
			System.out.println("String is balanced");
		}else {
			System.out.println("String is not balanced");
		}
	}
}
