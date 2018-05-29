import java.io.IOException;
import java.util.ArrayList;

// from file Animal.java
 
public class Animal {
        private String name;
 
        public Animal(String name) {
                this.setName(name);
        }
 
        public String talk() {
                throw new UnsupportedOperationException("animals can't talk (except in cartoons)");
        }
 
        public void setName(String name) {
                this.name = name;
        }
 
        public String getName() {
                return name;
        }
}
 
 
class Cat extends Animal {
 
        public Cat(String name) {
                super(name);
        }
 
        public String talk() {
                return "Meow!";
        }
}
 
 
class Dog extends Animal {
 
        public Dog(String name) {
                super(name);
        }
 
        public String talk() {
                return "Woof! Woof!";
        }
}
 
 
class SubtypePolymorphismExample {
         ArrayList<Animal> animals = new ArrayList<Animal>();
 
        public SubtypePolymorphismExample() {
                Animal missy = new Cat("Missy"); // a Cat IS_A Animal, so you can assign to a superclass variable
                // Cat nightmare = new Animal("Nightmare"); // but this is illegal, because not all animals are cats
                Cat mr = new Cat("Mr. Mistophelees");
                Dog lassie = new Dog("Lassie");
                animals.add(missy);
                animals.add(mr);
                animals.add(lassie);
        }
 
        public ArrayList<Animal> getAnimals() {
                return animals;
        }
 
        public static void main(String[] args) throws IOException {
                SubtypePolymorphismExample example = new SubtypePolymorphismExample();
                for (Animal a : example.getAnimals()) {
                        System.out.println(a.getName() + " says: " + a.talk());
                }
        }
 
}