import java.util.Scanner;

public class CalculoSalario{
    
    public static void main(String[] args) {
        //Lendo os valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <=1200){
            //Atribuindo aliquota mediante ao salário.
            valorImposto = (float) (0.05 * valorSalario);
        } else if (valorSalario > 1200 && valorSalario <=2000){
            valorImposto = (float) (0.10 * valorSalario);
        } else 
            valorImposto = (float) (0.20 * valorSalario);

        // Calcula e imprime a saída (com 2 decimais).
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }


}