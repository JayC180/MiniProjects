import java.util.ArrayList;
import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class RemoveLineBreak {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert text:");
		while(sc.hasNextLine()) {
			String n = sc.nextLine();
			if(n == null || n.isEmpty()) {
				break;
			}
			arr.add(n);
		}

		String f = "";
		for(int i=0; i<arr.size(); i++) {
			f = f.concat(arr.get(i) + " ");
		}
		
		StringSelection stringSelection = new StringSelection(f);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
}
