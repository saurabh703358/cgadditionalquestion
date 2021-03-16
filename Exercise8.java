public class Exercise8 {

	public static void main(String[] args) {

		int arrayList1[] = { 1, 2, 3, 4, 5 };
		int arrayList2[] = { 6, 7, 8, 9, 10 };
		int arrayList3[] = alternateElements(arrayList1, arrayList2);

		for (int d :arrayList3 )
			System.out.println(d);
	}

	public static int[] alternateElements(int[] arrayList1, int[] arrayList2) 
	{

		int arrayList3[] = new int[arrayList1.length];
		if (arrayList1.length == arrayList2.length) {

			for (int i = 0; i < arrayList1.length; i++) {

				if (i % 2 == 0) {

					arrayList3[i] = arrayList2[i];
				} else {

					arrayList3[i] = arrayList1[i];
				}
			}
		}
		return arrayList3;
	}
}
