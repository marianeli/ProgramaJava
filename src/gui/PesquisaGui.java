package gui;

import factory.ConnectionFactory;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import modelo.Cadastro;


public class PesquisaGui extends JFrame{
    
    Cadastro cadastro;
    
    public PesquisaGui() {
        setSize(700,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Relatório de Anúncio");
        initComponents(); 
    }
       
    private void initComponents() {
        JPanel painel = new JPanel(new GridLayout(1,4));
        JPanel painel2 = new JPanel(new GridLayout(1,2));
        JLabel l1 = new JLabel("Cliente: ");
        final JTextField pesquisacliente = new JTextField();
        JLabel l2 = new JLabel("Dt.Inicio: ");
        final JTextField pesquisaDtInicio = new JTextField();
        JLabel l3 = new JLabel("Dt.Término: ");
        final JTextField pesquisaDtTermino = new JTextField();
        JButton bt2 = new JButton("Pesquisar");
        JTextArea area = new JTextArea(10, 55);
        JScrollPane scrollpane = new JScrollPane(area);
        Container pane = this.getContentPane();
        area.setLineWrap(true);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pane.add(scrollpane);           
        add(painel,BorderLayout.NORTH);
        //add(painel2,BorderLayout.SOUTH);
        add(painel2,BorderLayout.NORTH);
        
        painel2.add(l1);
        painel2.add(pesquisacliente);
        painel2.add(l2);
        painel2.add(pesquisaDtInicio);
        painel2.add(l3);
        painel2.add(pesquisaDtTermino);
        painel2.add(bt2);
        
        
         bt2.addActionListener(new ActionListener() {
            @SuppressWarnings("empty-statement")
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                Connection connection = new ConnectionFactory().getConnection();
                String pesqcliente = pesquisacliente.getText();
                String query = "SELECT nome_anuncio, cliente, dtInicio, dtTermino, valor, visualizacao, cliques, compartilhamentos FROM anuncio";
                Statement stmt = null;
                try{
                    stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    area.append("Anúncio         Cliente         Dt.Inicio   Dt.Término   Investimento   Visualizações    Cliques   Compartilhamentos\r\n");
                    area.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------- \r\n");
                    while(rs.next()){
                        String nome_anuncio = rs.getString("nome_anuncio");
                        nome_anuncio = String.format("%-40s", nome_anuncio);
                        String cliente = rs.getString("cliente");
                        String dtInicio = rs.getString("dtInicio");
                        String dtTermino = rs.getString("dtTermino");
                        String valor = rs.getString("valor");
                        String visualizacao = rs.getString("visualizacao");
                        String cliques = rs.getString("cliques");
                        String compartilhamentos = rs.getString("compartilhamentos");
                        //adiciona anúncio na lista
                        area.append("\r\n"+nome_anuncio.substring(0, 15)+" "+cliente+"       "+dtInicio+"   "+dtTermino+"       "+valor+"            "+visualizacao+"                     "+cliques+"             "+compartilhamentos);
                    }
                    } catch (SQLException ex) {
                    Logger.getLogger(PesquisaGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         } 
    );
    }
}
