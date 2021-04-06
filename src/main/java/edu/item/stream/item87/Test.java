package edu.item.stream.item87;
import java.io.*;
class A implements Serializable { B b; }
class B implements Serializable { C c; }
class C implements Serializable { A a; }
public class Test {
    public static void main( String [] args ) throws IOException, ClassNotFoundException {
        A a = new A();
        a.b = new B();
        a.b.c = new C();
        a.b.c.a = a;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteStream);
        outputStream.writeObject(a);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        A deserializedA = (A) objectInputStream.readObject();

    }
}

