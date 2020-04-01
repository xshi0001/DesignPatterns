package design.patterns.creational.singleton;

/**
 * Created by geely
 * <p>
 * 枚举实现单例
 */
public enum EnumInstance {
    /**
     *
     */
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("Geely Print Test");


        }
    };
    protected abstract void printTest();
    /**
     *
     */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}