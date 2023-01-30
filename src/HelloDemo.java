import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HelloDemo extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton generateButton;
    private JTextField textField1;
    private JButton copyButton;
    private JTextArea textArea1;
    private Random random;

    private void setGenerateButton(java.awt.event.ActionEvent evt){
        Random generator = new Random();
        int nahodne = generator.nextInt(100);

    }

    public HelloDemo(){
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Random r = new java.util.Random();
                int nahodne = r.nextInt(100);
                txtName.setText(Integer.toString(nahodne));
            }
        });
        copyButton.addActionListener(e -> {
            textArea1.setText(textArea1.getText() + "\n" + txtName.getText());
        });
    }

    public static void main(String[] args) {
        HelloDemo h = new HelloDemo();
        h.setContentPane(h.panelMain);
        h.setTitle("Random generator");
        h.setBounds(600, 200, 600, 200);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
