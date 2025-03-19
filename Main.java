import java.util.Locale;
import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    Locale us = Locale.US;
    Locale pt = Locale.ENGLISH;
    Scanner sc = new Scanner(System.in);

    System.out.println("Bem Vindo ao TImeSkip");
    System.out.println("1 - Cadastro:");
    int register = sc.nextInt();

    switch (register){
      case 1:
        User a1 = new User();
        System.out.println("Nome:");
        a1.name = sc.next();
        System.out.println("Email:");
        a1.email = sc.next();
        System.out.println("idade:");
        a1.age = sc.nextInt();
        System.out.println("Como você gostaria de ser chamado");
        a1.nickname = sc.next();
        a1.status();
        break;
    }
    System.out.println("Open a new Project");
    int openNewProject = sc.nextInt();

    switch (openNewProject){
      case 1:
        Project newProject = new Project();
        newProject.newProject();
        newProject.projectStatus();
        newProject.status();
        break;



  }
}}