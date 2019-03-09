package yu.designpattern.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory f = new SimpleFactory();
        f.create("QQ").login();
    }
}
