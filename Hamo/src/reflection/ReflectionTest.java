package reflection;


import java.lang.reflect.*;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // first way
        Class<Demo> demoClass = Demo.class;

        // 2 way
        Demo demo = new Demo();
        Class demoClass1 = demo.getClass();

        // 3th way
        Class demoClass2 = Class.forName("reflection.Demo");


        Field [] fields = demoClass2.getFields();

        System.out.println("before demo = " + demo.age);

        Field age = demoClass2.getField("age");
        age.set(demo, 33);

        System.out.println("after demo = " + demo.age);

//        for (Field field : fields) {
//            System.out.println("field = " + field.getName());
//        }
//
//        Field [] declearedFields = demoClass2.getDeclaredFields();
//        for (Field field : declearedFields) {
//            System.out.println("declearedFields = " + field.getName());
//            System.out.println("type = " + field.getType().getName());
//            System.out.println("modifier = " + Modifier.toString(field.getModifiers()));
//        }

//        Method [] methods = demoClass2.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("method.getName() = " + method.getName());
//            System.out.println("method.getReturnType() = " + method.getReturnType().getName());
//            Parameter [] parameters = method.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println("parameter.getName() = " + parameter.getName());
//                System.out.println("parameter.getType() = " + parameter.getType().getName());
//            }
//        }

//
//        Demo myDemo = new Demo();
//        //myDemo.smile();
//
//        try {
//            Method method = demoClass2.getDeclaredMethod("wave", String.class, int.class);
//            method.setAccessible(true);
//            method.invoke(myDemo, "fff", 25);
//
//            Method myMethod = demoClass2.getDeclaredMethod("myMethod");
//            myMethod.invoke(Demo.class, null);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        System.out.println("MySingltone = " + MySingltone.getInstance());
        System.out.println("MySingltone = " + MySingltone.getInstance());
        System.out.println("MySingltone = " + MySingltone.getInstance());


        Class<MySingltone> singltoneClass = MySingltone.class;

        Constructor constructor = singltoneClass.getDeclaredConstructor();

        constructor.setAccessible(true);

        MySingltone mySingltone = (MySingltone) constructor.newInstance();

        System.out.println("MySingltone = " + mySingltone);
    }

}