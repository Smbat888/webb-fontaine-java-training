package ToDoList;
public class Unassigned_7 extends Engineer_4{  //instance ov unassigned a
    private static Unassigned_7 instance;  //uni name role instance
    private Unassigned_7(){
        this.name=Constants_6.UNASSIGNED; //or "Unassigned"
    }
    public static Unassigned_7 getInstance(){
        if (instance==null){   //if poqrn a  //singletone  //ete nulla petq chi
            instance=new Unassigned_7();
        }
        return instance;
    }
}