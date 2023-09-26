public class StudentRunner {
    public static void main(String[] args) {
        Student Marvel = new Student("Marvel", 70, 120, 16, 11, true);
        Student Muhammad = new Student("Muhammad", 16, 140, 12, -1, false);


        Marvel.printDetails();
        System.out.println();
        Muhammad.printDetails();
    }
}
