package ifpb.edu.br.entidades;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ComponentePersonalizado extends JPanel {
    public ComponentePersonalizado() {
        this.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.ipadx = 50;
        c.ipady = 25;

        boolean[][] blocosDeHorario = new boolean[][] {
                { false, false, false, false, false },
                { false, false, false, false, false },
                { true, false, false, false, false },
                { true, false, false, true, false },
                { true, false, false, false, false },
                { false, false, false, false, false },
                { false, false, false, true, false },
                { false, false, false, true, false },
                { false, false, false, false, false },
                { false, false, false, false, false },
        };

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                c.gridx = coluna;
                c.gridy = linha;

                JPanel p = new JPanel();
                if (blocosDeHorario[linha][coluna]) {
                    p.setBackground(new Color(0xFFCBCB));
                } else {
                    p.setBackground(new Color(0xCBFFCB));
                }

                p.setBorder(BorderFactory.createLineBorder(Color.black));
                this.add(p, c);
            }
        }
    }
}

