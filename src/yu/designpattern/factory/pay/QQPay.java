package yu.designpattern.factory.pay;

public class QQPay implements IPay {
    @Override
    public void pay() {
        System.out.println("QQ财付通支付");
    }
}
