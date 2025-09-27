import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SumaGui {

    // Ventana principal
    private Frame f;

    // Paneles para organizar los componentes
    private Panel pan1, pan2, pan3, pan4, pan5;

    // Etiquetas para mostrar texto informativo
    private Label lbInstruccion1, lbInstruccion2, lbNum1, lbNum2, lbResultado;

    // Campos de texto para la entrada de números y para mostrar el resultado
    private TextField tfNum1, tfNum2, tfResultado;

    // Botones para realizar acciones
    private Button btsuma, btresta, btmulti, btdividir, btborrar, btSalir;

    /**
     * Constructor de la clase SumaGui.
     * Inicializa todos los componentes de la GUI.
     */
    public SumaGui() {
        // --- Inicialización de la Ventana Principal ---
        f = new Frame("Calculadora ultra pro 4k 5080fps");

        // --- Inicialización de los Paneles ---
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        pan4 = new Panel();
        pan5 = new Panel();

        // --- Inicialización de las Etiquetas ---
        lbInstruccion1 = new Label("Instrucciones:");
        lbInstruccion2 = new Label("Agregue los números a sumar y presione el botón 'Calcular'.");
        lbNum1 = new Label("Primer número:");
        lbNum2 = new Label("Segundo número:");
        lbResultado = new Label("Resultado de la operacion: ");

        // --- Inicialización de los Campos de Texto ---
        tfNum1 = new TextField(5); // Campo para el primer número con 5 columnas
        tfNum2 = new TextField(5); // Campo para el segundo número con 5 columnas
        tfResultado = new TextField(8); // Campo para el resultado con 8 columnas
        tfResultado.setEditable(false); // El campo de resultado no se puede editar

        // --- Inicialización de los Botones ---
        btsuma = new Button(" + ");
        btresta = new Button(" - ");
        btmulti = new Button(" x ");
        btdividir = new Button(" ÷ ");
        btborrar = new Button("C");
        btSalir = new Button("Salir");

        // --- Asociación de los Listeners a los Botones ---
        btresta.addActionListener(new MnjBotonresta());
        btdividir.addActionListener(new MnjBotonDiv());
        btmulti.addActionListener(new MnjBotonMulti());
        btsuma.addActionListener(new MnjBotonSuma());
        btSalir.addActionListener(new MnjBotonSalir());
        btborrar.addActionListener(new MnjBorrar());
    }

    /**
     * Organiza y muestra los componentes de la GUI en la ventana principal.
     */
    public void acomodarEnFrame() {
        // Configura el layout de la ventana principal como BorderLayout
        f.setLayout(new BorderLayout());

        // --- Configuración del Panel 1 (Instrucciones) ---
        pan1.setLayout(new GridLayout(2, 1)); // Layout de 2 filas y 1 columna
        pan1.add(lbInstruccion1);
        pan1.add(lbInstruccion2);
        f.add(pan1, BorderLayout.NORTH); // Añade el panel en la parte superior

        // --- Configuración del Panel 2 (Entradas y Resultado) ---
        pan2.setLayout(new GridLayout(3, 2, 5, 5)); // CORREGIDO: Cambiado a 3 filas
        pan2.add(lbNum1);
        pan2.add(tfNum1);
        pan2.add(lbNum2);
        pan2.add(tfNum2);
        pan2.add(lbResultado);
        pan2.add(tfResultado);

        // --- Configuración del Panel 3 (Botones de operación) ---
        pan3.setLayout(new FlowLayout()); // Layout simple para los botones
        pan3.add(btsuma);
        pan3.add(btresta);
        pan3.add(btmulti);
        pan3.add(btdividir);
        pan3.add(btborrar);

        pan4.setLayout(new BorderLayout());
        pan4.add(pan2, BorderLayout.CENTER);
        pan4.add(pan3, BorderLayout.SOUTH); 
        f.add(pan4, BorderLayout.CENTER);


        pan5.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        pan5.add(btSalir);
        f.add(pan5, BorderLayout.SOUTH);

        f.setSize(600, 400); 
        f.setVisible(true); 
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class MnjBotonSuma implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 + n2;
                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException e) {
                tfResultado.setText("Error"); 
            }
        }
    }

    class MnjBotonresta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 - n2;
                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException e) {
                tfResultado.setText("Error"); 
            }
        }
    }

    class MnjBotonMulti implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 * n2;
                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException e) {
                tfResultado.setText("Error"); 
            }
        }
    }

    class MnjBotonDiv implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                if (n2 == 0) { 
                    tfResultado.setText("Error div/0");
                    return;
                }
                double res = n1 / n2;
                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException e) {
                tfResultado.setText("Error"); 
            }
        }
    }


    class MnjBorrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            tfNum1.setText("");
            tfNum2.setText("");
            tfResultado.setText("");
        }
    }

    class MnjBotonSalir implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        SumaGui ventanaSuma = new SumaGui();
        ventanaSuma.acomodarEnFrame();
    }
    
} 