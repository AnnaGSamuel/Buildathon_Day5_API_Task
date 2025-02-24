package com.example.Students.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StudentApp {

    @PostMapping("/studentEntry")
    public String readStudentDetails(@RequestBody Map<String,String> data){
        String getName = data.get("name");
        String getRollNo = data.get("rollno");
        String getDOB = data.get("dob");
        String getGender = data.get("gender");
        String getAdmno = data.get("admno");
        String getDept = data.get("department");
        String getBloodGroup = data.get("blood group");
        String getAddress = data.get("address");
        String getPincode= data.get("pincode");

        System.out.println("Name : "+getName);
        System.out.println("Roll number : "+getRollNo);
        System.out.println("Date of Birth : "+getDOB);
        System.out.println("Gender : "+getGender);
        System.out.println("Admission number : "+getAdmno);
        System.out.println("Deaprtment : "+getDept);
        System.out.println("Blood group : "+getBloodGroup);
        System.out.println("Address : "+getAddress);
        System.out.println("Pincode : "+getPincode);

        return "Student added successfully";

    }
    @PostMapping("/findResult")
    public String findResult(@RequestBody Map<String,String> data){
        String getRollNo = data.get("rollno");

        String getSub1_name = data.get("sub1_name");
        String getSub1_marks = data.get("sub1_marks");
        String getSub1_totalMarks = data.get("sub1_totalMarks");

        String getSub2_name = data.get("sub2_name");
        String getSub2_marks = data.get("sub2_marks");
        String getSub2_totalMarks = data.get("sub2_totalMarks");

        String getSub3_name = data.get("sub3_name");
        String getSub3_marks = data.get("sub3_marks");
        String getSub3_totalMarks = data.get("sub3_totalMarks");

        String getSub4_name = data.get("sub4_name");
        String getSub4_marks = data.get("sub4_marks");
        String getSub4_totalMarks = data.get("sub4_totalMarks");

        String getSub5_name = data.get("sub5_name");
        String getSub5_marks = data.get("sub5_marks");
        String getSub5_totalMarks = data.get("sub5_totalMarks");

        String getSub6_name = data.get("sub6_name");
        String getSub6_marks = data.get("sub6_marks");
        String getSub6_totalMarks = data.get("sub6_totalMarks");

        String sub1_grade = getGrade(getSub1_marks,getSub1_totalMarks);
        String sub2_grade = getGrade(getSub2_marks,getSub2_totalMarks);
        String sub3_grade = getGrade(getSub3_marks,getSub3_totalMarks);
        String sub4_grade = getGrade(getSub4_marks,getSub4_totalMarks);
        String sub5_grade = getGrade(getSub5_marks,getSub5_totalMarks);
        String sub6_grade = getGrade(getSub6_marks,getSub6_totalMarks);

        boolean ifFailed = sub1_grade.equals("F") || sub2_grade.equals("F") ||sub3_grade.equals("F") ||sub4_grade.equals("F") || sub5_grade.equals("F") || sub6_grade.equals("F") ;

        if(ifFailed)
            return "Failed";
        else
            return "Passed";

    }

    public static String getGrade(String marks,String total){
        int actualMarks = Integer.parseInt(marks);
        int totalMarks = Integer.parseInt(total);

        double percentage = (actualMarks * 1.0/totalMarks) * 100;

        if(percentage>=90)
            return "S";
        else if(percentage>=85)
            return "A+";
        else if(percentage>=80)
            return "A";
        else if(percentage>=75)
            return "B+";
        else if(percentage>=70)
            return "B";
        else if(percentage>=65)
            return "C+";
        else if(percentage>=60)
            return "C";
        else if(percentage>=55)
            return "D+";
        else if(percentage>=50)
            return "D";
        else
            return "F";
    }
}