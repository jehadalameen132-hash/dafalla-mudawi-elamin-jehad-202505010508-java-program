class Student {

    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Another Method
    public void study() {
        System.out.println(name + " is studying.");
    }

    // Yet Another Method
    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }
}