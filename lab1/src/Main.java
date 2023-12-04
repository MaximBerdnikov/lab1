import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat1 = new Cat("кот1");
        Dog dog1 = new Dog("собака1");
        Cat cat2 = new Cat("кот2");
        Dog dog2 = new Dog("собака2");
        Cat cat3 = new Cat("кот3");
        Dog dog3 = new Dog("собака3");
        Tiger tiger1 = new Tiger("тигр1");
        Tiger tiger2 = new Tiger("тигр2");
        Tiger tiger3 = new Tiger("тигр3");
        Tiger tiger4 = new Tiger("тигр4");
        Animal amimals [] = {cat1,dog1,tiger1,cat3,cat2,dog2,dog3,tiger2,tiger3,tiger4};
        System.out.println("Всего котов: "+Cat.getCount());
        System.out.println("Всего собак: "+Dog.getCount());
        System.out.println("Всего тигров: "+Tiger.getCount());
        System.out.println("Всего животных: "+(Dog.getCount()+Tiger.getCount()+Cat.getCount()));
        for(int i = 0;i<amimals.length;i++){
            System.out.println("Введите сколько пробежит " + amimals[i].Name1());
            amimals[i].run(scanner.nextInt());
            System.out.println("Введите сколько проплывёт " + amimals[i].Name1());
            amimals[i].swim(scanner.nextInt());
        }



    }
}