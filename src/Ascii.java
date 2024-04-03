import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import asciiPanel.AsciiPanel;

public class Ascii {
    public static void main(String[] args) throws IOException {
        // Lee la imagen desde el archivo
        BufferedImage image = ImageIO.read(new File("\"C:\\Users\\jasov\\OneDrive\\Escritorio\\Linux.png\""));

        // Crea una instancia de AsciiPanel
        AsciiPanel panel = new AsciiPanel(image.getWidth(), image.getHeight());

        // Convierte la imagen a arte ASCII y la imprime
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int color = image.getRGB(x, y);
                panel.write((char) 0, x, y, color);
            }
        }

        // Imprime el resultado en la consola
        System.out.println(panel);
    }
}
