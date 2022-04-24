package lowongan;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        JobVacancy jobVacancy = new JobVacancy();
        jobVacancy.addJobSeekers("null","null");
        JobSeekers user = jobVacancy.loginJobSeekers("null","null");
        
        int menu=0;
        while(menu!=3){
            while(jobVacancy.getJobSeekersId()!=0){
                System.out.println("\nChoice your option:");
                System.out.println("1. Job Vacancy");
                System.out.println("2. Logout");
                System.out.println("\nYour Choice:");
                int pilih = scan.nextInt();
                switch(pilih){
                    case 1:
                        showListJob();
                        break;
                    case 2:
                        jobVacancy.logout();
                        break;
                }
            }
            System.out.println("\nJOB VACANCY");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Finish");
            System.out.print("Your Choice: ");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.print("username:   ");
                    scan.nextLine();
                    String usernameRegister = scan.nextLine();
                    System.out.print("password:   ");
                    String passwordRegister = scan.nextLine();
                    jobVacancy.addJobSeekers(usernameRegister,passwordRegister);
                    break;
                case 2:
                    System.out.print("username: ");
                    scan.nextLine();
                    String usernameLogin = scan.nextLine();
                    System.out.print("password: ");
                    String passwordLogin = scan.nextLine();
                    user = jobVacancy.loginJobSeekers(usernameLogin,passwordLogin);
                    break;
            }       
        }
    }
            
    private static void showListJob() {
        System.out.println("\n-- JOB VACANCY --");
        for (int i = 0; i < DetailJob.addListJob().length; i++) {
            System.out.println("\nCompany : " + DetailJob.addListJob()[i].getCompany());
            System.out.println("Position : " + DetailJob.addListJob()[i].getPosition());
            System.out.println("Location : " + DetailJob.addListJob()[i].getLocation());
            System.out.println("Condition : " + DetailJob.addListJob()[i].getCondition());
            System.out.println("Fee : Rp. " + DetailJob.addListJob()[i].getFee());
            System.out.println("Contact : " + DetailJob.addListJob()[i].getContact());
            System.out.println("Last Registration : " + DetailJob.addListJob()[i].getLastRegistration());
            System.out.println("");
        }
    }
        
}
