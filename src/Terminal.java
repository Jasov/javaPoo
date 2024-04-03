/*import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public Terminal() {
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

        appendToTerminal(getCurrentPath() + "> ");

        terminalArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processCommand();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private void showCommandHistory() {
        String commandHistory = terminalArea.getText();
        appendToTerminal(commandHistory);
    }

    private String getCurrentPath() {
        return "Javalinux";
    }

    private void processCommand() {
        String command = getCommand();
        executeCommand(command);
        appendToTerminal(getCurrentPath() + "> ");
        setCommand("");
    }

    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
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
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    private void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "saludo":
                appendToTerminal("Buenas tardes");
                break;
            case "clear":
                terminalArea.setText("");
                terminalArea.setCaretPosition(0);
                break;
            case "history":
                showCommandHistory();
                break;
            default:
                executeLinuxCommand(command);
                break;
        }
    }

    private void executeLinuxCommand(String command) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Capturar la salida del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                appendToTerminal(line);
            }

            // Esperar a que el proceso termine
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            appendToTerminal("Error al ejecutar el comando");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Terminal());
    }
}
*/



/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public Terminal() {
        setTitle("Terminal");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel izquierdo con una etiqueta de ejemplo (puedes reemplazarla con una imagen)
        JPanel leftPanel = new JPanel(new BorderLayout());
        JLabel visualLabel = new JLabel("Visual Content");
        visualLabel.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.add(visualLabel);

        // Panel derecho con la terminal
        JPanel rightPanel = new JPanel(new BorderLayout());

        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        scrollPane = new JScrollPane(terminalArea);
        rightPanel.add(scrollPane, BorderLayout.CENTER);


        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(250); 

        add(splitPane);

        appendToTerminal(getCurrentPath() + "> ");

        terminalArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processCommand();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private void showCommandHistory() {
        String commandHistory = terminalArea.getText();
        appendToTerminal(commandHistory);
    }

    private String getCurrentPath() {
        return "Javalinux";
    }

    private void processCommand() {
        String command = getCommand();
        executeCommand(command);
        appendToTerminal(getCurrentPath() + "> ");
        setCommand("");
    }

    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
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
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    private void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "saludo":
                appendToTerminal("Buenas tardes");
                break;
            case "clear":
                terminalArea.setText("");
                terminalArea.setCaretPosition(0);
                break;
            case "history":
                showCommandHistory();
                break;
            default:
                executeLinuxCommand(command);
                break;
        }
    }

    private void executeLinuxCommand(String command) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Capturar la salida del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                appendToTerminal(line);
            }

            // Esperar a que el proceso termine
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            appendToTerminal("Error al ejecutar el comando");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Terminal());
    }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public Terminal() {
        setTitle("Terminal");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel izquierdo con arte ASCII y tiempo/clima
        JPanel leftPanel = new JPanel(new BorderLayout());
        JTextArea asciiArtArea = new JTextArea(getAsciiArt());
        asciiArtArea.setEditable(false);
        asciiArtArea.setBackground(Color.BLACK);
        asciiArtArea.setForeground(Color.GREEN);
        asciiArtArea.setFont(new Font("Monospaced", Font.PLAIN, 8));

        leftPanel.add(asciiArtArea, BorderLayout.CENTER);

 

        // Panel derecho con la terminal
        JPanel rightPanel = new JPanel(new BorderLayout());

        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        scrollPane = new JScrollPane(terminalArea);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        // Crear el JSplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(200); // Establecer la ubicación de la barra divisoria

        add(splitPane);

        appendToTerminal(getCurrentPath() + "> ");

        terminalArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processCommand();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private String getAsciiArt() {
       
    	
    
        return  
        		"                 .88888888:.\n" +
                "                88888888.88888.\n" +
                "              .8888888888888888.\n" +
                "              888888888888888888\n" +
                "              88' _`88'_  `88888\n" +
                "              88 88 88 88  88888\n" +
                "              88_88_::_88_:88888\n" +
                "              88:::,::,:::::8888\n" +
                "              88`:::::::::'`8888\n" +
                "             .88  `::::'    8:88.\n" +
                "            8888            `8:888.\n" +
                "          .8888'             `888888.\n" +
                "         .8888:..  .::.  ...:'8888888:.\n" +
                "        .8888.'     :'     `'::`88:88888\n" +
                "       .8888        '         `.888:8888.\n" +
                "      888:8         .           888:88888\n" +
                "    .888:88        .:           888:88888:\n" +
                "    8888888.       ::           88:888888\n" +
                "    `.::.888.      ::          .88888888\n" +
                "   .::::::.888.    ::         :::`8888'.:.\n" +
                "  ::::::::::.888   '         .::::::::::::\n" +
                "  ::::::::::::.8    '      .:8::::::::::::.\n" +
                " .::::::::::::::.        .:888:::::::::::::\n" +
                " :::::::::::::::88:.__..:88888:::::::::::'\n" +
                "  `'.:::::::::::88888888888.88:::::::::'\n" +
                "...     `':::_:' -- '' -'-' `':_::::'`\n";
      

    }


    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
        });
    }

    private String getCurrentPath() {
        return "Javalinux";
    }

    private void processCommand() {
        String command = getCommand();
        executeCommand(command);
        appendToTerminal(getCurrentPath() + "> ");
        setCommand("");
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
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    private void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "saludo":
                appendToTerminal("Buenas tardes");
                break;
            case "clear":
                terminalArea.setText("");
                terminalArea.setCaretPosition(0);
                break;
            case "history":
                showCommandHistory();
                break;
            default:
                executeLinuxCommand(command);
                break;
        }
    }

    private void showCommandHistory() {
        String commandHistory = terminalArea.getText();
        appendToTerminal(commandHistory);
    }

    private void executeLinuxCommand(String command) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Capturar la salida del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                appendToTerminal(line);
            }

            // Esperar a que el proceso termine
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            appendToTerminal("Error al ejecutar el comando");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Terminal());
    }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;

    public Terminal() {
        setTitle("Terminal");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel leftPanel = new JPanel(new BorderLayout());
        JTextArea asciiArtArea = new JTextArea(getAsciiArt());
        asciiArtArea.setEditable(false);
        asciiArtArea.setBackground(Color.BLACK);
        asciiArtArea.setForeground(Color.GREEN);
        asciiArtArea.setFont(new Font("Monospaced", Font.PLAIN, 8));

        leftPanel.add(asciiArtArea, BorderLayout.CENTER);

        
        JTextArea greetingArea = new JTextArea("Comandos Propios: +\n"+"paint\n"+"agregar mas comandos\n");
        greetingArea.setEditable(false);
        greetingArea.setBackground(Color.BLACK);
        greetingArea.setForeground(Color.YELLOW);
        greetingArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        leftPanel.add(greetingArea, BorderLayout.SOUTH);

    
        JPanel rightPanel = new JPanel(new BorderLayout());

        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        scrollPane = new JScrollPane(terminalArea);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

      
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(200); //  ubicación de la barra divisoria

        add(splitPane);

        appendToTerminal(getCurrentPath() + "> ");

        terminalArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processCommand();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private String getAsciiArt() {
        return  
            "                 .88888888:.\n" +
            "                88888888.88888.\n" +
            "              .8888888888888888.\n" +
            "              888888888888888888\n" +
            "              88' _`88'_  `88888\n" +
            "              88 88 88 88  88888\n" +
            "              88_88_::_88_:88888\n" +
            "              88:::,::,:::::8888\n" +
            "              88`:::::::::'`8888\n" +
            "             .88  `::::'    8:88.\n" +
            "            8888            `8:888.\n" +
            "          .8888'             `888888.\n" +
            "         .8888:..  .::.  ...:'8888888:.\n" +
            "        .8888.'     :'     `'::`88:88888\n" +
            "       .8888        '         `.888:8888.\n" +
            "      888:8         .           888:88888\n" +
            "    .888:88        .:           888:88888:\n" +
            "    8888888.       ::           88:888888\n" +
            "    `.::.888.      ::          .88888888\n" +
            "   .::::::.888.    ::         :::`8888'.:.\n" +
            "  ::::::::::.888   '         .::::::::::::\n" +
            "  ::::::::::::.8    '      .:8::::::::::::.\n" +
            " .::::::::::::::.        .:888:::::::::::::\n" +
            " :::::::::::::::88:.__..:88888:::::::::::'\n" +
            "  `'.:::::::::::88888888888.88:::::::::'\n" +
            "...     `':::_:' -- '' -'-' `':_::::'`\n";
    }

    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
        });
    }

    private String getCurrentPath() {
        return "Javalinux";
    }

    private void processCommand() {
        String command = getCommand();
        executeCommand(command);
        appendToTerminal(getCurrentPath() + "> ");
        setCommand("");
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
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    private void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "saludo":
                appendToTerminal("Buenas tardes");
                break;
            case "clear":
                terminalArea.setText("");
                terminalArea.setCaretPosition(0);
                break;
          //  case "history":
           //     showCommandHistory();
            //    break;
            default:
                executeLinuxCommand(command);
                break;
        }
    }

  //  private void showCommandHistory() {
   //     String commandHistory = terminalArea.getText();
    //    appendToTerminal(commandHistory);
   // }

    private void executeLinuxCommand(String command) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

         
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                appendToTerminal(line);
            }

        
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            appendToTerminal("Error al ejecutar el comando");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Terminal());
    }
}






