package Practics.practic_2;

class Student {
    private String name;
    private int rating;
    private static int totalRating = 0;
    private static int numberOfStudent = 0;

    public Student(){
        this.name = "";
        this.rating = 0;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = (int) rating;
        totalRating += rating;
        numberOfStudent++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRating -= this.rating;
        this.rating = rating;
        totalRating += rating;
    }

    public static double avgRating() {
        return (double) totalRating / numberOfStudent;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.getRating();
    }

    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", rating = " + rating +
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student("Yurii", 90);
        Student st2 = new Student("Yulia", 80);
        Student st3 = new Student("Olha", 70);

        //
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        //

        System.out.println("Avarage rating: " + Student.avgRating());
        //
        System.out.println("Total rating: " + Student.totalRating);
    }
}
