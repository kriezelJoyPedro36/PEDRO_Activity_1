//1.Private Attributes
public class Student{
    private String name;
    private String studentId;
    private double grade;
}
//2. Constructor to initialize all three Attributes
public Student ( String name,| String student Id, |double grade ) {
    this.name = name;
    this.studentId = studentId;
    this.grade = grade;
}
//3. getters for each attribute
public String getName(){
    return name;
}
public String getstudentId(){
    return name;
}
public double getGrade(){
    return grade;
}
public void setGrade (double grade){
    this.grade = grade;
}
// 4. Method to display student information
public void displayInfo(){
    System.out.println("Name:" + name + " | ID:" + studentId + " | Grade: " + grade);
}
//5. main method execution
public static void main (String []  args){
    Student student1 = new Student ( "Juan Dela Cruz", "2026-001", 88.5);
    Student student2 = new Student ( "Maria Santos ", "2026-002", 88.5);

//change 1 student's grade using the setter
    student1.setGrade (92.0);
    
//call the displayInfo() on both objectts
    student1.displayInfo();
    student2.displayInfo();
}