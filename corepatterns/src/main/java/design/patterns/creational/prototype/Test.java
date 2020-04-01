package design.patterns.creational.prototype;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 假设new Mail比较耗时
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        System.out.println("初始化mail:"+mail);

        for(int i = 0;i < 2;i++){
            // 原始的去克隆 mail 和  mailTemp 地址存的不同
            Mail mailTemp = (Mail) mail.clone();
            // 克隆的mail--》群发邮件
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);

            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        // 要求存储的时候还是存最初的mail的content
        MailUtil.saveOriginMailRecord(mail);
    }
}
