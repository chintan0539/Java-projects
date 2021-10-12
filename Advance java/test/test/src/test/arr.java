package test;

public class arr {
	public static void main(String args[]) {
		int arr[]= {1,2,3,1,2,1,4,2,3,5};
		int l=arr.length;
		int[] arr2= new int[l];
		boolean f=false;
		int n=0;
		for (int i=0;i<l;i++) {
			for (int j=0;j<l;j++) {
				if(arr[i]==arr2[j])
				{
					f=true;
					break;
				}
			}
			if(f==false) {
				arr2[n]=arr[i];
				n++;
				
			}
			f=false;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
