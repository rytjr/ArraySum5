package AddSum5;

import java.util.*;
import java.io.*;

public class AddSum5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		int[][] arr = new int[n1 + 1][n1 + 1];
		
		for(int i = 1; i < n1 + 1; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j < n1 + 1; j++) {
				arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n2; i++) {
			st = new StringTokenizer(bf.readLine());
			int N1 = Integer.parseInt(st.nextToken());
			int N2 = Integer.parseInt(st.nextToken());
			int N3 = Integer.parseInt(st.nextToken());
			int N4 = Integer.parseInt(st.nextToken());
			
			for(int j = N1; j <= N3; j++) {
				sum += arr[j][N4] - arr[j][N2 - 1];
			}
			
			bw.write(sum + "\n");
			sum = 0;
		}
		bw.flush();
		bw.close();
		
		
	}

}
