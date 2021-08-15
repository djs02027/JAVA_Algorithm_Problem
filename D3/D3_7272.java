package studytime;

import java.util.Arrays;
import java.util.Scanner;

public class D3_7272 {
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			
			String s1=sc.next();
			String s2=sc.next();
			
			char [] ch1 =s1.toCharArray();
			char [] ch2 =s2.toCharArray();
			int [] flag1= new int[ch1.length];
			int [] flag2= new int[ch2.length];
				System.out.println(Arrays.toString(ch1));
				System.out.println(Arrays.toString(ch2));
			
				if(ch2.length==ch1.length) {
					int f1,f2;
					for(int i=0; i<s1.length();i++) {
						char c=ch1[i];
						
						if(c=='A'|| c=='D'||c=='O'||c=='P'||c=='Q'||c=='R') {
							flag1[i]=1;
						}else if(c=='B'){
							flag1[i]=0;
						}else {
							flag1[i]=3;
						}
					}
					for(int i=0; i<s2.length();i++) {
						char c=ch2[i];
						if(c=='A'|| c=='D'||c=='O'||c=='P'||c=='Q'||c=='R') {
							flag2[i]=1;
						}else if(c=='B'){
							flag2[i]=0;
						}else {
							flag2[i]=3;
						}
					}	
					System.out.println(Arrays.toString(flag1));
					System.out.println(Arrays.toString(flag2));
						if(Arrays.equals(flag1, flag2)) {
							System.out.println("#"+test_case+" SAME");
						}else {
							System.out.println("#"+test_case+" DIFF");
						}
					
				}else {
					System.out.println("#"+test_case+" DIFF");
				}
			
		
		}
	}
}
