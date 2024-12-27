package SBS05;

// Hàm main để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Thử nghiệm các phương thức
        car.Accelerate();  // Car needs to start first.
        car.Start();       // Car has started.
        car.Accelerate();  // Car is accelerating.
        car.TurnLeft();    // Car is turning left.
        car.TurnRight();   // Car is turning right.
        car.Brake();       // Car is braking.
        car.Stop();        // Car has stopped.
    }
}
