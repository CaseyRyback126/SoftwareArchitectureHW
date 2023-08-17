/* Принцип инверсии зависимостей (Dependency Inversion Principle)
   Интерфейс Engine определяет общие операции для всех типов двигателей
 */


public interface Engine {
    void start();
    void stop();
}
