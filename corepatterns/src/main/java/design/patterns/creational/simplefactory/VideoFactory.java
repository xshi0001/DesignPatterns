package design.patterns.creational.simplefactory;

/**
 * Created by geely
 */
public class VideoFactory {
    /**
     * 生产视频方法
     * 通过反射解决简单工程扩展性问题，无需修改工厂方法，可以新建任何类型视频
     * @param c 需要生产视频的类型
     * @return 某视频对象
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }


    /**
     * 生产视频方法
     * @param type  视频名称
     * @return Video对象
     */
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

}
