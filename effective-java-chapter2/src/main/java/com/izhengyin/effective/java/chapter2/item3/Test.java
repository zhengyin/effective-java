package com.izhengyin.effective.java.chapter2.item3;

import com.izhengyin.effective.java.chapter2.item3.field.MySingleton2;
import com.izhengyin.effective.java.chapter2.item3.serializable.MySingleton;

import java.io.*;

/**
 * Created by zhengyin on 2017/8/4 上午10:24.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args) throws Exception{
        MySingleton2.INSTANCE.say();
        MySingleton2.INSTANCE.say();
        testEnum();
        testSingletonSerializable();
    }

    private static void testEnum(){
        com.izhengyin.effective.java.chapter2.item3.enumeration.MySingleton mySingleton1 = com.izhengyin.effective.java.chapter2.item3.enumeration.MySingleton.INSTANCE;
        mySingleton1.say();
        com.izhengyin.effective.java.chapter2.item3.enumeration.MySingleton mySingleton2 = com.izhengyin.effective.java.chapter2.item3.enumeration.MySingleton.INSTANCE;
        mySingleton2.say();
    }


    /**
     * 测试单例序列化与反序列化
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void testSingletonSerializable() throws IOException, ClassNotFoundException {
        MySingleton mySingleton = MySingleton.INSTANCE;
        File mySingletonSerFile = new File("/tmp/mySingleton.ser");
        mySingleton.say();
        if(mySingletonSerFile.exists()){
            mySingletonSerFile.delete();
        }
        if(mySingletonSerFile.createNewFile()){
            FileOutputStream outputStream = new FileOutputStream(mySingletonSerFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySingleton);
            FileInputStream inputStream = new FileInputStream(mySingletonSerFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            MySingleton mySingleton2 = (MySingleton) objectInputStream.readObject();
            mySingleton2.say();
            // close Stream
            outputStream.close();
            objectInputStream.close();
            inputStream.close();
            objectInputStream.close();
        }
    }
}
