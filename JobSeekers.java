package lowongan;

public class JobSeekers {
    private String username;
    private String password;
    private boolean isLogin=false;
    
    
    public JobSeekers(String username, String password){
        this.username=username;
        this.password=password;
    }

    public boolean login(String username, String password){
        isLogin = this.username.equals(username) && this.password.equals(password);
        return isLogin;
    }

    private boolean cekLogin(){
        return isLogin;
    }

    public void logout(){
        isLogin=false;
    }    
    
}
