class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating 3 Student objects
        Student s1 = new Student("Priyal", 85);
        Student s2 = new Student("Amit", 72);
        Student s3 = new Student("Neha", 38);

        // Printing name with grade
        System.out.println(s1.name + " has grade: " + s1.getGrade());
        System.out.println(s2.name + " has grade: " + s2.getGrade());
        System.out.println(s3.name + " has grade: " + s3.getGrade());
    }
}