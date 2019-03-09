package yu.designpattern.factory.method;

import yu.designpattern.factory.login.ILoginMethod;

public interface MethodFactory {
    ILoginMethod create();
}
