import java.util.Arrays;

public class Exercise9 {
	public static void main(String args[]) {
		Exercise9 project = new Exercise9();
		String arr[]={"red","green","blue","ivory"};
		project.run(arr,0);
	}

	public void run(String arr[], int place) {
		Arrays.sort(arr);
		System.out.println(arr[place]);
	}
}