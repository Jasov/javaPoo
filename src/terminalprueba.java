import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class terminalprueba extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public terminalprueba() {
        setTitle("Terminal");
        setSize(800, 600);  // Ajusta el tamaño según tu imagen o preferencias
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar el área de la terminal
        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setOpaque(false);  // Hacer el área transparente
        terminalArea.setBorder(BorderFactory.createEmptyBorder());  // Eliminar bordes

        // Configurar el fondo del JScrollPane
        scrollPane = new JScrollPane(terminalArea);
        scrollPane.getViewport().setOpaque(false);  // Hacer el fondo del JScrollPane transparente
        scrollPane.setBorder(BorderFactory.createEmptyBorder());  // Eliminar bordes

        // Establecer el fondo utilizando arte ASCII (puedes reemplazar esto con la ruta de tu imagen)
        String asciiArt = "Tu ASCII Art aquí\nMultilínea si es necesario";
        terminalArea.setText(asciiArt);

        add(scrollPane);

        terminalArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    processCommand();
                    evt.consume();
                }
            }
        });

        setVisible(true);
    }

    private void processCommand() {
        String command = getCommand();
        appendToTerminal("Comando ingresado: " + command);

        // Ejecutar acciones basadas en comandos
        executeCommandAction(command);

        appendToTerminal("");  // Nueva línea para el próximo comando
        setCommand("");  // Limpiar el área de entrada
    }

    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                terminalArea.append(text + "\n");
                terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
            }
        });
    }

    private String getCommand() {
        String text = terminalArea.getText();
        int lastNewLine = text.lastIndexOf("\n");
        if (lastNewLine >= 0) {
            return text.substring(lastNewLine + 1);
        } else {
            return text;
        }
    }

    private void setCommand(String command) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                terminalArea.setText(terminalArea.getText() + command);
            }
        });
    }

    private void executeCommandAction(String command) {
        // Ejemplos de acciones basadas en comandos
        if (command.equalsIgnoreCase("saludar")) {
            appendToTerminal("Hola, ¡bienvenido!");
        } else if (command.equalsIgnoreCase("hora")) {
            String horaActual = obtenerHoraActual();
            appendToTerminal("Hora actual: " + horaActual);
        } else {
            appendToTerminal("Comando no reconocido: " + command);
        }
    }

    private String obtenerHoraActual() {
        // Lógica para obtener la hora actual
        return java.time.LocalTime.now().toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new terminalprueba();
            }
        });
    }
}
