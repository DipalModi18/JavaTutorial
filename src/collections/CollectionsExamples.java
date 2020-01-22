package collections;
import java.util.ArrayList;
import java.util.TreeSet;

public class CollectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		System.out.println("Size of the ArrayList: "+al.size());
		al.add(1, "CCC"); // Insert element CCC at the index 1
		System.out.println("ArrayList: "+al);
		
		al.remove(2); //Removes element at the index 2
		al.remove("AAA");
		
		
//		TreeSet extends AbstractSet and implements the NavigableSet interface. It creates a 
//		collection that uses a tree for storage. Objects are stored in sorted, ascending order. Access 
//		and retrieval times are quite fast, which makes TreeSet an excellent choice when storing 
//		large amounts of sorted information that must be found quickly.
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ABC");
		ts.add("XYZ");
		ts.add("MNO");
		ts.add("CKY");
		System.out.println("Sorted output of the TreeSet: "+ts);
//		TreeSet stores its elements in a tree, they are automatically arranged in sorted order
		
//		 If you want to order elements, 
//		 a different way, then specify a Comparator when you construct the set or map

	}

}
