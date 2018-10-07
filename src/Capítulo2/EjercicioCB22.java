package Capítulo2;
import javax.swing.JOptionPane;

public class EjercicioCB22 {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Introduce un número");
		int num1 = Integer.parseInt(numero1);
		String numero2 = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(numero2);
		String numero3 = JOptionPane.showInputDialog("Introduce un número");
		int num3 = Integer.parseInt(numero3);
		String numero4 = JOptionPane.showInputDialog("Introduce un número");
		int num4 = Integer.parseInt(numero4);
		String numero5 = JOptionPane.showInputDialog("Introduce un número");
		int num5 = Integer.parseInt(numero5);
		/* 
		 * Declaramos las variables al programa
		 */
        int numneg1 = 0;
        int numbajo1 = 0;
        int nummedio1 = 0;
        int numgrande1 = 0;
        int numneg2 = 0;
        int numbajo2 = 0;
        int nummedio2 = 0;
        int numgrande2 = 0;
        int numneg3 = 0;
        int numbajo3 = 0;
        int nummedio3 = 0;
        int numgrande3 = 0;
        int numneg4 = 0;
        int numbajo4 = 0;
        int nummedio4 = 0;
        int numgrande4 = 0;
        int numneg5 = 0;
        int numbajo5 = 0;
        int nummedio5 = 0;
        int numgrande5 = 0;
        
        if (num1 < 0) {
            return ;
        }
        else {
            if (num1 >= 0 && num1 <= 25) { 
                numbajo1 = 1;
            }
            else {
                if (num1 >=26 && num1 <= 250) {
                  nummedio1 = 1;
                }
                
                else { 
                    if (num1 > 250) {
                        numgrande1 = 1;
                }
                    
                }
        }
        
        

}
        if (num2 < 0) {
            return;
        }
        else {
            if (num2 >= 0 && num2 <= 25) { 
                numbajo2 = 1;
            }
            else {
                if (num2 >=26 && num2 <= 250) {
                    nummedio2 = 1;
                }
                else { 
                    if (num2 > 250) {
                        numgrande2 = 1;
                }
                    
                }
        }
        
        

}
        if (num3 < 0) {
            return;
        }
        else {
            if (num3 >= 0 && num3 <= 25) { 
                numbajo3 = 1;
            }
            else {
                if (num3 >=26 && num3 <= 250) {
                    nummedio3 = 1;
                }
                else { 
                    if (num3 > 250) {
                        numgrande3 = 1;
                }
                    
                }
        }
        
        

}
        if (num4 < 0) {
            return;
        }
        else {
            if (num4 >= 0 && num4 <= 25) { 
                 numbajo4 = 1;
            }
            else {
                if (num4 >=26 && num4 <= 250) {
                    nummedio4 = 1;
                }
                else { 
                    if (num4 > 250) {
                        numgrande4 = 1;
                }
                    
                }
        }
            
        

}
        if (num5 < 0) {
            return;
        }
        else {
            if (num5 >= 0 && num5 <= 25) { 
                numbajo5 = 1;
            }
            else {
                if (num5 >=26 && num5 <= 250) {
                    nummedio5 = 1;
                }
                else { 
                    if (num5 > 250) {
                        numgrande5 = 1;
                }
                    
                }
        }
        
        

}
    int sumbajo = numbajo1 + numbajo2 + numbajo3 + numbajo4 + numbajo5;
    int summedio = nummedio1 + nummedio2 + nummedio3 + nummedio4 + nummedio5;
    int sumgrande = numgrande1 + numgrande2 + numgrande3 + numgrande4 + numgrande5;
    
    System.out.println("Números bajos: " + sumbajo );
    System.out.println("Números medios: " + summedio);
    System.out.println("Números altos: " + sumgrande);
}


}
