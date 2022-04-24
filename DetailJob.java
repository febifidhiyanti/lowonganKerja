package lowongan;

public class DetailJob {
    private Job job;
    
    public DetailJob(){
    }
    
    static Job[] addListJob() {
        Job job1 = new Job();
        job1.setCompany("Ruang Guru");
        job1.setPosition("IEC");
        job1.setLocation("Yogyakarta");
        job1.setCondition("Freelance");
        job1.setFee(2000000);
        job1.setContact("https://career.ruangguru.com");
        job1.setLastRegistration("20 November 2022");
        
        Job job2 = new Job();
        job2.setCompany("SHOPEE");
        job2.setPosition("Social Media Lead (ShopeePay)");
        job2.setLocation("Thailand - Bangkok");
        job2.setCondition("Full Time");
        job2.setFee(10000000);
        job2.setContact("https://careers.shopee.co.id/");
        job2.setLastRegistration("1 Januari 2024");
        
        Job job3 = new Job();
        job3.setCompany("Zenius");
        job3.setPosition("Head of Field Sales");
        job3.setLocation("Jakarta");
        job3.setCondition("Full Time");
        job3.setFee(5000000);
        job3.setContact("https://www.zenius.net/we-are-hiring/");
        job3.setLastRegistration("18 Juni 2022");

        Job list[] = new Job[3];
        list[0] = job1;
        list[1] = job2;
        list[2] = job3;

        return list;
    }
}
