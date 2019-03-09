package yu.designpattern.factory.method;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.MobileLogin;

public class MobileLoginFactory implements  MethodFactory {
    @Override
    public ILoginMethod create() {
        return new MobileLogin();
    }
}
