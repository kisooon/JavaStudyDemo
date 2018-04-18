package ChapterTwo;


/**
 * @author kisooon
 * 练习3：找出含有ATypeName的代码段，将其改写成完整的程序，然后进行编译，运行
 */
public class practice3 {
    public static void main(String args[]) {
        ATypeName aTypeName = new ATypeName();
        aTypeName.name = "kisooon";
        aTypeName.age = 99;
        aTypeName.sex = "male";
        String information = "" + "Name:" + aTypeName.name + "\nAge:" + aTypeName.age + "\nSex:" + aTypeName.sex;
        System.out.println(information);
    }

    private static class ATypeName {
        String name;
        int age;
        String sex;
    }
}
/*
 * The answer:
 * Name:kisooon
 * Age:99
 * Sex:male
 */