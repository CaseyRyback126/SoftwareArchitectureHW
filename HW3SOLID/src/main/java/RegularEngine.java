/*
    Реализация интерфейса Engine для обычного двигателя
 */


public class RegularEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }
}
