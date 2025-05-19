package git1;

public class Git13366 {

	public static void main(String[]arg) {
	
		int[] n={2,6,8,9,7};
		int temp=0;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]<n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
	}	
}
