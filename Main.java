import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
       for(int i=0;i<grades.size();i++){
           int temp= grades.get(i)%10;
           if(grades.get(i)>=38){
               if(temp>0 && temp<5){
                   int temp1= 5-temp;
                   if(temp1<3){
                       int roundGrade=grades.get(i)+temp1;
                       grades.set(i,roundGrade);
                   }
                   

               }
               else if(temp>5){
                   int temp1=10-temp;
                   if(temp1<3){
                       int roundGrade=grades.get(i)+temp1;
                       grades.set(i,roundGrade);
                   }
               }
           }
       }
    return grades;
    }
    

}

public class Main{
    
    
    public static void main(String[] args)  {
        Scanner scan;
        int number;
        Result r=new Result();
        List<Integer> grades=new ArrayList<Integer>();
        scan= new Scanner (System.in);
        
        number=scan.nextInt();
        
        for(int i=0;i<number;i++){
            int temp2=scan.nextInt();
            grades.add(temp2);
        }
        List<Integer> roundedGrades=r.gradingStudents(grades);
        System.out.println(roundedGrades);
    }
}
