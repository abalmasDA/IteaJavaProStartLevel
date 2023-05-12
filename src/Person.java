
/**
 * Клас Person
 * Створити клас Person, який містить:
 * 1. змінні fullName, age;
 * 2. методи move() і talk(), у яких просто вивести на консоль повідомлення - "Який Person говорить".
 * 3. Додайте два конструктори - Person() та Person(fullName, age).
 * 4. Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person (), інший – Person (fullName, age).
 * 5. Викличте методи move() та talk().
 */

public class Person {
    static String fullName;
    static int age;


    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void move() {
        System.out.println(fullName + " move");

    }

    public static void talk() {
        System.out.println(fullName + " talk");

    }


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Ivan";
        person1.age = 22;
        person1.move();
        person1.talk();

        Person person2 = new Person("Dmytro", 25);
        person2.move();
        person2.talk();
    }

}
