package OOP;
// 在Huntable介面上新增多型標誌
// T代表可以引用任何引數，不一定只有Animal
public interface Huntable2<T> {
    void hunt(T o);
}
