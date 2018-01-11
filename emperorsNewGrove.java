package emperorsNewGrove;
import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println(emperorCast);
		String end = emperorCast.get(1);
		emperorCast.remove(1);
		emperorCast.add(2,"Chaca");
		emperorCast.add(3,"Tipo");
		emperorCast.add("Bucky");
		emperorCast.add(end);
		System.out.println(emperorCast);
	}

}
