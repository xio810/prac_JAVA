import java.util.Scanner;

public class vscode_test {
    public static void main(String[] args) {
        /*
         * 회문검사기
         * 
         * 입력: level
         * 출력: 회문입니다!
         * 
         * 입력: hello
         * 출력: 회문이 아닙니다.
         * 
         * 입력: noon
         * 출력: 회문입니다!
         * 
         * 입력: racecar
         * 출력: 회문입니다!
         * 
         * 회문 변수 기준을 1로.
         * naen -> 기준을 0으로 두면 앞-끝 자리가 같아도 회문으로 출력된다.
         */

        // String[] arr = new String[50];

        System.out.println("단어 입력 : ");
        Scanner sc = new Scanner(System.in);
        // 단어 입력받을 string변수
        String str = sc.next().toLowerCase();

        // 입력받은 문자 길이
        int length = str.length();

        // 회문 인지 판별
        // 회문 변수
        int palindrome = 1;

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                palindrome = 0;
                break;
            }
        }

        if (palindrome == 1) {
            System.out.println("회문입니다.");
        } else {
            System.out.println("회문이 아닙니다.");
        }
        // System.out.println("개수는 " + length);
        // System.out.println("글자 : " + str);

    }
}
