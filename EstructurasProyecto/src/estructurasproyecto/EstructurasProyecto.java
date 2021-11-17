package estructurasproyecto;

import javax.swing.JOptionPane;

public class EstructurasProyecto {

    public static void main(String[] args) {

        int seleccion = 0;

        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("**********Bienvenidos a Tico Restaurante************"
                    + " \n1. Ingresar a la cola"
                    + " \n2. Ver menú"
                    + " \n3. Realizar pedido"
                    + " \n4. Ver cola de pedidos"
                    + " \n5. Imprimir factura"
                    + " \n6. Eliminar pedido"
                    + " \n7. Salir"
                    + "\n\nDigite la opción que desea ejecutar"
                    + "\n****************************************************************"));
            switch (seleccion) {
                case 1:
//                    nombre = JOptionPane.showInputDialog("Digite su nombre completo y número de teléfono");
//                    fichas.encola(new NodoC(nombre));
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opción válida");

            }

        } while (seleccion != 7);

    }
}
