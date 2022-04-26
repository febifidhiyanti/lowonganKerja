package lowongan;

public class JobVacancy {
    private JobSeekers[] jobSeekers;
    private int amountJobSeekers;
    private int jobSeekersId=0;
    
    public JobVacancy(){
        jobSeekers = new JobSeekers[10];
        amountJobSeekers=0;
    }
    public void addJobSeekers(String username, String password){
        int i = amountJobSeekers++;
        jobSeekers[i] = new JobSeekers (username, password);
    }
    
    public int getAmountJobSeekers(){
        return amountJobSeekers;
    }
    public void logout(){
        jobSeekers[jobSeekersId].logout();
        jobSeekersId=0;
    }
    public JobSeekers loginJobSeekers(String username, String password){
        for(int i=0; i<amountJobSeekers;i++){
            if(jobSeekers[i].login(username,password)){
                jobSeekersId=i;
                System.out.println();
                System.out.println("Login berhasil");
                return jobSeekers[i];
            }
        }
        jobSeekersId=0;
        System.out.println();
        System.out.println("Login gagal");
        return jobSeekers[0];
    }
    public JobSeekers getjobSeekers(int indeks){
        if(indeks<amountJobSeekers)
            return jobSeekers[indeks];
        else return jobSeekers[0];
    }
    public int getJobSeekersId(){
        return jobSeekersId;
    }
}
