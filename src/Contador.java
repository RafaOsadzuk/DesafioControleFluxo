import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("digite o segundo numero:");
        int num2 = scan.nextInt();

        scan.close();
        try{
            contar(num1, num2);
        }catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
    
        
    }
}
    
    static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
        if(num1 > num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num2 - num1;

        for(int i=1; i <= contagem; i++){
            System.out.println("imprimindo o número " + i);
        }
    }
}