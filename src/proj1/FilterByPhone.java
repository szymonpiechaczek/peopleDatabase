package proj1;

public class FilterByPhone implements Filter {

	private String phone;

	public FilterByPhone(String phone) {
		super();
		this.phone = phone;
	}

	@Override
	public boolean accept(Person p) {
		return (phone.equals(p.getPhone()));
	}

}
