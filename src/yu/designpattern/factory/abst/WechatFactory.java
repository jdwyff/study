package yu.designpattern.factory.abst;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.WechatLogin;
import yu.designpattern.factory.pay.IPay;
import yu.designpattern.factory.pay.WechatPay;

public class WechatFactory implements  AbstractFactory {
    @Override
    public ILoginMethod createLogin() {
        return new WechatLogin();
    }

    @Override
    public IPay getPay() {
        return new WechatPay();
    }
}
