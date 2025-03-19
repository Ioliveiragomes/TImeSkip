import java.util.Scanner;

public class User {

  Scanner sc = new Scanner(System.in);

  String nickname;
  String name;
  String email;
  int age;
  int projects;
  public int projectsNames;
  private int projectKey;


  void profile(){
    System.out.println("Apelido:" + this.nickname);
    System.out.println("Idade:" + this.age);
    System.out.println("Projetos Abertos:" + this.projects);
  }

  void hideOpenProjects(){
  }

  void status(){
    System.out.println("Apelido:" + this.nickname);
    System.out.println("Nome:" + this.name);
    System.out.println("Email:" + this.email);
    System.out.println("Idade:" + this.age);
    System.out.println("Projetos Abertos:" + this.projects);
  }
}
