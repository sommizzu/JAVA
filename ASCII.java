import java.util.Scanner;

public class Exam02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	// 키보드 입력을 위해 스캐너
	System.out.print("영문자를 입력해주세요 : ");		
	String alpa = sc.nextLine();	// 입력받은 문자열을 String alpa에 저장.
	
	for(int i = 0; i < alpa.length(); i++) {	//반복문으로 입력받은 문자열의 문자 한개씩을 선택해 아스키 코드로 출력
		char askii = alpa.charAt((int)i);
		System.out.println(askii + " = " + (int)askii);
	}
}
}
