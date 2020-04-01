package design.patterns.creational.builder.decorationdemo;

/**
 * @program: designpatterns
 * @description: 项目经理
 * @author: JClearLove
 * @Date: 2020/03/23 15:56
 */
public class ProjectManager {

    private Decorator builder;

    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }

    public Parlour decorate() {

        builder.buildTv();
        builder.buildWall();
        builder.buildSofa();
        return builder.getResult();


    }

}

