package CodSoft;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];
        int totalMarks = 0;
        float percentage;
        boolean b = true;
        System.out.println("Enter the marks out of 100 in each subject....");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
           if(marks[i]>100||marks[i]<0){
               System.out.println("Invalid Mark");
               b = false;
               break;
           }
           totalMarks += marks[i];
        }
        if(b) {
            percentage = (float) totalMarks / 5;
            System.out.println("Total Marks: "+totalMarks);
            System.out.println("Average Percentage: "+percentage);
            if (percentage<=100&&percentage>=90){
                System.out.println("Grade A+");
            } else if (percentage<90&&percentage>=80){
                System.out.println("Grade A");
            } else if (percentage<80&&percentage>=70){
                System.out.println("Grade B+");
            } else if (percentage<70&&percentage>=60){
                System.out.println("Grade  B");
            } else if (percentage<60&&percentage>=50){
                System.out.println("Grade C+");
            } else if (percentage<50&&percentage>=40){
                System.out.println("Grade C");
            } else if (percentage<40&&percentage>=35){
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F (fail)");
            }
        }
    }
}
