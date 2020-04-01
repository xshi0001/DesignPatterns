package design.patterns.creational.builder.decorationdemo;

/**
 * @program: designpatterns
 * @description: client
 * @author: JClearLove
 * @Date: 2020/03/23 15:56
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}