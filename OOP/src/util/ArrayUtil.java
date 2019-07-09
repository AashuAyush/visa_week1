package util;
public class ArrayUtil {

	public static void sort (Comparable[] elems) {
//		Arrays.sort(elems);
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if (elems[i].compareTo(elems[j]) > 0){
					Comparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}
	/**
	 * method to return number of occurrences of 'no' in an array
	 */

//	public static int getSum(int [] data) {
//	int sum = 0;
//	for (int i=0; i<data.length; i++) {
//		sum += data[i];
//	}
//	return sum;
//}
//	public static int getCount(int [] elems, int no) {
//		int count =0;
//		for(int i=0; i<elems.length; i++) {
//			if (elems[i]==no) count++;
//		}
//		return count;
//	}
//	public static int[] convert (int [][] data) {
//		int[] data1 = null; 
//		for (int i=0; i<data.length; i++) {
//			for (int j=0; j<data[i].length; j++) {
//				data[i][j]= data1[i+j];
//			}
//		}
//		return null;
}

