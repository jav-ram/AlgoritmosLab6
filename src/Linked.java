import java.util.AbstractSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Linked<T> implements Sets<T> {
	
	public LinkedHashSet<T> list = new LinkedHashSet<T>();
	
	@Override
	public void add(T value) {
		// TODO Auto-generated method stub
		list.add(value);
	}

	@Override
	public AbstractSet<T> getList() {
		// TODO Auto-generated method stub
		return list;
	}

}
