import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E_alive {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		int m,n;
		
		while(input.hasNext()) {
			m = input.nextInt();
			n = input.nextInt();
			int[][] matrix = null;
			if(m!=0 && n!=0) {				
				matrix = new int[m][n];
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++) {
						matrix[i][j] = 0;
					}
				}
				while(input.hasNext()) {
					int x = input.nextInt();
					int y = input.nextInt();
					if(x == 0 && y == 0) {
						break;
					}
					else {
						matrix[x-1][y-1]=1;
					}
				}
			}
			
			int[][]temp = new int[m+2][n+2];
			for(int i=0; i<temp.length; i++) {
				for(int j=0; j<temp[0].length; j++) {
					temp[i][j] = 0;
				}
			}
			for(int i=1;i<m+1;i++) {
				for(int j=1; j<n+1;j++) {
					temp[i][j]=matrix[i-1][j-1];
				}
				
			}
			for(int i=1;i<temp.length-1;i++) {
				for(int j=1; j<temp[0].length-1;j++) {
					
					if(temp[i][j]==0) {
						int count =0;
					
						if(temp[i+1][j] ==1) {
							count++;
						}
						if(temp[i][j+1]==1) {
							count++;
						}
						if(temp[i-1][j]==1) {
							count++;
						}
						if(temp[i][j-1]==1) {
							count++;
						}
						if(count==2) {
							temp[i][j]=1;
							
							i=1;j=0; 
							
						}
					}
				}
			}
			int count = 0;
			for(int i=1;i<m+1;i++) {
				for(int j=1; j<n+1;j++) {
					if(temp[i][j] == 1) {
						count++;
					}
				}
			}
			if(count == (m*n)) {
				System.out.println("possible");
			}
			else {
				System.out.println("impossible");
			}
		}		
	}
}
