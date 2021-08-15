package D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class D1_2063 {
	public static void main(String args[]) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int[] A = new int[N];
		int result;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);


		if (N % 2 == 1) {
			int center = (N / 2);
			System.out.println(A[center]);
		} else if (N % 2 == 0) {
			int center = (N / 2);
			double sum = A[center - 1] + A[center];
			System.out.println(sum / 2);
		}

	}
}
