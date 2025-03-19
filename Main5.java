package assignment;

class Student5 {
    String name;
    String usn;
    String college;
    int cgpa;

    public Student5(String name, String usn, String college, int cgpa) {
        this.name = name;
        this.usn = usn;
        this.college = college;
        this.cgpa = cgpa;
    }
}

class StudentImplementation5 {

    public Student5 getStudentInfo(String str) {
        String[] parts = str.split("[@#-]");

        String name = parts[0];
        String usn = parts[1];
        String college = parts[2];
        int cgpa = Integer.parseInt(parts[3]);

        return new Student5(name, usn, college, cgpa);
    }

    public String getStudentSection(Student5 s) {
        String lastThreeDigits = s.usn.substring(s.usn.length() - 3);
        int usnNumber = Integer.parseInt(lastThreeDigits);

        if (usnNumber >= 1 && usnNumber <= 60) return "A";
        else if (usnNumber >= 61 && usnNumber <= 120) return "B";
        else if (usnNumber >= 121 && usnNumber <= 180) return "C";
        else return "Z";
    }
}

public class Main5 {
    public static void main(String[] args) {
        String input = "Amit Rai@1PC16CS046-ALU#8";
        StudentImplementation5 si = new StudentImplementation5();

        Student5 student = si.getStudentInfo(input);

        System.out.println(student.name);
        System.out.println(student.usn);
        System.out.println(student.college);
        System.out.println(student.cgpa);

        System.out.println(si.getStudentSection(student));
    }
}
