import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class Operation {
	
	private Sets<String> r1;
	private Sets<String> r2;
	private Sets<String> r3;
	
	public Operation(Sets<String> s1, Sets<String> s2, Sets<String> s3){
		this.r1 = s1;
		this.r2 = s2;
		this.r3 = s3;
	}
	//La interseccion entre los 3
	public String all(){
		String res = "";
		Iterator itr = r1.getList().iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if (r2.getList().contains(element) && r3.getList().contains(element)){
				res += " " + element;
			} 
		}
		return res;
	}
	
	//Los que son de java pero no web
	public String jnotWeb(){
		String res = "";
		Iterator itr = r1.getList().iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if (!r2.getList().contains(element)){
				res += " " + element;
			} 
		}
		return res;
	}
	
	//Interseccion entre web y movil pero no java
	public String notJavaBut(){
		String res = "";
		Iterator itr = r2.getList().iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if (r3.getList().contains(element) && !r1.getList().contains(element)){
				res += " " + element;
			} 
		}
		return res;
	}
	
	//Web o movil pero no java 
	public String notJava(){
		String res = "";
		Iterator itr = r2.getList().iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if (!r1.getList().contains(element)){
				res += " " + element;
			} 
		}
		Iterator it = r3.getList().iterator();
		while(it.hasNext()){
			Object element = it.next();
			if (!r1.getList().contains(element) && !r2.getList().contains(element)){
				res += " " + element;
			} 
		}
		return res;
	}
	
	//Java conjunto de web
	public String jUw(){
		String res = "";
		int s1 = r1.getList().size();
		int st = 0;
		Iterator itr = r2.getList().iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if (r1.getList().contains(element)){
				st ++;
			} 
		}
		if (st == s1){
			res = "Si";
		} else if (st<s1){
			res = "No";
		}
		return res;
	}
	
	//Grupo mas grande
	public String mayor(){
		String res = "";
		int s1 = r1.getList().size();
		int s2 = r2.getList().size();
		int s3 = r3.getList().size();
		
		if (s1 > s2 && s1>s3){
			res = "Java\n" + r1.getList() ;
		} else if (s2 > s1 && s2>s3){
			res = "Web\n" + r2.getList() ;
		} else if (s3 > s1 && s3>s2){
			res = "Movil\n" + r3.getList() ;
		}
		
		return res;
	}
	
	//
}
