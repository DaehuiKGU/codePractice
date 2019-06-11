package net.daehui.algorithm.problem17.roomAssign;
import java.util.Scanner;

public class RoomAssign {
	private int N;	// 학생의 수
	private int K;	// 한 방에 배정할 수 있는 최대 학생의 수
	private int[][] student;	// 학년 별 남학생과 여학생의 수
	private int roomNum;	// 필요한 최소한의 방 갯수
	
	public RoomAssign() {
		this.initialization();	// 초기화
	}
	
	public static void main(String[] args) {
		RoomAssign roomAssign = new RoomAssign();
		
		roomAssign.calRoomNum();	// 필요한 최소한의 방 갯수 계산
		roomAssign.printRoomNum();	// 필요한 최소한의 방 갯수 출력
	}
	
	private void initialization() {	// 초기화 하는 함수
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		
		this.N = Integer.parseInt(input[0]);	// 사용자로부터 N의 값 입력
		this.K = Integer.parseInt(input[1]);	// 사용자로부터 K의 값 입력
		this.student = new int[6][2];
		
		for(int i = 0; i < this.N; i++) {
			input = scan.nextLine().split(" ");
			
			this.student[Integer.parseInt(input[1]) - 1][Integer.parseInt(input[0])] += 1;	// 사용자로부터 학년 별 남학생과 여학생의 수 입력
		}
		
		this.roomNum = 0;
		
		scan.close();
	}
	
	private void calRoomNum() {	// 필요한 최소한의 방 갯수 계산하는 함수
		for(int i = 0; i < this.student.length; i++) {
			this.roomNum += (((this.student[i][0] / this.K) + (this.student[i][0] % this.K)) +
					((this.student[i][1] / this.K) + (this.student[i][1] % this.K)));
		}
	}
	
	private void printRoomNum() {	// 필요한 최소한의 방 갯수 출력하는 함수
		System.out.println(this.roomNum);
	}
}
