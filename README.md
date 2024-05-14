Proyecto: Chef

Tecnologías:

Java
Java Swing
Eclipse

Colores:
#e8e8e8
#050505
#F9630A
#C4D2DF
#EEE4DA

Organización:
Utilizamos Trello para la gestión de tareas.
Cada miembro del equipo es responsable de desarrollar su propia ventana (back y front).
Es crucial seguir las fechas pautadas para cumplir con los objetivos del proyecto.

Diseño:
Tipografía: Poppins
Tamaño de Títulos: 40
Tamaño de Texto: 14

Tamaño de Ventanas:
setBounds(100, 100, 900, 520);

Configuración de Ventanas para el proyecto:
NO SE PUEDE REDIMENSIONAR
AL HACER CLICK EN LA "X" SE CIERRA EL PROGRAMA
EL TAMAÑO ES 900px X 520px
EL ICONO ES icono_ventana.png
EL TÍTULO ES Chef

Código a añadir en cada constructor:
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 900, 520); // Tamaño de Ventana
setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenuTiposIngredientes.class.getResource("/recursos/icono_ventana.png"))); // Icono de Ventana
setTitle("Chef");
