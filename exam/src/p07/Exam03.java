package p07;

public class Exam03 {
/* 총 107리터의 물이 있습니다.
 * 5리터의 물통 과 3리터의 물통 2리터의 물통을 가지고 있을때 
 * 총 몇개의 물통이 있어야 107리터를 담을 수 있는지를
 * 계산하는 프로그램을 작성해주세요.
 * 단 물통의 갯수는 최소여야 합니다.
 */
	public static void main(String[] args) {
		int water = 44;
		int[] bottleVols = new int[3];
		bottleVols[0] = 5;
		bottleVols[1] = 3;
		bottleVols[2] = 2;
		int[] bottles = new int[3];
		
		for(int i=0;i<bottleVols.length;i++) {
			bottles[i] = water / bottleVols[i];
			water = water % bottleVols[i];
			if(i==bottleVols.length-1) {
				if(water!=0) {
					bottles[i]++;
				}
			}
			if(water==0) {
				i = bottleVols.length;
			}
		}
		String str ="";
		for(int i=0;i<bottleVols.length;i++) {
			str += bottles[i]+"개의 " +bottleVols[i] + "리터병 + ";
		}
		System.out.println(str.substring(0,str.length()-2));
	}
}
