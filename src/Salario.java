import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        double salario = 1000;
        double incremento = 0.015;
        LocalDate dataAtual = LocalDate.now();

        for(int ano = 1996; ano <= dataAtual.getYear(); ano++){
            System.out.println("Ano: " + ano);
            System.out.println("Incremento: " + incremento);
            salario = (salario * (1 + incremento));
            System.out.println("Salario: " + Math.round(salario));
            incremento *= 2;
        }
        System.out.println("Salário em 2021: " + salario);

    }
}


