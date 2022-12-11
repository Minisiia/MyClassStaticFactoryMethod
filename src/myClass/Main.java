package myClass;

public class Main {
    public static void main(String[] args) {
            // створення екземплярів без статичного фабричного методу
        MyClass<Integer> inc1 = new MyClass<>(12);
        System.out.println(inc1.field);
        MyClass<String> inc2 = new MyClass<>("inc2 string field");
        System.out.println(inc2.field);
            // статичний фабричний метод без аргументів
        MyClass<Integer> inc3 = MyClass.factoryMethod();
        inc3.field=15;
        System.out.println(inc3.field);
        MyClass<String> inc4 = MyClass.factoryMethod();
        inc4.field="inc4 string field";
        System.out.println(inc4.field);
            // статичний фабричний метод з аргументами
        MyClass<Integer> inc5 = MyClass.factoryMethod(10);
        System.out.println(inc5.field);
        MyClass<String> inc6 = MyClass.factoryMethod("inc6 string field");
        System.out.println(inc6.field);


    }

}
