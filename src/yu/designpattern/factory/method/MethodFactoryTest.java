package yu.designpattern.factory.method;

public class MethodFactoryTest {
    public static void main(String[] args) {
        MethodFactory nf = new QQLoginFactory();
        nf.create().login();
    }
}
