package SBS05;

// Lớp Car thực thi giao diện IMovable
public class Car implements IMovable {
    private boolean started;

    public Car() {
        this.started = false;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public void Start() {
        if (!started) {
            started = true;
            System.out.println("Car has started.");
        } else {
            System.out.println("Car is already started.");
        }
    }

    @Override
    public void Stop() {
        if (started) {
            started = false;
            System.out.println("Car has stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    @Override
    public void TurnLeft() {
        System.out.println("Car is turning left.");
    }

    @Override
    public void TurnRight() {
        System.out.println("Car is turning right.");
    }

    @Override
    public void Accelerate() {
        if (started) {
            System.out.println("Car is accelerating.");
        } else {
            System.out.println("Car needs to start first.");
        }
    }

    @Override
    public void Brake() {
        if (started) {
            System.out.println("Car is braking.");
        } else {
            System.out.println("Car needs to start first.");
        }
    }
}
