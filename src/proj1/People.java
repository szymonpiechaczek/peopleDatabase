package proj1;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> people;
    
    public People(List<Person> people) {
		this.people = people;
	}
    public People() {
		this.people = new ArrayList<Person>();
	}

	public void saveToOutputStream (OutputStream os, PersonWriter pw) {
        for(Person p : people){
            pw.writeToOutputStream(p, os);
        }
    }
    
    public People filter (Filter f){
    	List<Person> result = new ArrayList<>();
    	for (Person p : people) {
    		if (f.accept(p)) {
    			result.add(p);
    		}
    	}
    	return new People(result);
    }

	public void insert(Person person) {
		people.add(person);
	}

}