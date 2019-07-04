import java.util.Scanner;

public class Project_Practice007{
    public static void main(String[] args) {
        int basic;
        int number;
        int total=0;
        //输入模块
        System.out.println("Please write the basic:");
        Scanner scan = new Scanner(System.in);
        basic = scan.nextInt();
        System.out.println("Please write the number");
        number = scan.nextInt();
        //关闭输入
        scan.close();
        //开始计算
        for(int i=0;i<number;++i){
            for(int n=1,temp=1;temp<=(i+1);temp++){
                total += (basic*n);
                n *= 10;
            }
        }
        //输出结果
        System.out.println("the total = "+total);
        System.out.printf("\nHello, World.");
    }
}
/**
 * 最后编辑日期：去、2019年6月24日
 * 小结：if中不可定义变量，因为在if中新定义的变量是局部变量，随着if语句的结束而结束-
 * String类型不可更改，但在对象中的String好像可以更改？待我回去在做验证。
 */