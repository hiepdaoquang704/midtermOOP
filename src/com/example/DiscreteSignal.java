public class DiscreteSignal {
    private int[] a; // Mảng chứa giá trị a(k)

    // Constructor
    public DiscreteSignal(int[] a) {
        this.a = a;
    }

    // Hàm mô tả dãy xung đơn vị
    private int unitImpulse(int n) {
        return (n == 0) ? 1 : 0;
    }

    // Hàm tính giá trị tín hiệu x(n)
    public int calculateSignal(int n) {
        int sum = 0;
        for (int k = 0; k < a.length; k++) {
            sum += a[k] * unitImpulse(n - k); // x(n) = sum(a(k) * d(n - k))
        }
        return sum;
    }

    // Phương thức hiển thị tín hiệu rời rạc
    public void displaySignal(int nMax) {
        for (int n = 0; n <= nMax; n++) {
            System.out.println("x(" + n + ") = " + calculateSignal(n));
        }
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng lớp DiscreteSignal
        int[] a = { 1, 2, 3, 4 }; // Giá trị mẫu cho a(k)
        DiscreteSignal signal = new DiscreteSignal(a);
        signal.displaySignal(4); // Hiển thị tín hiệu từ n = 0 đến n = 4
    }
}
