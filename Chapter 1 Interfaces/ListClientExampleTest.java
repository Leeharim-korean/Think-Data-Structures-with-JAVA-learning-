import java.util.*;

public class ListClientExampleTest {
	private List list;

	public ListClientExampleTest() {
		list = new ArrayList<>(Arrays.asList("Lee", "Ha", "Rim", 5));
	}

	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExampleTest lce = new ListClientExampleTest();
		List list = lce.getList();
		System.out.println(list);
		System.out.println("Data-type of list : " + list.getClass().getName());
	}
}