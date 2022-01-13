import java.util.*;

public class ListClientExample {
	private List list;

	public ListClientExample() {
		list = new LinkedList<>(Arrays.asList("Lee","Ha","Rim",5));
	}

	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		System.out.println(list);
		System.out.println("Data-type of list : "+list.getClass().getName());
	}
}