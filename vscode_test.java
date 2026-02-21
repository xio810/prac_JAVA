import java.util.Scanner;

public class vscode_test {
    public static void main(String[] args) {

        // String[] arr = new String[50];
        // Scanner sc = new Scanner(System.in);
        // 단어 입력받을 string변수
        // String str = sc.next().toLowerCase();

        System.out.println("배열 길이 입력 : ");

        Scanner sc = new Scanner(System.in); // 입력받는 도구 생성
        int length = sc.nextInt(); // scanf 배열길이 입력

        int[] arr = new int[length]; // length길이에 맞는 정수형 배열 생성

        // 배열 안에 숫자 입력
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        // 출력
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*
         * int arr[10] = {0};
         * 
         * for(int i = 0; i < length; i++){
         * scanf("%d", arr[i]);
         * }
         * 
         * for(int i = 0; i < length; i++){
         * printf("%d ", arr[i]);
         * }
         */
    }
}
