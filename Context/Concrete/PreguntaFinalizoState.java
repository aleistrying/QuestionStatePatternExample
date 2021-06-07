package Context.Concrete;

import java.util.concurrent.TimeUnit;
import Context.State;

public class PreguntaFinalizoState implements State {
    String finalizo = "FINALIZO_PREGUNTA";

    public PreguntaFinalizoState() {
        try {
            System.out.println();
            System.out.println("- Iniciando State: " + finalizo);
            TimeUnit.SECONDS.sleep(2);

        } catch (Exception e) {

        }
    }

    public String handle() {
        try {
            System.out.println("Finalizando Partida...");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("Revisando Respuesta de estudiante...");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("Calculando Resultados ...");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("Mostrando Resultados...");
            TimeUnit.SECONDS.sleep(3);
            // revisar respuesta correcta
            // calcular resultados y puntajes de estudiante.
            // mostrar resultados
        } catch (Exception e) {

        }
        return finalizo;
    }
}
