package lowongan;

public class Job {
    
    private String company;
    private String position;
    private String location;
    private String condition;
    private int fee;
    private String contact;
    private String lastRegistration;
    
    
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
        
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }    

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setLastRegistration(String lastRegistration) {
        this.lastRegistration = lastRegistration;
    }

    public String getLastRegistration() {
        return lastRegistration;
    }
}