import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList; 

public class Terminal extends JFrame {
    public JTextArea terminalArea;
    public JScrollPane scrollPane;
    private ArrayList<String> commandHistory;
    private String terminalName;

    public Terminal() {
        // Configuración de la ventana principal
        setTitle("Terminal");

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Solicitar al usuario que ingrese el nombre de la terminal
        terminalName= JOptionPane.showInputDialog(null, "Ingrese el nombre de la terminal:");

        // Configuración del área de texto (terminal)
        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.DARK_GRAY);
        terminalArea.setForeground(Color.CYAN);
        terminalArea.setCaretColor(Color.PINK);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

        // Configuración del panel de desplazamiento para el área de texto
        scrollPane = new JScrollPane(terminalArea);
        add(scrollPane);

        // Mostrar la ruta actual antes de solicitar el comando
        appendToTerminal(getCurrentPath() + "> ");
        
        // Inicializar el historial de comandos
        commandHistory = new ArrayList<>();

        // Configuración del evento de teclado para procesar comandos al presionar Enter
        terminalArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    processCommand();
                    evt.consume();
                }
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método para obtener la ruta actual del directorio de trabajo
    public String getCurrentPath() {
        return terminalName+":";
    	//return "꧁𝐁𝐈𝐄𝐍𝐕𝐄𝐍𝐈𝐃𝐎꧂:";
    }
    
    // Método para procesar el comando ingresado
    public void processCommand() {
        String command = getCommand();
        commandHistory.add(command);
        switch (command.toLowerCase()) {
            case "hola":
                appendToTerminal("\nholaa guap@");
               break;
            case "clear":
                terminalArea.setText(""); // Limpiar el contenido del área de texto
                terminalArea.setCaretPosition(0); // Mover el cursor al principio del texto
                break;
            case "history":
                appendToTerminal("");
                for (int i = 0; i < commandHistory.size(); i++) {
                    appendToTerminal((i + 1) + " " + commandHistory.get(i));
                }
                break;
            case "pintar":
            	appendToTerminal("");
            	startPaintSimulator();
                break;
            case "tematica" :
            	appendToTerminal("");
                String opcion = JOptionPane.showInputDialog("Seleccione la temática:\n1. Hacker \n2. Coquette \n3. Años 80 \n4. Clásico");

                switch (opcion) {
                    case "1":
                        terminalArea.setBackground(Color.BLACK);
                        terminalArea.setForeground(Color.GREEN);
                        break;
                    case "2":
                        terminalArea.setBackground(Color.PINK);
                        terminalArea.setForeground(Color.MAGENTA);
                        break;
                    case "3":
                        terminalArea.setBackground(Color.WHITE);
                        terminalArea.setForeground(Color.BLACK);
                        break;
                    case "4":
                        terminalArea.setBackground(Color.BLACK);
                        terminalArea.setForeground(Color.WHITE);
                        break;
                    default:
                        appendToTerminal("Opción no válida.");
                        break;
                }
                break;
            case "personalizar": 
                setTerminalColors();
                break;
            case "fiesta":
            	appendToTerminal("");
                new Thread(() -> {
                    try {
                        for (int i = 0; i < 10; i++) {
                            terminalArea.setBackground(Color.RED);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.GREEN);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.BLUE);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.MAGENTA);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.RED);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.YELLOW);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.CYAN);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.ORANGE);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.BLUE);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.GREEN);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.RED);
                            Thread.sleep(50);
                            terminalArea.setBackground(Color.BLUE);
                            Thread.sleep(50);
                        }
                        terminalArea.setBackground(Color.BLACK); // Vuelve al color negro al final
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
                break;
            default:
                // Si no coincide con ningún comando predefinido, se asume que es un comando de Bash
            	appendToTerminal("");
            	executeBashCommand(command);
                break;
        }
        appendToTerminal(getCurrentPath() + "> ");  // Mostrar la ruta actual antes de solicitar el próximo comando
        setCommand("");  // Limpiar el área de entrada
    }

    // Método para ejecutar el comando ingresado en bash
    private void executeBashCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"bash", "-c", command});
            process.waitFor();

            // Leer la salida del comando y mostrarla en el terminal
            java.util.Scanner scanner = new java.util.Scanner(process.getInputStream()).useDelimiter("\\A");
            appendToTerminal(scanner.hasNext() ? scanner.next() : "");
        } catch (Exception e) {
            appendToTerminal("Error al ejecutar el comando: " + e.getMessage());
        }
    }
  // Método para cambiar el color de fondo y de letra de la terminal
    // Método para cambiar el color de fondo y de letra de la terminal
    public void setTerminalColors() {
        // Solicitar al usuario que seleccione los colores en español
        String fondo = JOptionPane.showInputDialog("Ingrese el color de fondo:");
        String letra = JOptionPane.showInputDialog("Ingrese el color de letra:");

        // Mapear los colores ingresados a sus equivalentes en inglés
        String fondoEnIngles = obtenerColorEnIngles(fondo);
        String letraEnIngles = obtenerColorEnIngles(letra);

        // Verificar si los colores ingresados son válidos
        try {
            Color fondoColor = (Color) Color.class.getField(fondoEnIngles.toUpperCase()).get(null);
            Color letraColor = (Color) Color.class.getField(letraEnIngles.toUpperCase()).get(null);

            // Establecer los colores en la terminal
            terminalArea.setBackground(fondoColor);
            terminalArea.setForeground(letraColor);

            appendToTerminal("");
        } catch (Exception e) {
            appendToTerminal("Error: Color no válido");
        }
    }
 // Método para mapear los colores ingresados en español a sus equivalentes en inglés
    private String obtenerColorEnIngles(String color) {
        switch (color.toLowerCase()) {
            case "rojo":
                return "RED";
            case "verde":
                return "GREEN";
            case "azul":
                return "BLUE";
            case "amarillo":
                return "YELLOW";
            case "naranja":
                return "ORANGE";
            case "aqua":
                return "CYAN";
            case "morado":
                return "MAGENTA";
            case "rosa":
                return "PINK";
            case "blanco":
                return "WHITE";
            case "negro":
                return "BLACK";
            default:
                return color.toUpperCase(); // Si no se encuentra, se asume que el color está en inglés
        }
    }

    // Método para agregar texto al área de texto (terminal)
    public void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
        });
    }

    // Método para obtener el comando ingresado
    public String getCommand() {
        String text = terminalArea.getText();
        int lastNewLine = text.lastIndexOf("\n");
        if (lastNewLine >= 0) {
            return text.substring(lastNewLine + 1);
        } else {
            return text;
        }
    }

    // Método para establecer el texto en el área de entrada del terminal
    public void setCommand(String command) {
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    // Método para volver a la terminal después de terminar el juego de la serpiente
    public void returnToTerminal() {
        getContentPane().removeAll();
        getContentPane().add(scrollPane);
        getContentPane().revalidate();
        terminalArea.requestFocusInWindow();
    }
    // Clase PaintSimulator integrada
    static class PaintSimulator extends JPanel {
        private int lastX, lastY;

        public PaintSimulator() {
            setPreferredSize(new Dimension(600, 400));
            setBackground(Color.PINK);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    lastX = e.getX();
                    lastY = e.getY();
                }
            });

            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    Graphics g = getGraphics();
                    int x = e.getX();
                    int y = e.getY();
                    g.drawLine(lastX, lastY, x, y);
                    lastX = x;
                    lastY = y;
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }
 // Método para iniciar el simulador de pintura
    private void startPaintSimulator() {
       JFrame paintFrame = new JFrame("Paint Simulator");
       paintFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       paintFrame.getContentPane().add(new PaintSimulator());
       paintFrame.pack();
       paintFrame.setLocationRelativeTo(null); // Centrar la ventana
       paintFrame.setVisible(true);
 }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Terminal());
    }
}

