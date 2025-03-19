import java.util.Scanner;

public class Project {

  Scanner sc = new Scanner(System.in);

  String name;
  String description;
  int subdivision;
  int projects;
  boolean projectStatus;
  public int projectsNames;
  private int projectKey;

  void status(){
    System.out.println("Nome:" + this.name);
    System.out.println("Descrição:" + this.description);
    System.out.println("Partições:" + this.subdivision);
  }

  void projectStatus(){
    if(projectStatus = true){
      System.out.println("Ativo");
    }
    else{
      System.out.println("Desativo");
    }
  }
  void newProject(){
    if(this.projects >=5){
      System.out.println("Número máximo de projetos alcançados");
    }
    else{
      Project p1 = new Project();
      p1.projects = this.projects + 1;
      System.out.println("Nome:");
      p1.name = sc.next();
      System.out.println("Descrição:");
      p1.description = sc.next();
      System.out.println("Partições:");
      p1.subdivision = sc.nextInt();
    }
  }
  void modifyStatus(){
    System.out.println("Nome");
  }
  void deleteProject(){
    this.projects = this.projects -1;
  }
}

