package p10;

public class Exam {

	public static void main(String[] args) {
		int[][] nums = new int[2][];
		nums[0] = new int[10];
		nums[1] = new int[4];
		int[] tNums = new int[14];
		for(int i=0;i<tNums.length;i++) {
			tNums[i] = i+1;
		}
		for(int i=0;i<tNums.length;i++) {
			int idx = tNums.length / nums.length;
			idx = i /idx;
			int idx2 = nums[idx].length;
			idx = i / idx2;
			idx2 = i % idx2;
			nums[idx][idx2] = tNums[i];
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
	}
}
