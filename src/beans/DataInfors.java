package beans;

public class DataInfors {
        public MemberBean getDataWithMemberBean(){
            MemberBean memberbean = new MemberBean();
            memberbean.setFirstName("Mark");
            memberbean.setSecondName("Otto");
            memberbean.setHandleName("@mdo");

            return memberbean;
        }
}
