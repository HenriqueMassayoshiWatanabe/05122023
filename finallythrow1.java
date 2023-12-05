package exJ3;
import java.util.*;

public class finallythrow1 {
    // criando método personalizado
    public static void verificarIdade(short idade) {
        if (idade < 18) {
            throw new ArithmeticException("Idade não permitida");
        } else {
            System.out.println("Acesso garantido!");
        }
    }

    public static void main(String[] args) {
        
            Scanner scnIdade = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idadeUsuario = scnIdade.nextShort();
            
          try {
            verificarIdade(idadeUsuario);
            
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
            verificarIdade(idadeUsuario);
        } finally {
            System.out.println("Não tem mais o que fazer... Encerrando Algorítimo");
        }
    }
}