import java.sql.*;
import java.util.*;

public class SelectCRUD {
    public static void main(String[] args) {
        String status = "Nada aconteceu";
        try {
            Scanner scnUsuario = new Scanner(System.in);
            Scanner scnSenha = new Scanner(System.in);
            Connection conn = MySQLConnector.conectar();
            System.out.println("Digite o usuario e tecle Enter");
            String txtUsuario = scnUsuario.nextLine();
            System.out.println("Digite a senha e tecle Enter");
            String txtSenha = scnSenha.nextLine();
            String strSqlSelect = "SELECT * from `teste`.`tbl_usuarios` WHERE `usuario` = '" + txtUsuario + "' AND `senha` = '" + txtSenha + "';";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);
            int qtdResultados = 0;
            while (rsSql.next()) {
                qtdResultados++;
            }
            status = "Usuário ou senha inválidos, tente novamente.";
            if (qtdResultados > 0) {
                status = "Login realizado com sucesso";
            }
            stmSql.close();
            rsSql.close();
            scnUsuario.close();
            scnSenha.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (Exception e) {
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
    }
}