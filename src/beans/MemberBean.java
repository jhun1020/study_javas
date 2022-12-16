package beans;

public class MemberBean {
    String firstName;
    String secondName;
    String handleName;

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
