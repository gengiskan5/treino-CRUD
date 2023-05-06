package Cadastros;

import java.sql.*;


public class Dao {
    Connection con; // Conexão ao Banco de dados
    PreparedStatement stmt; // Acessa a Tabela ( insert, Updated, delete, select)
    ResultSet rs; // Consulta A tabela (select)
    CallableStatement call; // Procedures e Function

    public  void open() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password = "1234";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);

        }catch (SQLException | ClassNotFoundException ex){
            System.out.println("Erro ao conectar com o banco");
        }

    }
    public  void close() throws Exception{
        con.close();
    }
}
