package exJ3;
import java.util.*;
public class finallythrow2 {

    public static void sairDoFilme(String sair) {
        if (sair.toUpperCase().equals("SAIR")) {
            throw new ArithmeticException("Saindo do filme...");
        } else {
            System.out.println("Continuando filme");
        }
    }

    public static void verificarFilme(int tempo, int intervaloDeTempo) {
        try {
            Thread.sleep(intervaloDeTempo);
            System.out.println("Assistindo filme. Já se passaram " + tempo + " segundos.");
        } catch (InterruptedException e) {
            System.out.println("Ops! Houve o erro InterruptedException: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Ops! Ocorreu o erro IllegalArgumentException: " + e);
        } finally {
            System.out.println("Acabou finally do método verificarFilme().");
        }
        System.out.println("Depois do finally do método verificarFilme().");
    }

    public static void main(String[] args) {
        try {
            int tempoFilme = 2;
            int inicio = 0;
            System.out.println("Filme iniciou...");
            Scanner scnSair = new Scanner(System.in);
            while (inicio < tempoFilme) {
                verificarFilme(inicio, 1000);
                inicio++;
                System.out.println("Deseja continuar assistindo filme? Digite \"sair\" e tecle Enter para sair");
                sairDoFilme(scnSair.nextLine().toUpperCase());
            }
            System.out.println("Fim do filme.");
            scnSair.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        } finally {
            System.out.println("Acabou finally do método main() construtor.");
        }
        System.out.println("Depois do finally do método main() construtor.");
    }
}