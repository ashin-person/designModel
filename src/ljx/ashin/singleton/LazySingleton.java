package ljx.ashin.singleton;

/**
 * 懒汉单例模式
 * Created by AshinLiang on 2017/7/27.
 */
public class LazySingleton {
    //私有化构造函数
    private LazySingleton(){};

    private static LazySingleton instance = null;//没有在类加载的时候就初始化

    public static synchronized LazySingleton getInstance(){//同步的
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
