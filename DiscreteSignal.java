public class DiscreteSignal implements Signal {
    @Override
    public void transmit() {
        System.out.println("Transmitting discrete signal...");
    }

    @Override
    public void process() {
        System.out.println("Processing discrete signal...");
    }

    // Phương thức riêng của DiscreteSignal
    public void sample() {
        System.out.println("Sampling discrete signal...");
    }
}
