package yu.designpattern.factory.login;

public class QQLogin implements ILoginMethod {
    @Override
    public void login() {
        System.out.println("QQ登录");
    }
}
