package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test{
	String Name;
	int age;
	String location;
	Test(String Name,int age,String location){
		this.Name = Name;
		this.age = age;
		this.location = location;
	}
}	
public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Test> lst = new ArrayList<Test>();
		Test o1 = new Test("Rajesh",21,"London");
		Test o2 = new Test("Suresh",28,"California");
		Test o3 = new Test("Sam",26,"Delhi");
		Test o4 = new Test("Rajesh",21,"Gurgaon");
		Test o5 = new Test("Manish",29,"Bengaluru");
		lst.add(o1);
		lst.add(o2);
		lst.add(o3);
		lst.add(o4);
		lst.add(o5);
		
		Map<String,Test> map = new HashMap();
		for(Test item : lst) {
			
				map.put(item.Name+"|"+item.age , item);
			
		}
		lst.clear();
		lst.addAll(map.values());
		for(Test item : lst) {
			System.out.println(item.Name+"|"+item.age+"|"+item.location);
		}
		
	}
}
