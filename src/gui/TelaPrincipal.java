
import gui.CadastroGui;
import gui.PesquisaGui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaPrincipal extends JFrame{

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuCadastro = new JMenu("CADASTRO E PESQUISA");
    private JMenu menusai = new JMenu("SAIR");
    private JMenuItem submenuCadastra = new JMenuItem("CADASTRAR ANÚNCIOS",new ImageIcon("fo.png"));
    private JMenuItem submenuPesquisa = new JMenuItem("RELATÓRIO DE ANÚNCIOS",new ImageIcon("lup.png"));
    private JMenuItem sai = new JMenuItem("SAIR DO PROGRAMA",new ImageIcon("x1.png"));


    public TelaPrincipal(){
        setSize(650,515);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Espelho de Anúncios");
        initComponents();

        submenuCadastra.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                CadastroGui cadastra = new CadastroGui();
                cadastra.setVisible(true);
            }
        });
        
        submenuPesquisa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                PesquisaGui pesquisa = new PesquisaGui();
                pesquisa.setVisible(true);
            }
        });

        sai.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    private void initComponents() {
        menuCadastro.add(submenuCadastra);
        menuCadastro.addSeparator();
        menuCadastro.add(submenuPesquisa);
        menuCadastro.addSeparator();
        menusai.add(sai);
        menuBar.add(menuCadastro);
        menuBar.add(menusai);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        JPanel painel = new JPanel();
        JLabel l1 = new JLabel(new ImageIcon("FundoPrincipal.jpg"));
        painel.add(l1);
        add(painel,BorderLayout.CENTER);
        menuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));

    }

    public static void main(String[]args){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
