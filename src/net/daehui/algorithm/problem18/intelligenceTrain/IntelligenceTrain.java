package net.daehui.algorithm.problem18.intelligenceTrain;

import java.util.Scanner;

public class IntelligenceTrain {
	private int currnePeople;
	private int maxPeople;
	
	public IntelligenceTrain() {
		this.initialization();
	}
	
	public static void main(String[] args) {
		IntelligenceTrain intelligenceTrain = new IntelligenceTrain();
		
		intelligenceTrain.calPeople();
		intelligenceTrain.printMaxPeople();
	}
	
	private void initialization() {
		this.currnePeople = 0;
		this.maxPeople = 0;
	}
	
	private void calPeople() {
		Scanner scan = new Scanner(System.in);
		String[] input = null;
		
		for(int i = 0; i < 4; i++) {
			input = scan.nextLine().split(" ");
			this.currnePeople += (Integer.parseInt(input[1]) - Integer.parseInt(input[0]));
			this.compareMax(this.currnePeople);
		}
		
		scan.close();
	}
	
	private void printMaxPeople() {
		System.out.println(this.maxPeople);
	}
	
	private void compareMax(int current) {
		if(this.maxPeople < current) {
			this.maxPeople = current;
		}
	}
}
