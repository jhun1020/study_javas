// import beans.DataInfors;  왜 나는 임포트 안해도 에러가 안뜨지

public class BeansMain {
    public static void main(String[] args) {
        DataInfors DataInfors = new DataInfors();
        MemberBean memberbean = DataInfors.getDataWithMemberBean();

        System.out.println(memberBean.getFirstName() + " " + memberbean.getSecondName() + " " + memberBean.getHandleName());
    }
}