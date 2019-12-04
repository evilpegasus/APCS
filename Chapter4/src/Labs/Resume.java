package Labs;

//class
public class Resume 
{
    //declaring instance data
    private String name;
    private int grade;
    private int age;
    private double gpa;
    private int SATScore;

    //default constructor
    public Resume() {
        //initializing instance data
        name = "John Doe";
        grade = 1;
        age = 1;
        gpa = 1.0;
        SATScore = 400;
    }
    
    //constructor
    public Resume(String n, int g, int a, double gp, int s) {
        //intializing instance data
        name = n;
        grade = g;
        age = a;
        gpa = gp;
        SATScore = s;
    }
    
    //GET methods (accessors)
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getAge() {
        return age;
    }
    public double getGPA() {
        return gpa;
    }
    public int getSATScore() {
        return SATScore;
    }

    //SET methods (mutators)
    public void setName(String n) {
        name = n;
    }
    public void setGrade(int g) {
        grade = g;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setGPA(double g) {
       gpa = g;
    }
    public void setGPA(int g) {
        gpa = (double)g;
     }
    public void setSAT(int s) {
       SATScore = s;
    }
    
    public static int estimateSAT(double GPA) {
        return (int)(400 + GPA * 300);
    }
}