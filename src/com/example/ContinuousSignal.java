public class ContinuousSignal implements Signal {
    @Override
    public void transmit() {
        System.out.println("Transmitting continuous signal...");
    }

    @Override
    public void process() {
        System.out.println("Processing continuous signal...");
    }

    // Phương thức riêng của ContinuousSignal
    public void modulate() {
        System.out.println("Modulating continuous signal...");
    }
}
