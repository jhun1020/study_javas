package beans;

import beans.DataInfors;  


public class BeansMain {
    
    public static void main(String[] args) {
        DataInfors DataInfors = new DataInfors();
        MemberBean memberbean = DataInfors.getDataWithMemberBean();
        
        System.out.println(memberBean.getFirstName() + " " + memberbean.getSecondName() + " " + memberBean.getHandleName());
    }
}