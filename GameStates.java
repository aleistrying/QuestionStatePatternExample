import Context.*;
import Context.Concrete.*;
import java.util.concurrent.TimeUnit;

public class GameStates {
    public static void main(String arg[]) {
        try {
            Context context = new Context();
            State state;

            state = new PreguntaInicioState();
            context.setState(state);
            System.out.println("- State Actual: " + context.request());
            System.out.println();

            TimeUnit.SECONDS.sleep(15);
            System.out.println("Estudiante Responde la pregunta...");
            System.out.println();
            TimeUnit.SECONDS.sleep(2);

            state = new PreguntaRespondioState();
            context.setState(state);
            System.out.println("- State Actual: " + context.request());
            System.out.println();

            TimeUnit.SECONDS.sleep(15);
            System.out.println("Timer de Partida Finaliza...");
            System.out.println();
            TimeUnit.SECONDS.sleep(2);

            state = new PreguntaFinalizoState();
            context.setState(state);
            System.out.println("- State Actual: " + context.request());
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}