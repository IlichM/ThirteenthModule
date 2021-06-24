package StaticFieldsAndMethods;

public class UsingStaticMembers {
    public static void main(String[] args) {
        MyClass.show();
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();
        MyClass objC = new MyClass();

        MyClass.show();
        objC.show();
        objB.show();
    }
}
