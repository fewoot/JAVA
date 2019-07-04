public class Project_Practice002{
    int[] Array = new int[3];

    //将一个数字分解成三个数，存储在数组中
    public void Spit(int Number,int[] Array){
        Array[0] = (Number/100);
        Number = Number%100;
        Array[1] = (Number/10);
        Number = Number%10;
        Array[2] = (Number);
        return;
    }

    //求三个分开的数的和
    public int Summation(int[] Array){
        int Sum;
        Sum = Array[0]*Array[0]*Array[0];
        Sum += Array[1]*Array[1]*Array[1];
        Sum += Array[2]*Array[2]*Array[2];
        return Sum;
    }
    public static void main(String[] args) {
        //System.out.println("Hello, World.");
        Project_Practice002 Test = new Project_Practice002();
        //判断是否符合条件
        for(int Number=100;Number<=999;Number++){
            Test.Spit(Number, Test.Array);
            if(Number==Test.Summation(Test.Array)){
                System.out.println(Number);
            }
        }
        //int Number = 143;
        
        //Number = 1;
        //System.out.println(Test.Summation(Test.Array));
        /**
         * 最后修改时间：2019年6月19日
         * 题目：三位水仙花数
         * 小结：好像Java和C一样对于数组可以直接传递到方法里去，而且是直接可修改-
         * 在上面的代码中，对于方法参数有两个：数字，数组。数字作为参数只是一个初始值，原值并不改变-
         * 而数组在方法中被修改，原值也被修改。
         */
    }
}