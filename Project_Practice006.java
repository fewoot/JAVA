import java.util.*;

public class Project_Practice006{
    //统计方法，输出数组
    public int[] statistics(char[] input){
        //英文字母、空格、数字和其它字符
        int[] data = new int[4];
        for(char temp:input){
            if((temp>='a' && temp<='z') || (temp>='A' && temp<='Z')){
                data[0]++;
            }else if(temp==' '){
                data[1]++;
            }else if(temp>='0' && temp<='9'){
                data[2]++;
            }else{
                data[3]++;
            }
        }
        return data;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //得到输入
        String input_s = input.nextLine();
        //转换为字符串
        char[] input_c = input_s.toCharArray();
        Project_Practice006 test = new Project_Practice006();
        int[] total = test.statistics(input_c);
        //打印
        System.out.printf("字母：%d\n空格：%d\n数字：%d\n其他：%d",total[0],total[1],total[2],total[3]);
        System.out.printf("\nHello, World.");
        //return;
    }
}
/**
 * 最后编辑时间：2019年6月23日
 * 小结：Java可以从方法中输出数组，太爽了，而且Java库中已经包含了许多-
 * 针对不同类型的包和方法，可以直接调用。
 */