//新建一个类，在其中定义了两个方法，求和，求差
class MathPractice{
    public int sum(int x,int y){

        return(x+y);
    }
    public int difference(int x,int y){
        return(x>y?(x-y):(y-x));
    }
}
//新建一个主类，且继承自MathPractice
public class Project_Practice005 extends MathPractice{
    public static void main(String[] args) {
        //新建对象
        Project_Practice005 test = new Project_Practice005();
        //调用父类的方法
        System.out.printf("the sum is %d\n",test.sum(12, 7));
        System.out.printf("the difference is %d",test.difference(12, 7));
        // double x = 45;
        // double y = 30;
        // double result = Math.atan2(y,x);
        System.out.printf("\nHello, World.");
        //return;
    }
}
/**
 * 最后修改日期：2019年6月22日
 * 小结：继承是在一个大类中新建一个子类，子类可以继承父类的方法-
 * 文件名必须和类相同，应该与含有public修饰符的类相同，一个文件中最多有一个public类-
 * 1.Java保存的文件名必须与类名一致；
 * 2.如果文件中只有一个类，文件名必须与类名一致；
 * 3.一个Java文件中只能有一个public类；
 * 4.如果文件中不止一个类，文件名必须与public类名一致；
 * 5.如果文件中不止一个类，而且没有public类，文件名可与任一类名一致。
 * //以上5点摘自CSDN，ID：神杀中龙。
 */
