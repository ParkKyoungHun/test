package p14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	ArrayList<Integer> alCheck;
	ArrayList<Integer> alLotto;

	/*
	 * 로또번호를 입력하고 랜덤하게 로또를 만들고 자동,수동,반자동이 선택가능하게 만들어야함 로또가 끝난이후 맞춘 갯수를 출력
	 */
	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("1.자동, 2.수동, 3.반자동 을 선택해주세요");
		int cmd = s.nextInt();
		if (cmd == 1) {
			alCheck = initArray(0);
		} else if (cmd == 2) {
			alCheck = initArray();
		} else {
			alCheck = initArray();
			alCheck.addAll(initArray(alCheck.size()));
		}
	}

	ArrayList<Integer> initArray(){
		System.out.println("입력할 로또숫자를 ,를 기준으로 입력해주세요");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] strs = str.split(",");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (String lot : strs) {
			al.add(Integer.parseInt(lot));
		}
		return al;
	}
	ArrayList<Integer> initArray(int num){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 6-num; i++) {
			al.add(r.nextInt(45) + 1);
		}
		return al;
	}
	
	void initAlLotto() {
		alLotto = initArray(0);
	}
	void printMachLotto() {
		String str = "당첨 번호 : [";
		for(Integer i : alCheck) {
			for(Integer j:alLotto) {
				if(i.intValue()==j.intValue()) {
					str += i + ",";
				}
			}
		}
		str+="]";
		System.out.println(str);
		System.out.println("입력번호 : " + alCheck);
		System.out.println("로또번호 : " + alLotto);
		
	}
	
	public static void main(String[] args) {
		Lotto l  =new Lotto();
		l.initAlLotto();
		l.printMachLotto();
	}
}
