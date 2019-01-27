package a2.football;

public class Igrach {

  private String name;
  private int number;
  private String nationality;
  private String position;
  private int age;

  public Igrach(String name, int number, String nationality, String position, int age) {
    this.name = name;
    this.number = number;
    this.nationality = nationality;
    this.position = position;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public String getNationality() {
    return nationality;
  }

  public String getPosition() {
    return position;
  }

  public int getAge() {
    return age;
  }
}
