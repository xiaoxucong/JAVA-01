package jvm;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HelloClassloder extends ClassLoader {

    public static void main(String[] args) {
        try {
            Object o = new HelloClassloder().findClass("file:///D:/2020-project/java/test/target/classes/jvm/Hello.xlass").newInstance();
            Method m = o.getClass().getMethod("hello");
            m.invoke(o);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name){
        Path path ;
        byte[] bytes = null;
        try {
            path = Paths.get(new URI(name));
            bytes = Files.readAllBytes(path);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bytes == null || bytes.length <1){
            throw new RuntimeException("未读取到文件数据!!!");
        }
        for (int i= 0;i<bytes.length;i++){
            bytes[i] = (byte) (255-bytes[i]);
        }
        return defineClass("Hello",bytes,0,bytes.length);
    }

}
