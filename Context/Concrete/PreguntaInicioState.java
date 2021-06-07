package Context.Concrete;

import Context.State;
import java.util.concurrent.TimeUnit;

public class PreguntaInicioState implements State {
    String inicio = "INICIO_PREGUNTA";

    public PreguntaInicioState() {
        try {
            System.out.println();
            System.out.println("- Iniciando State: " + inicio);
            TimeUnit.SECONDS.sleep(2);

        } catch (Exception e) {

        }
    }

    public String handle() {

        try {
            System.out.println("Iniciando partida Para Estudiante...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Mostrando Datos En pantalla...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Iniciando Timer de Partida...");
            TimeUnit.SECONDS.sleep(2);
            // mostrar pregunta en pantalla
            // iniciar timer
            // bajar puntaje por tiempo

        } catch (Exception e) {

        }
        return inicio;
    }
}
