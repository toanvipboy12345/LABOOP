package SBS05;
// Giao diện IMovable kế thừa từ IDrivable và ISteerable
public interface IMovable extends IDrivable, ISteerable {
    void Accelerate();
    void Brake();
}
