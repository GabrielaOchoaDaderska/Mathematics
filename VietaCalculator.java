import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VietaCalculator extends JFrame implements ActionListener {
    private JTextField tfA, tfB, tfC, tfX1, tfX2;
    private JButton btnCalc;

    public VietaCalculator() {
        // ustawienie tytułu okna
        setTitle("Kalkulator Wzorów Viète'a");
        // ustawienie rozmiaru okna
        setSize(360, 100);
        // ustawienie akcji po zamknięciu okna - w tym przypadku zakończenie aplikacji
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tworzenie panelu
        JPanel panel = new JPanel();
        // ustawienie layoutu na null
        panel.setLayout(null);
        // dodanie panelu do okna
        getContentPane().add(panel);

        // tworzenie etykiety
        JLabel lblA = new JLabel("A:");
        lblA.setBounds(10, 10, 80, 25);
        panel.add(lblA);

        JLabel lblB = new JLabel("B:");
        lblB.setBounds(10, 40, 80, 25);
        panel.add(lblB);

        JLabel lblC = new JLabel("C:");
        lblC.setBounds(10, 70, 80, 25);
        panel.add(lblC);

        JLabel lblX1 = new JLabel("X1:");
        lblX1.setBounds(190, 10, 80, 25);
        panel.add(lblX1);

        JLabel lblX2 = new JLabel("X2:");
        lblX2.setBounds(190, 40, 80, 25);
        panel.add(lblX2);

        // tworzenie pól tekstowych
        tfA = new JTextField();
        tfA.setBounds(50, 10, 100, 25);
        panel.add(tfA);

        tfB = new JTextField();
        tfB.setBounds(50, 40, 100, 25);
        panel.add(tfB);

        tfC = new JTextField();
        tfC.setBounds(50, 70, 100, 25);
        panel.add(tfC);

        tfX1 = new JTextField();
        tfX1.setBounds(230, 10, 100, 25);
        tfX1.setEditable(false);
        panel.add(tfX1);

        tfX2 = new JTextField();
        tfX2.setBounds(230, 40, 100, 25);
        tfX2.setEditable(false);
        panel.add(tfX2);

        // tworzenie przycisku
        btnCalc = new JButton("Oblicz");
        btnCalc.setBounds(50, 100, 100, 25);
        panel.add(btnCalc);
        btnCalc.addActionListener(this);

        // wyświetlanie okna
        setVisible(true);
    }

    // formula calculation Viète'a
    public void actionPerformed(ActionEvent ae) {
        // pobranie wartości z pól tekstowych
        double a = Double.parseDouble(tfA.getText());
        double b = Double.parseDouble(tfB.getText());
        double c = Double.parseDouble(tfC.getText());

        // obliczanie wzoru Viète'a
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        // wyświetlenie wyników w polach tekstowych
        tfX1.setText(Double.toString(x1));
        tfX2.setText(Double.toString(x2));
    }

    public static void main(String[] args) {
        new VietaCalculator();
    }
}
