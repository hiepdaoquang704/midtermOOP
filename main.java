public class main {
    public static void main(String[] args) {
        Signal discreteSignal = new DiscreteSignal();
        Signal continuousSignal = new ContinuousSignal();

        discreteSignal.transmit();
        discreteSignal.process();

        continuousSignal.transmit();
        continuousSignal.process();

        // Casting để sử dụng phương thức đặc trưng
        if (discreteSignal instanceof DiscreteSignal) {
            ((DiscreteSignal) discreteSignal).sample();
        }

        if (continuousSignal instanceof ContinuousSignal) {
            ((ContinuousSignal) continuousSignal).modulate();
        }
    }
}
