public class A03局部变量的使用 {
    public static void main(String[] args) {

// 在同一个作用域内变量名不能重复,
// 变量的定义位置:定义在方法中或者语句块中。
// .变量的一定要赋初始值，否则使用该变量的时候会报错的。·
// 变量的作用范围:只在当前的大括号内有效（包括子括号)，
// 大括号外的所有程序不能使用该变量，所以这种变量也称为局部变量。|T

        int age = 19;
        System.out.println(age);
    }


}
