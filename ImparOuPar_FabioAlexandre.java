
package ImparOuPar_FabioAlexandre;

import java.util.Scanner;

public class ImparOuPar_FabioAlexandre{

    
    public static void main(String[] args) {
        Scanner entrada;
        int num1;
        entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        num1 = entrada.nextInt();
        if(num1 % 2 == 0)
        {System.out.println("O numero:"+num1+ " é par");
        
       
        }else System.out.println("O numero:" +num1+ " é impar");
        
        }
        
        
    }
    


