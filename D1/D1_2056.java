package D1;

import java.util.Scanner;

public class D1_2056 {
	public int compare(int year, int month, int day) {
		if(!(month>=1 && month<=12)) {
			return -1;
		}else if(month==2 && day>28) {
			return -1;
			
		}else if(month==4 || month==6 || month == 9 || month == 11 ) {
			if (!(day>=1 && day<=30))
				return -1;
		}else if(!(day>=1 && day<=31)) {
			 return -1;
		}
		
		return 0;
	}
	
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
		D1_2056 d1 =new D1_2056();
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			String whatsday = sc.next();
			int year=Integer.parseInt(whatsday.substring(0,4));
			int month=Integer.parseInt(whatsday.substring(4,6));
			int day=Integer.parseInt(whatsday.substring(6,8));
			int result = d1.compare(year, month,  day);
			if(result==-1) {
				System.out.println("#"+test_case+" "+result);
			}else {
				System.out.println("#"+test_case+" "+whatsday.substring(0,4)+"/"+whatsday.substring(4,6)+"/"+whatsday.substring(6,8));
			}
				
			
			
			
		}
	}
}
