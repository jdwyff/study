package yu.designpattern.factory.abst;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.QQLogin;
import yu.designpattern.factory.pay.IPay;
import yu.designpattern.factory.pay.QQPay;

public class QQFactory implements AbstractFactory {
    @Override
    public ILoginMethod createLogin() {
        return new QQLogin();
    }

    @Override
    public IPay getPay() {
        return new QQPay();
    }
}
