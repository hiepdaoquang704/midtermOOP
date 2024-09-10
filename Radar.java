public class Radar {
    // Hàm phân tích tín hiệu y(n) dựa trên công thức [2]
    public double analyzeSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    // Hiển thị chuỗi tín hiệu y(n)
    public void displayRadarSignal(int nMax) {
        for (int n = 0; n <= nMax; n++) {
            System.out.println("y(" + n + ") = " + analyzeSignal(n));
        }
    }

    public static void main(String[] args) {
        // Ví dụ: hiển thị chuỗi tín hiệu y(n) với n = 4
        Radar radar = new Radar();
        radar.displayRadarSignal(4); // Xuất tín hiệu từ 0 đến 4
    }
}
