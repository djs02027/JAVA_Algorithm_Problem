package D2;

import java.util.Scanner;

public class D2_1288 {
	public static void main(String args[]) throws Exception {
		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를
		 * 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때
		 * 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		 * 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		// System.setIn(new FileInputStream("res/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T, count = 0;
		int num;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			do {
			num = sc.nextInt();
			}while(num<=0 || num>1000000);
			int num_c = 0;
			
			int count_number = 1;
			int[] n_field = new int[10];
		
			while(true){
			
				num_c = num * count_number++;

				if (num_c < 10 && num_c > 0) {

					n_field[num_c] = 1;

				} else if (num_c >= 10 && num_c < 100) {

					n_field[num_c / 10] = 1; // 십의자리

					n_field[num_c % 10] = 1; // 일의 자리

				} else if (num_c >= 100 && num_c < 1000) {

					n_field[num_c / 100] = 1; // 백의자리

					n_field[(num_c / 10) % 10] = 1; // 십의자리

					n_field[num_c % 10] = 1; // 일의자리

				} else if (num_c >= 1000 && num_c < 10000) {

					n_field[num_c / 1000] = 1; // 천의자리

					n_field[(num_c / 100) % 10] = 1; // 백의자리

					n_field[(num_c / 10) % 10] = 1; // 십의자리

					n_field[num_c % 10] = 1; // 일의자리

				} else if (num_c >= 10000 && num_c < 100000) {

					n_field[num_c / 10000] = 1; // 만의자리

					n_field[(num_c / 1000) % 10] = 1; // 천의자리

					n_field[(num_c / 100) % 10] = 1; // 백의자리

					n_field[(num_c / 10) % 10] = 1; // 십의자리

					n_field[num_c % 10] = 1; // 일의자리

				} else if (num_c >= 100000 && num_c < 1000000) {

					n_field[num_c / 100000] = 1; // 십만의자리

					n_field[(num_c / 10000) % 10] = 1; // 만의자리

					n_field[(num_c / 1000) % 10] = 1; // 천의자리

					n_field[(num_c / 100) % 10] = 1; // 백의자리

					n_field[(num_c / 10) % 10] = 1; // 십의자리

					n_field[num_c % 10] = 1; // 일의자리

				}else if (num_c >= 1000000 && num_c < 10000000) {

					n_field[num_c / 1000000] = 1; 

					n_field[(num_c / 100000) % 10] = 1; 

					n_field[(num_c / 10000) % 10] = 1; 

					n_field[(num_c / 1000) % 10] = 1; 
					
					n_field[(num_c / 100) % 10] = 1;

					n_field[(num_c / 10) % 10] = 1;

					n_field[num_c % 10] = 1; 

				}
				count = 0;
				for (int i = 0; i < n_field.length; i++) {
					count += n_field[i];

				}
				if (count == 10) {
					break;
				}
		
			}
			
			System.out.println("#" + test_case + " " + num_c);
		
		}
	}
}
