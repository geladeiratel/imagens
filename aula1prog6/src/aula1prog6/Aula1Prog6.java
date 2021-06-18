package aula1prog6;

import javax.swing.JOptionPane;

public class Aula1Prog6 {

	public Aula1Prog6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String f1="", f2="", result="";
		int n1=0, n2=0;
		
		f1 = JOptionPane.showInputDialog("Entre o primeiro número: ");
		f2 = JOptionPane.showInputDialog("Entre o segundo número: ");
		
		n1 = Integer.parseInt(f1);
		n2 = Integer.parseInt(f2);
		
		if (n1 == n2)
			result = n1 + " == " + n2;

		if (n1 != n2)
			result = n1 + " != " + n2;

		if (n1 < n2)
			result = n1 + " < " + n2;

		if (n1 > n2)
			result = n1 + " > " + n2;

		if (n1 <= n2)
			result = n1 + " <= " + n2;

		if (n1 >= n2)
			result = n1 + " >= " + n2;
		
		JOptionPane.showMessageDialog(null, result,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}

}
