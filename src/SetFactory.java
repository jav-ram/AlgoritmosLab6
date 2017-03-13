
public class SetFactory<T> {
	
	public Sets getSet(String op){
		switch(op){
			case "1":{
				return new Hash<T>();
			}
			case "2":{
				return new Tree<T>();
			}
			case "3":{
				return new Linked<T>();
			}
			default:{
				return null;
			}
		}
	}
}
	

