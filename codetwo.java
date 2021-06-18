public class StudentTester 
{
    public static void main(String[] args) 
    {
        Student student = new Student("FirstStudent");
        student.addQuiz(50);
        student.addQuiz(60);
        student.addQuiz(70);
        student.addQuiz(80);
        student.addQuiz(90);

        System.out.println("Student: "+ student.getName());
        System.out.println("Total quiz grade: "+ student.getTotalScore());
        System.out.println("Average quiz grade: "+ student.getAverageScore());
    }
}
