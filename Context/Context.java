package Context;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String request() {
        if (state == null)// no se pudo completar. evento no sucedio?
            return "";

        return state.handle();
    }
}
