package topic11_statepattern.hulk;

public interface State {
    void makeAngry();
    void calmDown();
    void useCar(Car car);
    void fight();
}
