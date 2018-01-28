package proj1;

import java.io.IOException;
import java.io.OutputStream;

class GenericPersonWriter implements PersonWriter {

	@Override
	public void writeToOutputStream(Person p, OutputStream os) {

		try {
			os.write(writeToString(p).getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String writeToString(Person p) {
		return String.format("Person{name=%s, phone=%s, pesel=%s, age=%d}\n",
				p.getFullName(), p.getPhone(), p.getPesel(), p.getAge());

	}
}