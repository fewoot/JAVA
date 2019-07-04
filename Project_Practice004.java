import java.util.*;
public class Project_Practice004{
    String name;
    int grade;
    char level;
    //构造方法，并将类中的name、grade进行赋值
    public Project_Practice004(String name_v){
        System.out.print("Please input "+name_v+"'s grade:");
        Scanner input = new Scanner(System.in);
        int input_v = input.nextInt();
        this.name = name_v;
        this.grade = input_v;
        //return;
    }
    //分级方法
    void judge(){
        if(this.grade>=90){
            this.level = 'A';
        }else if(this.grade<60){
            this.level = 'C';
        }else{
            this.level = 'B';
        }
        System.out.println(this.name+"'s level is "+this.level);
    }
    public static void main(String[] args) {
        // //System.out.println();
        // int test = Integer.valueOf(9);
        // double a = Double.valueOf(12);
        // double b = Double.valueOf("12");
        // double c = Double.valueOf("342");
        // Integer d = Integer.valueOf("78",16);
        // //int e = Integer.valueOf("1e2",16);
        // System.out.println("???");
        // //System.out.println("Hello, World.");
        // //
        Project_Practice004 ykl = new Project_Practice004("zy");
        ykl.judge();
        System.out.println();
    }
}
/**
 * 最后编辑日期：2019年6月21日
 * 题目：将一个人的成绩进行分类
 * 小结：1.构造方法不需要返回值，其方法名必须和类一致-
 * 2.this可以代替一个对象，代替调用此方法/变量的对象
 * 
 * 
 * 
 * 
 */