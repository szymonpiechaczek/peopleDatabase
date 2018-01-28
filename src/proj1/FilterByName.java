package proj1;

public class FilterByName implements Filter{

	private String name;
	
	public FilterByName(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean accept(Person p) {
		return (name.equals(p.getFullName()));
	}
	
}