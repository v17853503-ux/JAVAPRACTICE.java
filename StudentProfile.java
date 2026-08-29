public class StudentProfile{
    public static void main(String[] arg){
      String studentname= "Viness";
      int age =19;
      String programme="Computersciene";
      double tuitionFee=14950;
      boolean isRegistered= true; 
        System.out.println("--- Student Profile ---");
        System.out.println("Name: " + studentname);
        System.out.println("Age: " + age + " years");
        System.out.println("Programme: " + programme);
        System.out.println("Tuition Fee: K" + tuitionFee);
        System.out.println("Registration Status: " + (isRegistered ? "Registered" : "Not Registered"));
    }
} 