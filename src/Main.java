import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        //처리
        int output_plus = input_first + input_second;

        //출력
        System.out.println(output_plus);
    }

}
