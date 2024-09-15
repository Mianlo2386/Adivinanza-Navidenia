package desafionavidenio1;

import igu.Interfaz;
import javax.swing.JFrame;

public class DesafioNavidenio1 {

    public static void main(String[] args) {
        // Crear una instancia de la ventana principal
        JFrame ventana = new JFrame("Adivinanza Navideña");
        Interfaz interfaz = new Interfaz();
        
        // Configurar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600); // Ajusta el tamaño según sea necesario
        ventana.setContentPane(interfaz);
        ventana.setVisible(true);
    }
}
