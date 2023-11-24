package blb.utilidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    //MÉTODO QUE SIRVE PARA VERIFICAR DATOS NUMÉRICOS.....
    public static boolean verificarNumero(String numero) {
        if (numero == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(numero);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //MÉTODO QUE SIRVE PARA CONVERTIR UN STRING A TIPO DATE.....
    public static String fechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");
        return formateador.format(ahora);
    }

    //MÉTODO QUE SIRVE PARA CALCULAR LA CANTIDAD DE DÍAS ENTRE DOS FECHAS.....
    public static int diferenciasDeFechas(String fInicial, String fFinal) throws ParseException {

        SimpleDateFormat fechaF = new SimpleDateFormat("yyyy/MM/dd");

        Date f_Inicio = fechaF.parse(fInicial);
        Date f_Final = fechaF.parse(fFinal);

        int milisecondsByDay = 86400000;

        int dias = (int) ((f_Final.getTime() - f_Inicio.getTime()) / milisecondsByDay);

        return dias;
    }

}
