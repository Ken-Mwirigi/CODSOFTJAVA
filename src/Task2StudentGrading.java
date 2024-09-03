import java.util.Scanner;
public class Task2StudentGrading {
    public static void main(String[]args){
        double Subj1,Subj2,Subj3,Total,Average;
        char Grade;
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter Marks For Subject 1 Out Of 100>>" );
        Subj1=myScanner.nextDouble();
        System.out.println("Enter Marks For Subject 2 Out Of 100>>");
        Subj2=myScanner.nextDouble();
        System.out.println("Enter Marks For Subject 3 Out Of 100>>");
        Subj3=myScanner.nextDouble();
        Total=(Subj1+Subj2+Subj3);
        Average=(Total/3.0);

        if(Average>=70 && Average<=100)
           Grade='A';
        else if(Average>=60 && Average<=69)
            Grade='B';
        else if(Average>=50 && Average<=59)
            Grade='C';
        else if(Average>=40 && Average<=49)
            Grade='D';
        else if(Average>=0 && Average<=39)
            Grade='E';
        else
            Grade='N';
        System.out.println("\nTotal Marks for the student:>>>" +Total);
        System.out.println("\nAverage Percentage:>>" + Average);
        System.out.println("\nStudent Grade:>>" +Grade);



    }
}