*/




import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal extends JFrame {
    private JTextArea terminalArea;
    private JScrollPane scrollPane;
    private JTextArea asciiArtArea;
    private JTextArea greetingArea;

    public Terminal() {
        setTitle("Terminal");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel leftPanel = new JPanel(new BorderLayout());

        // Arte ASCII predeterminado
        asciiArtArea = new JTextArea(getAsciiArt());
        asciiArtArea.setEditable(false);
        asciiArtArea.setBackground(Color.BLACK);
        asciiArtArea.setForeground(Color.GREEN);
        asciiArtArea.setFont(new Font("Monospaced", Font.PLAIN, 8));

        greetingArea = new JTextArea("Comandos Propios: +\n" + "paint\n" + "agregar mas comandos\n");
        greetingArea.setEditable(false);
        greetingArea.setBackground(Color.BLACK);
        greetingArea.setForeground(Color.YELLOW);
        greetingArea.setFont(new Font("Monospaced", Font.PLAIN, 10));

        leftPanel.add(asciiArtArea, BorderLayout.CENTER);
        leftPanel.add(greetingArea, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel(new BorderLayout());

        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        scrollPane = new JScrollPane(terminalArea);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(200);

        add(splitPane);

        appendToTerminal(getCurrentPath() + "> ");

        terminalArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    processCommand();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private String getAsciiArt() {
        return
                "                 .88888888:.\n" +
                        "                88888888.88888.\n" +
                        "              .8888888888888888.\n" +
                        "              888888888888888888\n" +
                        "              88' _`88'_  `88888\n" +
                        "              88 88 88 88  88888\n" +
                        "              88_88_::_88_:88888\n" +
                        "              88:::,::,:::::8888\n" +
                        "              88`:::::::::'`8888\n" +
                        "             .88  `::::'    8:88.\n" +
                        "            8888            `8:888.\n" +
                        "          .8888'             `888888.\n" +
                        "         .8888:..  .::.  ...:'8888888:.\n" +
                        "        .8888.'     :'     `'::`88:88888\n" +
                        "       .8888        '         `.888:8888.\n" +
                        "      888:8         .           888:88888\n" +
                        "    .888:88        .:           888:88888:\n" +
                        "    8888888.       ::           88:888888\n" +
                        "    `.::.888.      ::          .88888888\n" +
                        "   .::::::.888.    ::         :::`8888'.:.\n" +
                        "  ::::::::::.888   '         .::::::::::::\n" +
                        "  ::::::::::::.8    '      .:8::::::::::::.\n" +
                        " .::::::::::::::.        .:888:::::::::::::\n" +
                        " :::::::::::::::88:.__..:88888:::::::::::'\n" +
                        "  `'.:::::::::::88888888888.88:::::::::'\n" +
                        "...     `':::_:' -- '' -'-' `':_::::'`\n";
    }

    private String getCustomAsciiArt() {
        return
        	       "⠀⠀⠀⠀⣀⣤⣴⣶⣶⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⢀⣾⣿⣿⣿⣿⣿⣿⣿⣅⢀⣽⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠁⠀⠀⣴⣶⡄⠀⣴⣶⡄⠀⣴⣶⡄\n" +
                   "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⠀⠙⠛⠁⠀⠙⠛⠁⠀⠙⠛⠁\n" +
                   "⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                   "⠀⠀⠈⠙⠿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

    }

    private void changeAsciiArtAndColors(String asciiArt, Color foregroundColor, Color backgroundColor) {
        SwingUtilities.invokeLater(() -> {
            asciiArtArea.setText(asciiArt);
            asciiArtArea.setForeground(foregroundColor);
            asciiArtArea.setBackground(backgroundColor);
        });
    }

    private void restoreDefaultConfiguration() {
        changeAsciiArtAndColors(getAsciiArt(), Color.GREEN, Color.BLACK);
        SwingUtilities.invokeLater(() -> {
            greetingArea.setForeground(Color.YELLOW);
            terminalArea.setForeground(Color.GREEN);
            terminalArea.setBackground(Color.BLACK);
            terminalArea.setCaretColor(Color.GREEN);
        });
    }

    private void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
        });
    }

    private String getCurrentPath() {
        return "Javalinux";
    }

    private void processCommand() {
        String command = getCommand();
        switch (command.toLowerCase()) {
            case "uno":
                changeAsciiArtAndColors(getCustomAsciiArt(), Color.YELLOW, Color.BLACK);
                SwingUtilities.invokeLater(() -> {
                    greetingArea.setForeground(Color.BLACK);
                    terminalArea.setForeground(Color.YELLOW);
                    terminalArea.setBackground(Color.BLACK);
                    terminalArea.setCaretColor(Color.YELLOW);
                });
                break;
            case "dos":
                restoreDefaultConfiguration();
                break;
            case "saludo":
                appendToTerminal("Buenas tardes");
                break;
            case "clear":
                terminalArea.setText("");
                terminalArea.setCaretPosition(0);
                break;
            default:
                executeLinuxCommand(command);
                break;
        }
        appendToTerminal(getCurrentPath() + "> ");
        terminalArea.setText(""); // Limpiar el área de comandos después de procesar el comando
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
            SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
        }

        private void executeLinuxCommand(String command) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
                processBuilder.redirectErrorStream(true);
                Process process = processBuilder.start();

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    appendToTerminal(line);
                }

                process.waitFor();

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                appendToTerminal("Error al ejecutar el comando");
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new Terminal());
        }
    }


