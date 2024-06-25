package day10.section4;

public class Employee {

  String name;
  int age;
  String dept;

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

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public void print() {
    System.out.println("이  름 : " + this.name + "\t\t나 이 : " + this.age + "\t\t부  서 : " + this.dept);
  }
}
