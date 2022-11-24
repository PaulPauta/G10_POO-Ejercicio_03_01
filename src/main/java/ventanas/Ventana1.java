/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Juan Diego Roman
 */
public class Ventana1 extends JFrame {

    private final List<JPanel> jPanelList = new ArrayList<>();
    JLabel jl1, jl2, jl3, jl4, jl5;

    public Ventana1(String titulo) {
        this.setTitle(titulo);
        this.setSize(new Dimension(400, 130));
        this.setLocation(new Point(250, 250));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }

    public void iniciarComponentes() {

        jl1 = new JLabel("Button 1");
        jl2 = new JLabel("Button 3");
        jl3 = new JLabel("2");
        jl4 = new JLabel("Button 5");
        jl5 = new JLabel("Long-Named Button 4");

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(1).add(jl1);
        this.jPanelList.get(1).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(2).add(jl2);
        this.jPanelList.get(2).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(3).add(jl3);
        this.jPanelList.get(3).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(4).add(jl4);
        this.jPanelList.get(4).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(5).add(jl5);
        this.jPanelList.get(5).setBorder(new EtchedBorder());

        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.WEST);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.SOUTH);
    }

}
