package com.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private String collegeName;
    private float percentage;
    private float scholarship;

    public Student(String name, String collegeName, float percentage) {
        this.name = name;
        this.collegeName = collegeName;
        this.percentage = percentage;
        this.scholarship = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
}

class Portal {
    ArrayList<Student> studentList = new ArrayList<>();

    public void assignScholarship() {
        for (Student student : studentList) {
            if (student.getPercentage() >= 91) {
                student.setScholarship(10000);
            } else if (student.getPercentage() >= 81) {
                student.setScholarship(5000);
            } else {
                student.setScholarship(0);
            }
        }
    }

    public float totalScholarship() {
        float total = 0;
        for (Student student : studentList) {
            total += student.getScholarship();
        }
        return total;
    }

    public String totalMaxScholarshipOfCollege() {
        Map<String, Float> collegeScholarship = new HashMap<>();
        for (Student student : studentList) {
            String college = student.getCollegeName();
            float scholarship = student.getScholarship();
            collegeScholarship.put(college, collegeScholarship.getOrDefault(college, 0f) + scholarship);
        }

        String maxCollege = "";
        float maxScholarship = 0;

        for (Map.Entry<String, Float> entry : collegeScholarship.entrySet()) {
            if (entry.getValue() > maxScholarship) {
                maxScholarship = entry.getValue();
                maxCollege = entry.getKey();
            }
        }
        return maxCollege;
    }
}
    
   class ScholarshipProgram{
	   public static void main(String[] args) {
		   Portal obj = new Portal();
		   obj.studentList.add(new Student("Steve", "IIT", 89));
		   obj.studentList.add(new Student("Bob", "NIT", 94));
		   obj.studentList.add(new Student("Alice", "Abcd", 59));
		   obj.assignScholarship();
		   System.out.println(obj.totalScholarship());
		   System.out.println(obj.totalMaxScholarshipOfCollege());
	   }
   }
