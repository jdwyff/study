package yu.designpattern.factory.login;

public class MobileLogin implements ILoginMethod{
    @Override
    public void login() {
        System.out.println("手机号码登录");
    }
}
