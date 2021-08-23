// Katherine Monroy
// 2368029
// kmonroy@chapman.edu
// CPSC 231-02
// MP1: Recursion and Intro to Classes

public class StudentRecord{

    //declaring private fields
    private double gradeQ1;
    private double gradeQ2;
    private double gradeQ3;
    private double midterm;
    private double finalexam;

    // default constructor
    public StudentRecord(){
      gradeQ1 = 0;
      gradeQ2 = 0;
      gradeQ3 = 0;
      midterm = 0;
      finalexam = 0;

   }

   // second constructor with arguments to initilize the private fields
   public StudentRecord(double gradeQ1, double gradeQ2,double gradeQ3,double midterm,double finalexam ){
      this.gradeQ1 = gradeQ1;
      this.gradeQ2 = gradeQ2;
      this.gradeQ3 = gradeQ3;
      this.midterm = midterm;
      this.finalexam = finalexam;

   }

   // accesors and mutators KNOWN AS getters and setters for eachhhhh private field
   //GETTERS
   public double getGradeQ1(){
     return gradeQ1;
   }
   public double getGradeQ2(){
    return gradeQ2;
   }
   public double getGradeQ3(){
     return gradeQ3;
   }
   public double getMidterm(){
     return midterm;
   }
   public double getFinalexam(){
     return finalexam;
   }

   //SETTERS
   public void  setGradeQ1(double gradeQ1){
     this.gradeQ1 = gradeQ1;
   }
   public void  setGradeQ2(double gradeQ2){
     this.gradeQ2 = gradeQ2;
   }
   public void  setGradeQ3(double gradeQ3){
     this.gradeQ3 = gradeQ3;
   }
   public void  setMidterm(double midterm){
     this.midterm = midterm;
   }
   public void  setFinalexam(double finalexam){
     this.finalexam = finalexam;
   }

   //computes what the students overall grade is ( also known as the weighted grade)
   public double computeNumericScore(){

     double quizScores = (((this.gradeQ1 + this.gradeQ2 + this.gradeQ3)*10)/3)* 0.25;//25%
     double midtermScore = this.midterm * 0.35;//35%
     double finalexamScore = this.finalexam * 0.4; //40%
     double finalGrade = quizScores + midtermScore + finalexamScore; //100%

     return finalGrade;

   }

  //method for letter grade
  public String computeLetterGrade(double numericGrade){
    String letterGrade = "";
    //returns the letter grade the student hasbased on his/her numeric grade(also known as finalGrade).
    if(numericGrade >= 90.0 && numericGrade < 100.0){
        return "A";
      }
      else if(numericGrade >= 80.0 && numericGrade < 90.0){
       return "B";
      }
      else if(numericGrade >= 70.0 && numericGrade < 80.0){
        return  "C";
      }
      else if(numericGrade >= 60.0 && numericGrade < 70.0){
        return  "D";
      }
      else if(numericGrade < 60.0) {
        return  "F";
      }
      else{
        return "Error computing grade";// if user doesnt put something that turns through the if statements it prints this out
      }

  }

  //method that outputs everything into a beautiful string
  public String toString(){
    //that returns a String containing an appropriate description of the student’s record.
    double weightedGrade = computeNumericScore(); //variable for the final weighted grade
    return ("Q1: " + this.gradeQ1 +"\nQ2: "+ this.gradeQ2 + "\nQ3: "+ this.gradeQ3
    + "\nMidterm: "+ this.midterm + "\nFinal: "+ this.finalexam + "\n# Score: "+ weightedGrade
    + "\nLetter Grade: "+ computeLetterGrade(weightedGrade));//calls computeLetterGrade so that it can print out the overall grade

  }

  // method that checks b/w two student records to see if they are equal or not
  public boolean equals(StudentRecord other){
    //default equals things that check weather the object is even the same before it tests weather they are equal or not.
    if (this == other){
      return true;
    }
    if (!(other instanceof StudentRecord)){
      return false;
    }
    boolean isEqual = false;

    if(this.gradeQ1 == other.gradeQ1 &&
    this.gradeQ2 == other.gradeQ2 &&
    this.gradeQ3 == other.gradeQ3 &&
    this.midterm == other.midterm &&
    this.finalexam == other.finalexam)
    {
      isEqual = true;
    }
  return isEqual;

  }

  //main method ( includes all calls to other methods)
  public static void main(String[] args){
    StudentRecord student1 = new StudentRecord();
    System.out.println(student1);// blank student just to show that all the defaults work
    student1.setGradeQ1(5); // setting attributes of student 1:
    student1.setGradeQ2(5);
    student1.setGradeQ3(5);
    student1.setMidterm(50);
    student1.setFinalexam(50);
    System.out.println(""); // blank line
    System.out.println(student1); // student w/ new things
    System.out.println(""); // blank line
    StudentRecord student2 = new StudentRecord();
    student2.setGradeQ1(7);// setting attributes of student 2:
    student2.setGradeQ2(7);
    student2.setGradeQ3(7);
    student2.setMidterm(70);
    student2.setFinalexam(70);
    System.out.println(student2);//prints student 2
    System.out.println("Are the two students equal ? : "+ student1.equals(student2));//calls the equals method to figure out weather the students have the same grades


  }

}
