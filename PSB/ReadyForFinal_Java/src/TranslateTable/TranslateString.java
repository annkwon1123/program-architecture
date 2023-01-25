package TranslateTable;

import javax.swing.*;

public class TranslateString {
	public static void main(String[] args) {
		TranslateTable m = new TranslateTable(1);
		String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요: ");
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		JOptionPane.showMessageDialog(null, "원본: " + original + "\n암호화: " + encoded + "\n복호화: " + decoded);
	}
}
