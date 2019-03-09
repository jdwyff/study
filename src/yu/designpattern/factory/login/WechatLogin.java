package yu.designpattern.factory.login;

public class WechatLogin implements ILoginMethod {
    @Override
    public void login() {
        System.out.println("微信登录");
    }
}
