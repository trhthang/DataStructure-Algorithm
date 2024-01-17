// Định nghĩa một lớp trừu tượng Animal
abstract class Animal {
    // Phương thức trừu tượng speak
    abstract void speak();
}

// Lớp Dog kế thừa từ Animal và triển khai (implement) phương thức speak
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

// Lớp Cat kế thừa từ Animal và triển khai phương thức speak
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat meows");
    }
}