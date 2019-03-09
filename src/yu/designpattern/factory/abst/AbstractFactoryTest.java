package yu.designpattern.factory.abst;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.pay.IPay;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory af = new MobileFactory();
        login(af.createLogin());
        pay(af.getPay());
    }
    public static void login(ILoginMethod login){
        login.login();
    }
    public static void pay(IPay pay){
        pay.pay();
    }
}
