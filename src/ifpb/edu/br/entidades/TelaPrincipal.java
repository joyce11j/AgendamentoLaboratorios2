package ifpb.edu.br.entidades;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal{
    private JFrame frame;
    private JPanel jPanel;
    private JTextField campoDeBusca;
    private ComponentePersonalizado componentePersonalizado;
    private JButton bntAnterior;
    private JButton bntPosterior;

    public TelaPrincipal(){
        frame = new JFrame();
        jPanel = new JPanel();
        componentePersonalizado = new ComponentePersonalizado(); // Instância do ComponentePersonalizado
        configurar();
    }

    public void configurar(){
        frame = new JFrame("Teste");
        frame.setSize(600, 400); // Ajuste do tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        bntAnterior = new JButton("<");
        bntPosterior = new JButton(">");

        jPanel.add(bntAnterior);
        jPanel.add(bntPosterior);

        campoDeBusca = new JTextField(20);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.NORTH;
        frame.add(campoDeBusca, c);

        // Adicionando o JPanel com os botões ao JFrame
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.NORTH;
        frame.add(jPanel, c);

        // Adicionando o ComponentePersonalizado ao JFrame
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        frame.add(componentePersonalizado, c);

    }

    public void mostrar() {
        frame.setVisible(true);
    }
}
