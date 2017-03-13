import java.util.AbstractSet;
import java.util.HashSet;

public class Hash<T> implements Sets<T> {
	public HashSet<T> list = new HashSet<T>();

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
