package Context.Concrete;

import java.util.concurrent.TimeUnit;

import Context.State;

public class PreguntaRespondioState implements State {
    String respondio = "RESPONDIO_PREGUNTA";

    public PreguntaRespondioState() {
        try {
            System.out.println();
            System.out.println("- Iniciando State: " + respondio);
            TimeUnit.SECONDS.sleep(2);

        } catch (Exception e) {

        }
    }

    public String handle() {
        try {
            System.out.println("Colocando pantalla de Espera...");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("Esperando a fin de partida...");
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {

        }
        // colocar pantalla de espera
        return respondio;
    }
}
