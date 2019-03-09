package yu.designpattern.factory.abst;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.MobileLogin;
import yu.designpattern.factory.pay.AliPay;
import yu.designpattern.factory.pay.IPay;

public class MobileFactory implements AbstractFactory {
    @Override
    public ILoginMethod createLogin() {
        return new MobileLogin();
    }

    @Override
    public IPay getPay() {
        return new AliPay();
    }
}
