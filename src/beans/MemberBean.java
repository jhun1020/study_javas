package beans;

public class MemberBean {
    private String firstName;
    private String secondName;
    private String handleName;

    public MemberBean(String firstName, String secondName, String handleName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.handleName = handleName;
    }
    public MemberBean() {
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public String getSecondName(){
        return secondName;
    }

    public void setHandleName(String handleName){
        this.handleName = handleName;
    }
    public String getHandleName(){
        return handleName;
    }
}
