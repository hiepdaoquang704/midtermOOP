public class main {
    public static void main(String[] args) {

        System.out.println("Running DiscreteSignal:");
        int[] a = { 1, 2, 3, 4 }; // Giá trị mẫu cho a(k)
        DiscreteSignal signal = new DiscreteSignal(a);
        signal.displaySignal(4); // Hiển thị tín hiệu từ n = 0 đến n = 4

        System.out.println("\nRunning Radar:");
        Radar radar = new Radar();
        radar.displayRadarSignal(4); // Xuất tín hiệu từ 0 đến 4
    }
}
