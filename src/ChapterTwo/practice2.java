package ChapterTwo;


/**
 * @author kisooon
 * 练习2
 */
public class practice2 {
    public static void main(String args[]) {
        String sayHelloToTheWorld = "Hello, World";
        System.out.println(sayHelloToTheWorld);
        System.out.println("sayHelloToTheWorldLength=" + calculateStringLength(sayHelloToTheWorld));
    }

    private static int calculateStringLength(String sayHelloToTheWorld) {
        return sayHelloToTheWorld.length();
    }
}
