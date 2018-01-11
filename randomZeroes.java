package randomZeroes;
import java.util.ArrayList;
public class randomZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			numsRandom.add(i, (int)(Math.random() * 50));
		}
		System.out.println("Original list:" + numsRandom);
	
		for(int i = 0; i < numsRandom.size(); i++) {
			numsRandom.set(i, 0);
		}
		System.out.println("Final list:" + numsRandom);
	}
}
