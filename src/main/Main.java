package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Main extends javax.swing.JFrame implements ActionListener {

    private int x = 12;
    private int y = 179;
    
    public Main() {
        initComponents();
        
        btn0.addActionListener(this);
        
        for(int i = 1; i < 10; i++){
            JButton boton = new JButton();
            boton.addActionListener(this);
            boton.setText(String.valueOf(i));
            
            switch(i){
                case 1: break;
                case 4: x += 97; y = 179; break;
                case 7: x += 97; y = 179; break;
                default: y += 63; break;
            }
            
            boton.setBounds(0 + x, 0 + y, 80, 45);

            this.add(boton);
        }
        
        btnAC.addActionListener((ActionEvent e) -> {
            
            tfPantalla.setText("");
            Calculo.dropMemoria();
            Calculo.dropOperador();
        });
        
        btnSum.addActionListener((ActionEvent e) -> {
            
            tfPantalla.setText(Main.tfPantalla.getText() + " + ");
            Calculo.Resultado();
            Calculo.setOperador("+");
        });
        
        btnRest.addActionListener((ActionEvent e) -> {
            
            tfPantalla.setText(Main.tfPantalla.getText() + " - ");
            Calculo.Resultado();
            Calculo.setOperador("-");
        });
        
        btnDivide.addActionListener((ActionEvent e) -> {
            
            tfPantalla.setText(Main.tfPantalla.getText() + " / ");
            Calculo.Resultado();
            Calculo.setOperador("/");
        });
        
        btnMultiply.addActionListener((ActionEvent e) -> {
            
            tfPantalla.setText(Main.tfPantalla.getText() + " * ");
            Calculo.Resultado();
            Calculo.setOperador("*");
        });
        
        btnEqual.addActionListener((ActionEvent e) -> {
            
            Calculo.Resultado();
            //Calculo.dropOperador();
            tfPantalla.setText(String.valueOf(Calculo.getResultado()));
        });
    }
    
    // Gestiona la introducion de número de todos los botones
    
    @Override public void actionPerformed(ActionEvent e){
        
        String numSelected = ((JButton) e.getSource()).getText();
        Calculo.memoriaTemp = Integer.parseInt("" + Calculo.memoriaTemp + ((JButton) e.getSource()).getText());
        tfPantalla.setText(tfPantalla.getText() + numSelected);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        tfPantalla = new javax.swing.JTextField();
        btnAC = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(416, 494));
        setPreferredSize(new java.awt.Dimension(395, 425));
        getContentPane().setLayout(null);

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Calculadora");
        getContentPane().add(lbTitle);
        lbTitle.setBounds(12, 13, 90, 22);

        tfPantalla.setMinimumSize(new java.awt.Dimension(200, 50));
        tfPantalla.setPreferredSize(new java.awt.Dimension(200, 50));
        getContentPane().add(tfPantalla);
        tfPantalla.setBounds(12, 48, 371, 50);

        btnAC.setText("AC");
        btnAC.setMinimumSize(new java.awt.Dimension(80, 45));
        btnAC.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnAC);
        btnAC.setBounds(13, 116, 80, 45);

        btnSum.setText("+");
        btnSum.setMinimumSize(new java.awt.Dimension(80, 45));
        btnSum.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnSum);
        btnSum.setBounds(304, 116, 80, 45);

        btnRest.setText("-");
        btnRest.setMinimumSize(new java.awt.Dimension(80, 45));
        btnRest.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnRest);
        btnRest.setBounds(304, 179, 80, 45);

        btnDivide.setText("/");
        btnDivide.setMinimumSize(new java.awt.Dimension(80, 45));
        btnDivide.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnDivide);
        btnDivide.setBounds(304, 242, 80, 45);

        btnMultiply.setText("*");
        btnMultiply.setMinimumSize(new java.awt.Dimension(80, 45));
        btnMultiply.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnMultiply);
        btnMultiply.setBounds(304, 305, 80, 45);

        btnEqual.setText("=");
        btnEqual.setMinimumSize(new java.awt.Dimension(80, 45));
        btnEqual.setPreferredSize(new java.awt.Dimension(80, 45));
        getContentPane().add(btnEqual);
        btnEqual.setBounds(304, 368, 80, 45);

        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(39, 45));
        getContentPane().add(btn0);
        btn0.setBounds(13, 368, 279, 45);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSum;
    private javax.swing.JLabel lbTitle;
    protected static javax.swing.JTextField tfPantalla;
    // End of variables declaration//GEN-END:variables
}
