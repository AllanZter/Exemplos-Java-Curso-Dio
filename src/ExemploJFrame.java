import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJFrame extends JFrame {
    private JTextField nomeField, sobrenomeField, idadeField, alturaField;
    private JButton submitButton;
    private JTextArea outputArea;

    public ExemploJFrame() {
        setTitle("Formulário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Sobrenome:"));
        sobrenomeField = new JTextField();
        add(sobrenomeField);

        add(new JLabel("Idade:"));
        idadeField = new JTextField();
        add(idadeField);

        add(new JLabel("Altura (m):"));
        alturaField = new JTextField();
        add(alturaField);

        submitButton = new JButton("Enviar");
        add(submitButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(outputArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = nomeField.getText();
                    String sobrenome = sobrenomeField.getText();
                    int idade = Integer.parseInt(idadeField.getText());
                    double altura = Double.parseDouble(alturaField.getText());

                    outputArea.setText("Seja bem-vindo! " + nome + " " + sobrenome + "\n" +
                            "Sua idade é: " + idade + "\n" +
                            "Sua altura é: " + altura + "m");
                } catch (NumberFormatException ex) {
                    outputArea.setText("Erro: Os campos idade e altura precisam ser numéricos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ExemploJFrame().setVisible(true);
        });
    }
}
