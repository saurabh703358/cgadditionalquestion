import java.util.*;
class Exercise4
{
	public static void main(String args[]){
		Exercise4 project = new Exercise4();
		List<String> list1 = new ArrayList<>();
		list1.add("apple");
		list1.add("orange");
		list1.add("grapes");
		List<String> list2 = new ArrayList<>();
		list2.add("apple");
		list2.add("melon");
		list2.add("mango");
		String removedArray[] = project.remover(list1, list2);
		for(String element : removedArray){
		System.out.println(element);
		}
	}
	public String[] remover(List<String> list1, List<String> list2){
	Iterator<String> iterator = list1.iterator();
	while(iterator.hasNext()){
	String item = iterator.next();
	if(item.startsWith("A")|| item.startsWith("G")||item.startsWith("a")||item.startsWith("g")){
		iterator.remove();
	    }
	}	
	Iterator<String> iterator2 = list2.iterator();
	while(iterator2.hasNext()){
	String item = iterator2.next();
	if(item.endsWith("N")|| item.endsWith("E")||item.endsWith("n")||item.endsWith("e")){
		iterator2.remove();
	    }
	}
	Set<String> filteredSet = new LinkedHashSet<>();
	filteredSet.addAll(list2);
	filteredSet.addAll(list1);
	String updatedArray[] = filteredSet.toArray(new String[0]);
	return updatedArray;
    }
}