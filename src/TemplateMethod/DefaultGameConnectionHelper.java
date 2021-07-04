package TemplateMethod;

public class DefaultGameConnectionHelper extends GameConnectHelper {


    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증");
        return false;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속");
        return "connect.";
    }

    @Override
    boolean haveToAuthorization() {
        return false;
    }
}
