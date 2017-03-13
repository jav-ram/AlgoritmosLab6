import java.util.AbstractSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Tree<T> implements Sets<T> {
	public TreeSet<T> list = new TreeSet<T>();
	
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
