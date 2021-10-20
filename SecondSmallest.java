
public class SecondSmallest {

	public static void main(String[] args) {
		int temp,size;
		int[] a= {10,40,5,15,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[1]);

	}

}
