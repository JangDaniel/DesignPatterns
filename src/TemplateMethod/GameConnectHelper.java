package TemplateMethod;

public abstract class GameConnectHelper {
    protected String doSecurity(String str) {
        System.out.println("디코드");
        return "디코드";
    }

    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    boolean haveToAuthorization() {
        return true;
    }

    public String requestConnection(String str) {
        doSecurity(str);
        authentication("id", "password");
        if( haveToAuthorization() )
            authorization("daniel");
        return connection(str);
    }
}
