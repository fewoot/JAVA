public class Project_Practice001{
    int Total=0;
    
    //判断方法
    public int Judge_function(int Number){
        for(int i=2;i<Number;++i){
            if((Number%i)==0){
                return 0;
            }
        }
        Total++;
        return 1;
    }

    //输出方法
    public void OutPut_function(int Number){
        for(;Number<=200;++Number){
            if(Judge_function(Number)==1){
                System.out.println(Number);
            }
        }
    }

    //主程序
    public static void main(String[] args) {
        int Number=101;
        // //System.out.println("Hello, World.");
        // OutPut_function(Number);
        Project_Practice001 test = new Project_Practice001();
        test.OutPut_function(Number);
        System.out.println(test.Total);
    }
}
/**
 * 最后更改时间：2019年6月18日
 * 小结：开始回顾java，对java的面向对象编程有了一些了解和深入思考-
 * 面向对象是说在main主方法里面调用主类里面的方法体的时候是基于对象展开的-
 * 也就是说必须先实例化对象，对象拥有类的方法，再对对象进行更改-
 * 和C不同的是，C可以不实例化对象，或者说C不一定要有使用者，只要有方法，就可调用-
 * 而java必须基于对象才可调用方法-
 * 类和C里面的结构体很相似，又有很大不同，最大的区别就是java必须要有对象，即-
 * 类的实例，而C的结构体不用，或者说C的结构体没有对象这一说。
 */