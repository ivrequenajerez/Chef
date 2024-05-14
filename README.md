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

•	La ventana no puede ser redimensionada.
•	Al hacer clic en la “X”, se cierra el programa.
•	El tamaño predeterminado es 900px x 520px.
•	El icono de la ventana es “icono_ventana.png”.
•	El título de la ventana es “Chef”.

Código a añadir en cada constructor:

setResizable(false);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 900, 520); // Tamaño de la ventana

setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenuTiposIngredientes.class.getResource("/recursos/icono_ventana.png"))); // Icono de la ventana

setTitle("Chef");

