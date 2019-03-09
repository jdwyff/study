package yu.designpattern.factory.method;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.QQLogin;

public class QQLoginFactory implements MethodFactory {
    @Override
    public ILoginMethod create() {
        return new QQLogin();
    }
}
