package proj1;

public class Main {

	public static void main(String[] s) {

		People db = new People();

		db.insert(new Person("John", "500100100", "987654321", 15));
		db.insert(new Person("Jake", "500154100", "955555531", 88));
		db.insert(new Person("John", "505184500", "987654321", 17));
		//
		//db = db.filter(new FilterByName("John"));

		db.saveToOutputStream(System.out, new CsvPersonWriter());

		// for (int i = 0; i < s.length; i++)
		// System.out.println("wartoœæ s[" + i + "]: " + s[i]);
	}

}