package ifpb.edu.br.entidades;

import javax.swing.*;
import java.awt.*;

public class Window {
    protected JFrame frame;
    private JLabel titulo;
    private String nome;
    private String senha;

    public Window() {
        this(new JLabel("Default Title"), "Default Name", "Default Password");
    }
    public Window(JLabel titulo, String nome, String senha) {
        this.frame = new JFrame();
        this.titulo = titulo;
        this.nome = nome;
        this.senha = senha;
        configurar();
    }

    public void configurar(){
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        titulo.setText("Login");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));  // Configura o `titulo` passado ao construtor
        frame.add(titulo, BorderLayout.NORTH);  // Adiciona o `titulo` ao frame
    }

    public void mostrar() {
        frame.setVisible(true);  // Torna a janela visível
    }
}
