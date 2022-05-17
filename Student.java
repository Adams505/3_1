public class Student {

  private String Name;
  private String Forename;
  private String Birth;

  public Student(String name, String forename, String birth  ) {
    Name = name;
    Forename = forename;
    Birth = birth;
  }

  public String GetName() {return Name;}
  public String GetForename() {return Forename;}
  public String GetBirth() {return Birth;}

  public String ToString() {
    
    return Name + " " + Forename + " " + Birth;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1);
    return new Student(data[0], data[1], data[2]);
  }
}