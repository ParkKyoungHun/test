package p09;

public class ForExam {

	public static void main(String[] args) {
		int[][] nums = new int[3][];
		
		int[] a = new int[3];
		int[] b = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];
		
		int addNum = 1;
		for(int i=0;i<nums.length;i++) {
			if(i!=0) {
				addNum +=  nums[i-1].length;
			}
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = j+addNum;
			}
		}

		for(int i=0;i<nums.length;i++) {
			int[] num = nums[i];
			for(int j=0;j<num.length;j++) {
				System.out.print("[" + i + "][" + j+ "]=" + num[j] + "\t");
			}
			System.out.println();
		}
	}
}
