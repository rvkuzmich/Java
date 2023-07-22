package hw6;
import java.util.HashSet;
import java.util.Objects;

public class task {
    
}
class Cat {
    private String name;
    private int age;
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
    public static void main(String[] args){
        HashSet<Cat> catSet = new HashSet<>();
        Cat cat1 = new Cat("Кеша", 4);
        Cat cat2 = new Cat("Тиша", 4);
        Cat cat3 = new Cat("Лева", 3);
        Cat cat4 = new Cat("Маркиз", 2);
        Cat cat5 = new Cat("Кеша", 4);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);

        for (Cat cat : catSet){
            System.out.println(cat.getName() + ": " + cat.getAge() + " года");
        }
    }
}
