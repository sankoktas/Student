public class Student 
{
    private String StudentName;
    private int quizNo;
    private int Grade;
   
    public Student(String name)
    {
        this.StudentName=name;
        this.quizNo=0;
        this.Grade=0;
    }

    public String getName()
    {
        return StudentName;
    }

    public void addQuiz(int score)
    {
        this.Grade+=score;
        quizNo++;
    }

    public int getTotalScore()
    {
        return Grade;
    }

    public double getAverageScore()
    {
        return (double)Grade/quizNo;
    }

}
