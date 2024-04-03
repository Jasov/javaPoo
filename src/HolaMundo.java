import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class HolaMundo extends JFrame {
    private Image backgroundImage;
    private JTextArea terminalOutput;
    private JTextField userInput;

    public HolaMundo() {
        super("Custom Terminal");
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\jasov\\OneDrive\\Escritorio\\descargas.png"));
        } catch (IOException e) {
            System.err.println("Error loading background image: " + e.getMessage());
        }

        terminalOutput = new JTextArea();
        terminalOutput.setEditable(false);
        add(terminalOutput, BorderLayout.CENTER);

        userInput = new JTextField();
        userInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = userInput.getText();
                // Handle user command here
                terminalOutput.append(input + "\n");
                userInput.setText("");
            }
        });
        add(userInput, BorderLayout.SOUTH);

        JButton executeButton = new JButton("Execute");
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInput.transferFocus();
            }
        });
        add(executeButton, BorderLayout.EAST);

        setLayout(new BorderLayout());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HolaMundo terminal = new HolaMundo();
                terminal.setVisible(true);
            }
        });
    }
}