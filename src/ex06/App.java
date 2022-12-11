package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/*
 * 데코레이터 패턴
 * (A) -> B(A) -> C(B(A))
 */

public class App {
    public static void main(String[] args) {
        // Notifier notifier = new BasicNotifier();
        // notifier.send();
        // System.out.println("__ end");

        // Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        // emailNotifier.send();
        // System.out.println("__ end");

        // Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        // smsNotifier.send();
        // System.out.println("__ end");

        // 1. 전체 알림 (기본알림->이메일알림->문자알림)
        Notifier allNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("__ end");

        // 2. 전체 알림 (기본알림->문자알림->이메일알림)
        Notifier allNotifier1 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier1.send();
        System.out.println("__ end");

        // 3. 전체 알림 (기본알림->이메일알림->이메일알림->문자알림)
        Notifier allNotifier2 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
        allNotifier2.send();
        System.out.println("__ end");

        // 4. 기본 알림
        Notifier basNotifier = new BasicNotifier();
        basNotifier.send();
        System.out.println("__ end");

        // 5. 기본 알림 + 문자 알림
        Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        smsNotifier.send();
        System.out.println("__ end");

        // 6. 기본 알림 + 이메일 알림
        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("__ end");

        // 7. 이메일 알림
        Notifier onlyEmailNotifier = new EmailNotifier();
        onlyEmailNotifier.send();
        System.out.println("__ end");

        // 8. 문자 알림 + 이메일 알림
        Notifier smsAndEmailNotifier = new EmailNotifier(new SmsNotifier());
        smsAndEmailNotifier.send();
        System.out.println("__ end");
    }
    
}
