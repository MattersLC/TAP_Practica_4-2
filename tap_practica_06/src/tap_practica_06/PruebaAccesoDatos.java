package tap_practica_06;

import java.util.ArrayList;

/**
 * @author Orlando Lucero
 */
public class PruebaAccesoDatos {
    public static void main(String[] args) {
        String consulta = "Select * FROM ROOT.TIPOACTIVIDAD";
        ManejoDatos baseDatos = new ManejoDatos(); // Atributo de la clase ManejoDatos
        ArrayList<Object[]>actividad = (ArrayList<Object[]>) baseDatos.conexionConsultaActividad(consulta);
        for (int ne=0; ne<actividad.size(); ne++) {
            Object reg[] = actividad.get(ne);
            System.out.println();
            for (int c=0; c<reg.length; c++) {
                System.out.printf("%-25s",reg[c]);
            }
        }
    }
}
