package StaticFieldsAndMethods;

public class MyClass {
    static int count = 0;
    MyClass() {
        count++;
        System.out.println("Создан объект номер: "+count);
    }
    static void show() {
        System.out.println("Количество объектов: "+count);
    }
}
