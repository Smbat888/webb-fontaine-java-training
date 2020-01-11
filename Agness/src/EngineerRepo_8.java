public class EngineerRepo_8 {
    private static Engineer_4[] engineers = new Engineer_4[6];
    static {  //mi angam initalize enq arel u el chi poxvelu
        System.out.println("engineers initialization");
        engineers[0] = new Engineer_4("Lilia", Role_5.QA);
        engineers[1] = new Engineer_4("Aurora", Role_5.QA);
        engineers[2] = new Engineer_4("Alex", Role_5.DEVELOPER);
        engineers[3] = new Engineer_4("Rob", Role_5.DEV_OPS);
        engineers[4]= new Engineer_4("Sarah", Role_5.PM);
        engineers[5] = new Engineer_4("Gary", Role_5.DEVELOPER);
    }
    private EngineerRepo_8() {
    }
    //getter arrayi hamar
    public static Engineer_4[]get(){
        return engineers;
    }
}
