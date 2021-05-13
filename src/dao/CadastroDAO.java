package dao;
import factory.ConnectionFactory;
import modelo.Cadastro;
import java.sql.*;
import java.sql.PreparedStatement;
public class CadastroDAO { 
    @SuppressWarnings("FieldMayBeFinal")
    private Connection connection;
    Long id;
    String nome_anuncio;
    String cliente;
    String dtInicio;
    String dtTermino;
    double valor;
    int visualizacao;
    int cliques;
    int compartilhamentos;
    
    public CadastroDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    @SuppressWarnings("ConvertToTryWithResources")
    public void adiciona(Cadastro cadastro){ 
        String sql = "INSERT INTO anuncio(nome_anuncio,cliente,dtInicio,dtTermino,valor,visualizacao,cliques,compartilhamentos) VALUES(?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastro.getNome_anuncio());
            stmt.setString(2, cadastro.getCliente());
            stmt.setString(3, cadastro.getDtInicio());
            stmt.setString(4, cadastro.getDtTermino());
            stmt.setDouble(5, cadastro.getValor());
            stmt.setInt(6, cadastro.getVisualizacao());
            stmt.setInt(7, cadastro.getCliques());
            stmt.setInt(8, cadastro.getCompartilhamentos());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    public void Busca(Cadastro cadastro){ 
        String sql = "Select * from anuncio";    
    } 
    
}