import java.util.*;
public class Example1 {
	public static void main(String args[])
	    {
		Example1 project = new Example1();
		String arr[]={"goa","kerala","gujarat"};
		project.toMap(arr);
		}
		public void toMap(String arr[]){
		HashMap<String, String> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		String key=arr[i].substring(0,3).toUpperCase();
		map.put(key,arr[i]);
		}
		System.out.println(map);
		}
		}


