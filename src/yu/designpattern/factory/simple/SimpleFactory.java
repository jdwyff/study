package yu.designpattern.factory.simple;

import yu.designpattern.factory.login.ILoginMethod;
import yu.designpattern.factory.login.MobileLogin;
import yu.designpattern.factory.login.QQLogin;
import yu.designpattern.factory.login.WechatLogin;

public class SimpleFactory {
    public ILoginMethod create(String loginMethod){
        if("mobile".equals(loginMethod)){
            return new MobileLogin();
        }else if("Wechat".equals(loginMethod)){
            return new WechatLogin();
        }else if("QQ".equals(loginMethod)){
            return new QQLogin();
        }else{
            return null;
        }
    }
}
