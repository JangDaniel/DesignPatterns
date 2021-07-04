package TemplateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("아이디 암호 등 접속정보");
    }
}
