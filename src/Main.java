import java.util.Scanner;

public class Main {

/* - 문제 파악  
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

 - 유추 파악
A+B를 T큼 반복

- 단어 선정
입력 input
출력 output
합 plus

*/

public int plus(int input_first, int input_second) {
int output_plus = input_first + input_second;
    return output_plus;
}


    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        int input_T = scanner.nextInt();

        for(int i=1; i<=input_T; i++){
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        
        //처리
        Main main = new Main();
        int output_plus = main.plus(input_first, input_second);
        
        //출력
         System.out.println(output_plus);
        }

        scanner.close(); 
    }

}

