package classes;

class student {
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
        // can also be -> this.setAge(age); or this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class classes_tutorial {
    public static void main(String[] args) {
        student student1 = new student("Alice", 1);
        System.out.println(student1.getName());

        System.out.println();

        student student2 = new student("John", 2);
        System.out.println(student2.getAge());

    }
}
