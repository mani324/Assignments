package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class HashToTree {
	public static void main(String[] args) {
				// Get the HashSet
	  Set<String> setvalue = new HashSet<>();
			setvalue.add("Converting");
			setvalue.add("HashSet");
			setvalue.add("To");
			setvalue.add("TreeSet");
			setvalue.add("Example");
			System.out.println("HashSet: "+ setvalue);
				// Convert the HashSet to TreeSet
			Set<String> hashSetToTreeSet= new TreeSet<>();
			hashSetToTreeSet.addAll(setvalue);
				// Print the TreeSet
			System.out.println("TreeSet: "+ hashSetToTreeSet);
			}
		}
	

