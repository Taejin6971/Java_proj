package chapter17.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student_Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ArrayList 변수 선언
		List<Student> aList = new ArrayList<>();

		boolean run = true;
		int studentNum = 0; // 스캐너로 학생수를 인풋

		while (run) {
			System.out.println("==============================================");
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==============================================");
			System.out.println("위 번호중 하나의 정수를 입력하세요 >>>");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 스캐너로 학생수를 인풋 받아서 studentNum 변수에 할당.
				System.out.println("\n학생수를 입력해주세요 >>>");
				studentNum = sc.nextInt();
				System.out.println();
			} else if (selectNo == 2) {
				// 학생수가 인풋 되지않으면 처리 불가 (먼저 학생수를 입력 시키는 메세지 출력)
				if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력해주세요 >>>");
				} else {
					// 학생수에 대한 각각의 student 객체를 생성후 점수를 입력하고 aList에 저장.
					for (int i = 1; i <= studentNum; i++) {
						Student s1 = new Student(); // Student 객체 생성
						System.out.println("\n" + i + "번째 학생의 점수를 입력해주세요 >>>");
						int score = sc.nextInt(); // 스캐너로 정수를 인풋 받기
						// 스캐너로 인풋 받은 값을 s1 객체에 setter를 사용해서 저장
						s1.setScore(score);
						aList.add(s1);
					}
					System.out.println("\n학생의 점수 입력이 완료 되었습니다.\n");
				}
			} else if (selectNo == 3) {
				// 점수의 리스트를 출력, aList 의 student getter
				if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력해주세요 >>>");
				} else if (aList.isEmpty()) {
					System.out.println("학생의 점수를 먼저 입력해주세요 >>>");
				} else {
					// aList의 student 객체를 꺼내어 출력
					System.out.println("각 학생의 점수리스트를 출력합니다.");
					for (int i = 0; i < aList.size(); i++) {
						System.out.print(aList.get(i).getScore() + "점 ");
					}
					System.out.println("\n");
				}
			} else if (selectNo == 4) {
				// 최대 점수를 출력
				// 평균 출력
				if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력해주세요 >>>");
				} else if (aList.isEmpty()) {
					System.out.println("학생의 점수를 먼저 입력해주세요 >>>");
				} else {
					int maxScore = 0;
					int sum = 0;
					double avg = 0.0;
					// aList에 Student객체에 getScore()를 사용해서 점수를 꺼내어 처리
					for (int i = 0; i < aList.size(); i++) {
						Student s1 = aList.get(i);
						// 점수 : 객체의 getter를 사용해서 점수를 받아온다.
						int score = s1.getScore();
						sum += score; // sum = sum + score;
						// 최대 점수를 maxScore변수에 할당 : if 조건, 삼항 연산자로 처리
						if (score > maxScore) {
							maxScore = score;
						}
					}
					System.out.println("\n최대점수는 : " + maxScore + "점 입니다.");
					avg = (double) sum / aList.size();
					System.out.println("\n모든 학생의 평균점수는 : " + avg + "점 입니다.");
					System.out.println();
				}
			} else if (selectNo == 5) {
//				// 프로그램 종료
				break;
			} else {
				System.out.println("\n잘못된 번호를 입력했습니다. 다시 입력해주세요 >>>");
			}
		}
		System.out.println("\n프로그램이 종료 되었습니다.");
		sc.close();
	}
}
