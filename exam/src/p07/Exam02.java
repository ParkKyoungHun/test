package p07;

public class Exam02 {
/* 총 107리터의 물이 있습니다.
 * 5리터의 물통 과 3리터의 물통 2리터의 물통을 가지고 있을때 
 * 총 몇개의 물통이 있어야 107리터를 담을 수 있는지를
 * 계산하는 프로그램을 작성해주세요.
 * 단 물통의 갯수는 최소여야 합니다.
 */
	public static void main(String[] args) {
		int water = 107;
		int bottleVols1 = 5;
		int bottleVols2 = 3;
		int bottleVols3 = 2;
		int bottle1 = 0;
		int bottle2 = 0;
		int bottle3 = 0;
		
		bottle1 = water / bottleVols1;
		water = water % bottleVols1;
		if( water !=0) {
			bottle2 = water / bottleVols2;
			water = water % bottleVols2;
			if(water!=0) {
				bottle3 = water/bottleVols3;
				if(water % bottleVols3!=0) {
					bottle3 ++;
				}
			}
		}

		System.out.print(bottle1+"개의 5리터병 + ");
		System.out.print(bottle2+"개의 3리터병 + ");
		System.out.print(bottle3+"개의 2리터병 ");
	}
}
