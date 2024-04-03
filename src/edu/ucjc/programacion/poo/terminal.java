package edu.ucjc.programacion.poo;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public terminal() {
        setTitle("Terminal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        scrollPane = new JScrollPane(terminalArea);
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new terminal();
            }
        });
    }
}




/*
public class terminal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Terminal");
            frame.setSize(900, 700);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Crear un panel
            JPanel dataPanel = new JPanel();
            dataPanel.setLayout(new FlowLayout());

            // Crear un componente para mostrar datos (puede ser una etiqueta, un área de texto, etc.)
            JLabel dataLabel = new JLabel("Datos: ");

            // Agregar el componente al panel
            dataPanel.add(dataLabel);

            // Agregar el panel al marco
            frame.add(dataPanel);

            // Mostrar el marco
            frame.setVisible(true);

            // Simular la actualización de datos
            actualizarDatos(dataLabel);
        });
    }

    // Método para simular la actualización de datos
    private static void actualizarDatos(JLabel dataLabel) {
        // Supongamos que obtienes datos de alguna fuente (por ejemplo, una base de datos)
        // y luego actualizas el componente en el panel con esos datos.
        String nuevosDatos = obtenerDatosDeAlgunaFuente();
        dataLabel.setText("Datos: " + nuevosDatos);
    }

    // Método simulado para obtener datos de alguna fuente
    private static String obtenerDatosDeAlgunaFuente() {
        return "12345";
    }
}

import java.util.Scanner;

public class terminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a tu terminal personalizada:  ");
        System.out.print("$ ");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                System.out.println("Saliendo de la terminal.");
                break;
            }

            ejecutarComando(input);
            System.out.print("$ ");
        }
    }

    private static void ejecutarComando(String comando) {
        // Aquí puedes agregar tus propios comandos definidos por ti
        if ("miComando".equals(comando)) {
            System.out.println("Ejecutaste tu propio comando.");
        } else {
            // Si no es un comando personalizado, ejecuta el comando en el sistema
            ejecutarComandoDeLinux(comando);
        }
    }

    private static void ejecutarComandoDeLinux(String comando) {
        try {
            Process proceso = Runtime.getRuntime().exec(comando);
            Scanner scanner = new Scanner(proceso.getInputStream());

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            int exitCode = proceso.waitFor();
            System.out.println("Código de salida: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


*/
