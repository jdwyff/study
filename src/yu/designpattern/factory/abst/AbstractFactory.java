package yu.designpattern.factory.abst;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.pay.IPay;

public interface AbstractFactory {
    ILoginMethod createLogin();
    IPay getPay();
}
