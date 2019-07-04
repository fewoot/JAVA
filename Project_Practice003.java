import java.util.*;
public class Project_Practice003{
//分解并且输出方法
    public void Decompose(int Input){
        System.out.print(Input+"=");
        while(Input!=1){
            for(int i=2;i!=0;i++){
                if(Input%i==0){
                    System.out.print(i);
                    Input /= i;
                    if(Input!=1){
                        System.out.printf("*");
                    }
                    i = -1;
                }
            }
        }
        return;
    }
    //主函数
    //新知识在下方
    public static void main(String[] args) {
        Scanner INput = new Scanner(System.in);
        int Input = INput.nextInt();
        Project_Practice003 test = new Project_Practice003();
        test.Decompose(Input);
        //System.out.println("Hello, World.");

        return;
    }
}
/**
 * 最后编辑时间：2019年6月20日
 * 新知识：Scanner类
 * 小结：1.在Java中输入要用特定的类：Scanner类，想要从键盘中输入数据，需要先用Scanner类new一个对象-
 * 再调用Scanner类中已有的方法：.nextInt()，就可以从键盘读取数据了-
 * 要用此类，需要在头文件，类前面加上一句：import java.util.*;得到父类支持-
 * 在launch文件中进行设置可以在VS code中使用终端，已经调试好。
 */