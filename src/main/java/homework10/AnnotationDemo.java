/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import homework10.AuthorAnnotation.Author;

import java.lang.reflect.Method;


public class AnnotationDemo {
    @Author(name="Mariami",date="23/06/2026")
    public static void method1() {
    System.out.println("Method 1");
    }
    @Author(name = "Mari")
    public static void method2() {
        System.out.println("Method 2");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = AnnotationDemo.class.getMethod("method1");
        System.out.println(method.getAnnotation(Author.class).name());

        Method methodMari = AnnotationDemo.class.getMethod("method2");
        System.out.println(methodMari.getAnnotation(Author.class).name());
            }
    }
