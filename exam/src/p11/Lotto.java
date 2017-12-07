package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	int lottoCnt = 0;
	int joinCnt = 0;

	// test
	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요=>");
		joinCnt = s.nextInt();
		lottoCnt = new Random().nextInt(joinCnt)+1;
		s.close();
	}

	// 당첨인원에 대한 배열변수를 받는거.
	int[] getLottos() {
		return new int[lottoCnt];
	}

	// 참여인원에 대한 배열변수를 받는거구요
	int[] getJoins() {
		return new int[joinCnt];
	}

	void initLottos(int[] lottos, int[] joins) {
		Random r = new Random();
		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt*2) + 1;
			lottos[i] = n;
			if (isDupl(lottos, n, i) || isExclude(joins, n)) {
				i--;
			}
		}
	}

	boolean isExclude(int[] joins, int num) {
		for (int i = 0; i < joins.length; i++) {
			if (joins[i] == num) {
				return false;
			}
		}
		return true;
	}

	void initJoins(int[] joins) {
		Random r = new Random();
		for (int i = 0; i < joins.length; i++) {
			int n = r.nextInt(joinCnt*2) + 1;
			joins[i] = n;
			if (isDupl(joins, n, i)) {
				i--;
			}
		}
	}

	boolean isDupl(int[] lottos, int num, int maxNum) {
		for (int i = 0; i < maxNum; i++) {
			if (lottos[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		int[] lottos = l.getLottos();
		int[] joins = l.getJoins();
		System.out.println("당첨인원 : " + l.lottoCnt);
		System.out.println("비당첨인원 : " + (l.joinCnt - l.lottoCnt));
		l.initJoins(joins);
		l.initLottos(lottos, joins);
		System.out.print("참가한 사람 번호 : ");
		for (int j = 0; j < joins.length; j++) {
			System.out.print(joins[j]+ ",");
		}
		System.out.println();
		System.out.print("당첨된 사람 번호 : ");
		for (int j = 0; j < lottos.length; j++) {
			System.out.print(lottos[j]+ ",");
		}
		System.out.println();
		System.out.print("당첨 안된 사람 번호 : ");
		for (int j = 0; j < joins.length; j++) {
			if(l.isExclude(lottos, joins[j])) {
				System.out.print(joins[j]+ ",");
			}
		}
	}
}
