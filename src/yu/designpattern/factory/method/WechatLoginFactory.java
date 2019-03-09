package yu.designpattern.factory.method;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.WechatLogin;

public class WechatLoginFactory implements MethodFactory {
    @Override
    public ILoginMethod create() {
        return new WechatLogin();
    }
}
