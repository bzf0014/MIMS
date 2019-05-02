package RecordManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 
public class RecordManager {
	private static Map map = new HashMap<>();
	private static Scanner in = new Scanner(System.in);
 
	public static void get() {
		Record patient1 = new Record(1001, "James", 21, "01/21/1997", "Cold");
		Record patient2 = new Record(1002, "Mike", 30, "02/23/1989", "Fever");
		Record patient3 = new Record(1003, "Martin", 17, "01/25/2002", "Kidney problem");
		Record patient4 = new Record(1004, "Alice", 40, "03/23/1979", "Lung cancer");
		Record patient5 = new Record(1005, "Amily", 20, "01/21/1998", "Inflammation");
		
		map.put(patient1.getId(), patient1);
		map.put(patient2.getId(), patient2);
		map.put(patient3.getId(), patient3);
		map.put(patient4.getId(), patient4);
		map.put(patient5.getId(), patient5);
	}
 
	public static boolean check(int id) {
		
		if (!map.containsKey(id)) {
			
			return false;
		} else {
			
			return true;
		}
	}
 
	public static void add() {// add records
		System.out.println(">>Add new record");
		System.out.print("Enter patient ID: ");
		int id = in.nextInt();
		if (new RecordManager().check(id)) {
			System.out.println("Sorry, ID already exist!");
		} else {
			System.out.print("Enter patient name: ");
			String name = in.next();
			System.out.print("Enter patient age: ");
			int age = in.nextInt();
			System.out.print("Enter patient birthday: ");
			String birthday = in.next();
			System.out.print("Enter patient disease: ");
			String diseaseRec = in.next();
			Record patient6 = new Record(id, name, age, birthday, diseaseRec);
			map.put(patient6.getId(), patient6);
			System.out.println("Add successfully!");
		}
	}
 
	public static void show() {// show record
		System.out.println("ID\t NAME \t\t AGE\t BIRTHDAY\t DISEASERECORD");
		Set<Map.Entry<Integer, Record>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, Record>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Record> entry = iter.next();
			System.out.print(entry.getKey() + "\t");
			System.out.println(entry.getValue().getName() + "\t\t" + entry.getValue().getAge() + "\t"
					+ entry.getValue().getBirthday() + "\t" + entry.getValue().getDiseaseRec());
		}
	}  
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecordManager rm = new RecordManager();
		rm.get();
      rm.show();
      rm.add();
      rm.show();
 
	}
 
}
