package 배열;

public class 배열과제5 {

	public static void main(String[] args) {
		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int z = 0;
		for (int x = 0; x < array2.length; x++) {
			for (int y = 0; y < array2[x].length; y++) {
				sum += array2[x][y];
				z++;
			}
		}
		avg = (double) sum / z;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
