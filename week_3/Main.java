public class Main {

    public static void main(String[] args) {

        Person p = new Person("Ali", "1");
        Student s = new Student("Omar", "2");
        Lecturer l = new Lecturer("Dr.Sara", "3");

        p.introduce();
        s.introduce();
        l.introduce();
    }
}