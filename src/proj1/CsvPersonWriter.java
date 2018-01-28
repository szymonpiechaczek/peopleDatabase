package proj1;

public class CsvPersonWriter extends GenericPersonWriter {

	@Override
	protected String writeToString(Person p) {
		
		return String.format("%s, %s, %s, %d\n",
				p.getFullName(), p.getPhone(), p.getPesel(), p.getAge());
	}
}
