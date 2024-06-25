package day10.section4;

public class Teacher {

  String name;
  int age;
  String subject;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void print() {
    System.out.println(
        "이  름 : " + this.name + "\t\t나 이 : " + this.age + "\t\t담당과목 : " + this.subject);
  }
}
