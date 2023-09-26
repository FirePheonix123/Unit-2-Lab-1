public class Student {
    private String name;
    private int height;
    private int weight;
    private int age;
    private int grade;
    private boolean isAlive;
    public Student(String name, int height, int weight, int age, int grade, boolean isAlive) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.grade = grade;
        this.isAlive = isAlive;
    }
    public void printDetails() {
        System.out.println("Name: " + name + "\nHeight: " + height + "\nWeight: " + weight + "\nAge: " + age + "\nGrade: " + grade + "\nAlive: " + isAlive);
    }
}
