package top.advanced.reflection;

import java.lang.reflect.Constructor;

public class UploaderFactory {

    // 通过配置文件获取到的配置，实现类的包名.类名
    private String uploader;

    // 创建实现类对象的方法
    public Uploader createUploader() throws Exception{
        // 获取构造方法
        Constructor constructor = Class.forName(uploader).getConstructor();
        return (Uploader) constructor.newInstance();
    }
}

class Uploader{}
