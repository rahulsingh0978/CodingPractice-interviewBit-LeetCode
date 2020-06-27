package oopsconcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	int a;
	int b;
	static int bs;
	transient int g;
	String name;

	Demo(int a, int b, int bs, int g, String name) {
		this.a = a;
		this.b = b;
		this.bs = bs;
		this.g = g;
		this.name = name;
	}

}

public class SerializationDSer {
	public static void main(String[] args) {
		Demo obj = new Demo(12, 13, 14, 15, "rahul");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.bs);
		System.out.println(obj.g);
		System.out.println(obj.name);
		try {
			FileOutputStream fs = new FileOutputStream("demo.ser");
			ObjectOutputStream o = new ObjectOutputStream(fs);
			o.writeObject(obj);
			fs.close();
			o.close();
			System.out.println("Serialization done!!");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		try {
			FileInputStream fi = new FileInputStream("demo.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);

			Demo obj1 = (Demo) oi.readObject();
			fi.close();
			oi.close();
			System.out.println(obj1.a);
			System.out.println(obj1.b);
			System.out.println(obj1.bs);
			System.out.println(obj1.g);
			System.out.println(obj1.name);
			System.out.println("Deserilization Done!!");
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
