// 50��JAVA���������ϰ��
// ������1��
// ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� 
// ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21.... 
// public class Prog1{
// 	public static void main(String[] args){
// 		int n = 10;
// 		System.out.println("��"+n+"������������Ϊ"+fun(n));
// 	}
// 	private static int fun(int n){
// 		if(n==1 || n==2)
// 		   return 1;
// 		else
// 		   return fun(n-1)+fun(n-2);
// 	}
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������2��
// ��Ŀ���ж�101-200֮���ж��ٸ����������������������
// ����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮��������
// public class Prog2{
// 	public static void main(String[] args){
// 		int m = 1;
// 		int n = 1000;
// 		int count = 0;
// 		//ͳ����������
// 		for(int i=m;i<n;i++){
// 			if(isPrime(i)){
// 				count++;
// 				System.out.print(i+" ");
// 				if(count%10==0){
// 					System.out.println();
// 				}
// 			}
// 		}
// 		System.out.println();
// 		System.out.println("��"+m+"��"+n+"֮�乲��"+count+"������");
// 	}
// 	//�ж�����
// 	private static boolean isPrime(int n){
// 		boolean flag = true;
// 		if(n==1)
// 		  flag = false;
// 		else{
// 			for(int i=2;i<=Math.sqrt(n);i++){
// 			if((n%i)==0 || n==1){
// 				flag = false;
// 				break;
// 			}
// 			 else
// 			   flag = true;
// 		  }
// 		}
// 		return flag;
// 	}
// }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������3��
// ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
// �������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
// public class Prog3{
// 	public static void main(String[] args){
// 		for(int i=100;i<1000;i++){
// 			if(isLotus(i))
// 			   System.out.print(i+" ");
// 		}
// 		System.out.println();
// 	}
// 	//�ж�ˮ�ɻ���
// 	private static boolean isLotus(int lotus){
// 		int m = 0;
// 		int n = lotus;
// 		int sum = 0;
// 		m = n/100;
// 		n  -= m*100;
// 		sum = m*m*m;
// 		m = n/10;
// 		n -= m*10;
// 		sum += m*m*m + n*n*n;
// 		if(sum==lotus)
// 			return true;
// 		else
// 			return false;
// 		}
// }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������4��
// ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
// �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
// (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
// (2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ����
// (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
// public class Prog4{
// 	public static void main(String[] args){
// 		int n = 13;
// 		decompose(n);
// 	}
// 	private static void decompose(int n){
// 		System.out.print(n+"=");
// 		for(int i=2;i<n+1;i++){
// 			while(n%i==0 && n!=i){
// 				n/=i;
// 				System.out.print(i+"*");
// 			}
// 			if(n==i){
// 				System.out.println(i);
// 				break;
// 			}
// 		}
// 	}
// }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������5��
// ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
// ���������(a>b)?a:b��������������Ļ������ӡ� 
// public class Prog5{
// 	public static void main(String[] args){
// 		int n = -1;
// 		try{
// 			n = Integer.parseInt(args[0]);
// 		}catch(ArrayIndexOutOfBoundsException e){
// 			System.out.println("������ɼ�");
// 			return;
// 		}
// 		grade(n);
// 	}
// 	//�ɼ��ȼ�����
// 	private static void grade(int n){
// 		if(n>100 || n<0)
// 		  System.out.println("������Ч");
// 		else{
// 		  String str = (n>=90)?"�֣�����A��":((n>60)?"�֣�����B��":"�֣�����C��");
// 		  System.out.println(n+str);
// 		}
// 	}
// }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������6��
// ��Ŀ����������������m��n���������Լ������С��������
// �������������շ������
// public class Prog6{
// 	public static void main(String[] args){
// 		int m,n;
// 		try{
// 			m = Integer.parseInt(args[0]);
// 			n = Integer.parseInt(args[1]);
// 		}catch(ArrayIndexOutOfBoundsException e){
// 			System.out.println("��������");
// 			return;
// 		}
// 		max_min(m,n);
// 	}
// 	//�����Լ������С������
// 	private static void max_min(int m, int n){
// 		int temp = 1;
// 		int yshu = 1;
// 		int bshu = m*n;
// 		if(n<m){
// 			temp = n;
// 			n = m;
// 			m = temp;
// 		}
// 		while(m!=0){
// 			temp = n%m;
// 			n = m;
// 			m = temp;
// 		}
// 		yshu = n;
// 		bshu /= n;
// 		System.out.println(m+"��"+n+"�����Լ��Ϊ"+yshu);
// 		System.out.println(m+"��"+n+"����С������Ϊ"+bshu);
// 	}
// }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������7��
// ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
// �������������while���,����Ϊ������ַ���Ϊ'\n'.
// import java.util.Scanner;
// public class Prog7_1{
// 	public static void main(String[] args){
// 		System.out.print("������һ���ַ���");
// 		Scanner scan = new Scanner(System.in);
// 		String str = scan.nextLine();//��һ���ַ�ת��Ϊ�ַ���
// 		scan.close();
// 		count(str);
// 	}
// 	//ͳ��������ַ���
// 	private static void count(String str){
// 		String E1 = "[\u4e00-\u9fa5]";//����
// 		String E2 = "[a-zA-Z]";
// 		String E3 = "[0-9]";
// 		String E4 = "\\s";//�ո�
// 		int countChinese = 0;
// 		int countLetter = 0;
// 		int countNumber = 0;
// 		int countSpace = 0;
// 		int countOther = 0;
// 		char[] array_Char = str.toCharArray();//���ַ���ת��Ϊ�ַ�����
// 		String[] array_String = new String[array_Char.length];//����ֻ����Ϊ�ַ�������
// 		for(int i=0;i<array_Char.length;i++)
// 		  array_String[i] = String.valueOf(array_Char[i]);
// 		//�����ַ��������е�Ԫ��
// 		for(String s:array_String){
// 			if(s.matches(E1))
// 			  countChinese++;
// 			else if(s.matches(E2))
// 			  countLetter++;
// 			else if(s.matches(E3))
// 			  countNumber++;
// 			else if(s.matches(E4))
// 			  countSpace++;
// 			else
// 			  countOther++;
// 		}
// 		System.out.println("����ĺ��ָ�����"+countChinese);
// 		System.out.println("�������ĸ������"+countLetter);
// 		System.out.println("��������ָ�����"+countNumber);
// 		System.out.println("����Ŀո������"+countSpace);
// 		System.out.println("����������ַ�������"+countSpace);
// 	}
// }
// import java.util.*;
// public class Prog7_2{
// 	public static void main(String[] args){
// 	  System.out.println("������һ���ַ���");
// 	  Scanner scan = new Scanner(System.in);
// 	  String str = scan.nextLine();
// 	  scan.close();
// 	  count(str);
// 	}
// 	//ͳ��������ַ�
// 	private static void count(String str){
// 		List<String> list = new ArrayList<String>();
// 		char[] array_Char = str.toCharArray();
// 		for(char c:array_Char)
// 		  list.add(String.valueOf(c));//���ַ���Ϊ�ַ�����ӵ�list����
// 		Collections.sort(list);//����
// 		for(String s:list){
// 			int begin = list.indexOf(s);
// 			int end = list.lastIndexOf(s);
// 			//��������ͳ���ַ���
// 			if(list.get(end)==s)
// 			  System.out.println("�ַ���"+s+"����"+(end-begin+1)+"��");
// 		}
// 	}
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ������8��
// ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ� 
// ����������ؼ��Ǽ����ÿһ���ֵ��
// import java.util.Scanner;

// public class Prog8{
// 	public static void main(String[] args){
// 		System.out.print("��s=a+aa+aaa+aaaa+...��ֵ��������a��ֵ��");
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\s*");//�Կո���Ϊ�ָ���
// 		int a = scan.nextInt();
// 		int n = scan.nextInt();
// 		scan.close();//�ر�ɨ����
// 		System.out.println(expressed(2,5)+add(2,5));
// 	} 
// 	//��ͱ��ʽ
// 	private static String expressed(int a,int n){
// 		StringBuffer sb = new StringBuffer();
// 		StringBuffer subSB = new StringBuffer();
// 		for(int i=1;i<n+1;i++){
// 		  subSB = subSB.append(a);
// 		  sb = sb.append(subSB);
// 		  if(i<n)
// 		    sb = sb.append("+");
// 		}
// 		sb.append("=");
// 		return sb.toString();
// 	}
// 	//���
// 	private static long add(int a,int n){
// 		long sum = 0;
// 		long subSUM = 0;
// 		for(int i=1;i<n+1;i++){
// 			subSUM = subSUM*10+a;
// 			sum = sum+subSUM;
// 		}
// 		return sum;
// 	}
// }
// ������9��
// ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.����ҳ�1000���ڵ�����������
// public class Prog9{
// 	public static void main(String[] args){
// 		int n = 10000;
// 		compNumber(n);
// 	}
// 	//������
// 	private static void compNumber(int n){
// 		int count = 0;
// 		System.out.println(n+"���ڵ�������");
// 		for(int i=1;i<n+1;i++){
// 			int sum = 0;
// 			for(int j=1;j<i/2+1;j++){
// 				if((i%j)==0){
// 					sum += j;
// 					if(sum==i){
// 				  System.out.print(i+" ");
// 				  if((count++)%5==0)
// 				    System.out.println();
// 			    }
// 				}
// 			}
// 		}
// 	}
// }
// ������10��
// ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
// import java.util.Scanner;
// public class Prog10{
// 	public static void main(String[] args){
// 		System.out.print("������С�����ʱ�ĸ߶Ⱥ����Ĵ�����");
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
// 		int h = scan.nextInt();
// 		int n = scan.nextInt();
// 		scan.close();
// 		distance(h,n);
// 	}
// 	//С���h�߶����£���n�η����󾭹��ľ���ͷ����ĸ߶�
// 	private static void distance(int h,int n){
// 		double length = 0;
// 		for(int i=0;i<n;i++){
// 			length += h;
// 			h /=2.0 ;
// 		}
// 		System.out.println("������"+n+"�η�����С�򹲾���"+length+"�ף�"+"��"+n+"�η����߶�Ϊ"+h+"��");
// 	}
// }
// ������11��
// ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
// ��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ �����������������С�
// public class Prog11{
// 	public static void main(String[] args){
// 		int count = 0;
// 		int n = 0;
// 		for(int i=1;i<5;i++){
// 			for(int j=1;j<5;j++){
// 				if(j==i)
// 				  continue;
// 				for(int k=1;k<5;k++){
// 					if(k!=i && k!=j){
// 						n = i*100+j*10+k;
// 					  System.out.print(n+" ");
// 					  if((++count)%5==0)
// 					  System.out.println();
// 					}
// 				}
// 			}
// 		}
// 		System.out.println();
// 		System.out.println("����������������"+count+"��");
// 	}
// }
// ������12��
// ��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž��������� 
// ����������������������ֽ磬��λ��ע�ⶨ��ʱ��ѽ�����ɳ����͡�
// import java.io.*;
// public class Prog12{
// 	public static void main(String[] args){
// 		System.out.print("�����뵱ǰ����");
// 		long profit = Long.parseLong(key_Input());
// 		System.out.println("Ӧ������"+bonus(profit));
// 	}
// 	//���ܴӼ������������
// 	private static String key_Input(){
// 		String str = null;
// 		BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
// 		try{
// 			str = bufIn.readLine();
// 		}catch(IOException e){
// 			e.printStackTrace();
// 		}finally{
// 			try{
// 				bufIn.close();
// 			}catch(IOException e){
// 				e.printStackTrace();
// 			}
// 		}
// 		return str;
// 	}
// 	//���㽱��
// 	private static long bonus(long profit){
// 		long prize = 0;
// 		long profit_sub = profit;
// 		if(profit>1000000){
// 			profit = profit_sub-1000000;
// 			profit_sub = 1000000;
// 			prize += profit*0.01;
// 		}
// 		if(profit>600000){
// 			profit = profit_sub-600000;
// 			profit_sub = 600000;
// 			prize += profit*0.015; 
// 		}
// 		if(profit>400000){
// 			profit = profit_sub-400000;
// 			profit_sub = 400000;
// 			prize += profit*0.03;
// 		}
// 		if(profit>200000){
// 			profit = profit_sub-200000;
// 			profit_sub = 200000;
// 			prize += prize*0.05;
// 		}
// 		if(profit>100000){
// 			profit = profit_sub-100000;
// 			profit_sub = 100000;
// 			prize += profit*0.075;
// 		}
// 		prize += profit_sub*0.1;
// 		return prize;
// 	}
// }

// ������13��
// ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
// �����������10�������жϣ��Ƚ���������100���ٿ������ٽ���������268���ٿ��������������Ľ�������������������ǽ����
// public class Prog13{
// 	public static void main(String[] args){
// 		int n=0;
// 		for(int i=0;i<100001;i++){
// 			if(isCompSqrt(i+100) && isCompSqrt(i+268)){
// 				n = i;
// 				break;
// 			}
// 		}
// 		System.out.println("��������ǣ�"+n);
// 	}
// 	//�ж���ȫƽ����
// 	private static boolean isCompSqrt(int n){
// 		boolean isComp = false;
// 		for(int i=1;i<Math.sqrt(n)+1;i++){
// 			if(n==Math.pow(i,2)){
// 				isComp = true;
// 				break;
// 			}
// 		}
// 		return isComp;
// 	}
// }
// ������14��
// ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
// �����������3��5��Ϊ����Ӧ���Ȱ�ǰ�����µļ�������Ȼ���ټ���5�켴����ĵڼ��죬��������������������·ݴ���3ʱ�迼�Ƕ��һ�졣
// import java.util.Scanner;
// public class Prog14{
// 	public static void main(String[] args){
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\D");//ƥ�������
// 		System.out.print("�����뵱ǰ���ڣ���-��-�գ�:");
// 		int year = scan.nextInt();
// 		int month = scan.nextInt();
// 		int date = scan.nextInt();
// 		scan.close();
// 		System.out.println("������"+year+"��ĵ�"+analysis(year,month,date)+"��");
// 	}
// 	//�ж�����
// 	private static int analysis(int year, int month, int date){
// 		int n = 0;
// 		int[] month_date = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
// 		if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
// 		  month_date[2] = 29;
// 		for(int i=0;i<month;i++)
// 		  n += month_date[i];
// 		return n+date;
// 	}
// }
// ������15��
// ��Ŀ��������������x,y,z���������������С���������
// ���������������취����С�����ŵ�x�ϣ��Ƚ�x��y���бȽϣ����x>y��x��y��ֵ���н�����Ȼ������x��z���бȽϣ����x>z��x��z��ֵ���н�����������ʹx��С��
// import java.util.Scanner;
// public class Prog15{
// 	public static void main(String[] args){
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\D");
// 		System.out.print("��������������");
// 		int x = scan.nextInt();
// 		int y = scan.nextInt();
// 		int z = scan.nextInt();
// 		scan.close();
// 		System.out.println("��������"+sort(x,y,z));
// 	}
// 	//�Ƚ��������Ĵ�С
// 	private static String sort(int x,int y,int z){
// 		String s = null;
// 		if(x>y){
// 			int t = x;
// 			x = y;
// 			y = t;
// 		}
// 		if(x>z){
// 			int t = x;
// 			x = z;
// 			z = t;
// 		}
// 		if(y>z){
// 			int t = z;
// 			z = y;
// 			y = t;
// 		}
// 		s = x+" "+y+" "+z;
// 		return s;
// 	}
// }
// ������16��
// ��Ŀ�����9*9�ھ���
// ����������������п��ǣ���9��9�У�i�����У�j�����С�
// public class Prog16{
// 	public static void main(String[] args){
// 		for(int i=1;i<10;i++){
// 			for(int j=1;j<i+1;j++)
// 				System.out.print(j+"*"+i+"="+(j*i)+" ");
// 			System.out.println();
// 		}
// 	}
// }
// ������17��
// ��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
// �����������ȡ����˼ά�ķ������Ӻ���ǰ�ƶϡ�
// public class Prog17{
// 	public static void main(String[] args){
// 		int m = 1;
// 	  for(int i=10;i>0;i--)
// 	    m = 2*m + 2;
// 	  System.out.println("С���ӹ�ժ��"+m+"����");
// 	}
// }
// ������18��
// ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
// import java.util.ArrayList;
// public class Prog18{
// 	String a,b,c;//�׶ӳ�Ա
// 	public static void main(String[] args){
// 		String[] racer = {"x","y","z"};//�Ҷӳ�Ա
// 		ArrayList<Prog18> arrayList = new ArrayList<Prog18>();
// 		for(int i=0;i<3;i++)
// 		  for(int j=0;j<3;j++)
// 		    for(int k=0;k<3;k++){
// 		    	Prog18 prog18 = new Prog18(racer[i],racer[j],racer[k]);
// 		    	if(!prog18.a.equals(prog18.b) && !prog18.a.equals(prog18.c) && !prog18.b.equals(prog18.c) &&
// 		    	   !prog18.a.equals("x") && !prog18.c.equals("x") && !prog18.c.equals("z"))
// 		    	   arrayList.add(prog18);
// 		    }
// 		  for(Object obj:arrayList)
// 		    System.out.println(obj);
// 	}
// 	//���췽��
// 	private Prog18(String a,String b,String c){
// 		this.a = a;
// 		this.b = b ;
// 		this.c = c;
// 	}
// 	public String toString(){
// 		return "a�Ķ�����"+a+"  "+"b�Ķ�����"+b+"  "+"c�Ķ�����"+c;
// 	}
// }
// ������19��
// ��Ŀ����ӡ������ͼ�������Σ�
//     *
//    *** 
//  ****** 
// ******** 
//  ****** 
//   *** 
//    * 
// ����������Ȱ�ͼ�ηֳ���������������ǰ����һ�����ɣ�������һ�����ɣ�����˫�� forѭ������һ������У��ڶ�������С�
// public class Prog19{
// 	public static void main(String[] args){
// 		int n = 5;
// 		printStar(n);
// 	}
// 	//��ӡ����
// 	private static void printStar(int n){
// 		//��ӡ�ϰ벿��
// 		for(int i=0;i<n;i++){
// 			for(int j=0;j<2*n;j++){
// 		  	if(j<n-i)
// 		  	  System.out.print(" ");
// 		  	if(j>=n-i && j<=n+i)
// 		  	  System.out.print("*");
// 		  }
// 		  System.out.println();
// 		}
// 		//��ӡ�°벿��
// 		for(int i=1;i<n;i++){
// 			System.out.print(" ");
// 			for(int j=0;j<2*n-i;j++){
// 				if(j<i)
// 		  	  System.out.print(" ");
// 		  	if(j>=i && j<2*n-i-1)
// 		  	  System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 	}
// }
// ������20��
// ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
// �����������ץס�������ĸ�ı仯���ɡ�
// public class Prog20{
// 	public static void main(String[] args){
// 		double n1 = 1;
// 		double n2 = 1;
// 		double fraction = n1/n2;
// 		double Sn = 0;
// 		for(int i=0;i<20;i++){
// 		  double t1 = n1;
// 		  double t2 = n2;
// 		  n1 = t1+t2;
// 		  n2 = t1;
// 		  fraction = n1/n2;
// 		  Sn += fraction; 
// 		}
// 		System.out.print(Sn);
// 	}
// }
// ������21��
// ��Ŀ����1+2!+3!+...+20!�ĺ� 
// ����������˳���ֻ�ǰ��ۼӱ�����۳ˡ�
// public class Prog21{
// 	public static void main(String[] args){
// 		long sum = 0;
// 		for(int i=0;i<20;i++)
// 		  sum += factorial(i+1);
// 		System.out.println(sum);
// 	}
// 	//�׳�
// 	private static long factorial(int n){
// 		int mult = 1;
// 		for(int i=1;i<n+1;i++)
// 		  mult *= i;
// 		return mult;
// 	}
// }
// ������22��
// ��Ŀ�����õݹ鷽����5!��
// ����������ݹ鹫ʽ��fn=fn_1*4!
// public class Prog22{
// 	public static void main(String[] args){
// 		System.out.println(fact(10));
// 	}
// 	//�ݹ���׳�
// 	private static long fact(int n){
// 		if(n==1)
// 		  return 1;
// 		else
// 		  return fact(n-1)*n;
// 	}
// }
// ������23��
// ��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ�ʵ������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶�� 
// ������������õݹ�ķ������ݹ��Ϊ���ƺ͵��������׶Ρ�Ҫ��֪�����������������֪�������˵��������������ƣ��Ƶ���һ�ˣ�10�꣩���������ơ�
// public class Prog23{
// 	public static void main(String[] args){
// 		System.out.println(getAge(5,2));
// 	}
// 	//���mλͬ־������
// 	private static int getAge(int m,int n){
// 		if(m==1)
// 		  return 10;
// 		else
// 		  return getAge(m-1,n)+n;		
// 	}
// }
// ������24��
// ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
// public class Prog24{
// 	public static void main(String[] args){
// 		int n = Integer.parseInt(args[0]); 
// 		int i = 0;
// 		int[] a = new int[5];
// 		do{
// 			a[i] = n%10;
// 		  n /= 10;
// 		  ++i;
// 		}while(n!=0);
// 		System.out.print("����һ��"+i+"λ�����Ӹ�λ�𣬸�λ��������Ϊ��");
// 		for(int j=0;j<i;j++)
// 		  System.out.print(a[j]+" ");
// 	}
// }
// ������25��
// ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
// import java.io.*;
// public class Prog25{
// 	public static void main(String[] args){
// 		int n = 0;
// 		System.out.print("������һ��5λ����");
// 		BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
// 		try{
// 		  n = Integer.parseInt(bufin.readLine());
// 		}catch(IOException e){
// 			e.printStackTrace();
// 		}finally{
// 			try{
// 			  bufin.close();
// 			}catch(IOException e){
// 				e.printStackTrace();
// 			}
// 		}
// 		palin(n);
// 	}
// 	private static void palin(int n){
// 		int m = n;
// 		int[] a = new int[5];
// 		if(n<10000 || n>99999){
// 			System.out.println("����Ĳ���5λ����");
// 			return;
// 		}else{
// 		  for(int i=0;i<5;i++){
// 			  a[i] = n%10;
// 			  n /= 10;
// 		  }
// 		  if(a[0]==a[4] && a[1]==a[3])
// 		    System.out.println(m+"��һ��������");
// 		  else
// 		    System.out.println(m+"���ǻ�����");
// 	    }
//    }
// }
// ������26��
// ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ��������� �жϵڶ�����ĸ��
// �����������������ȽϺã������һ����ĸһ�������ж����������if����жϵڶ�����ĸ��
// import java.io.*;
// public class Prog26{
// 	public static void main(String[] args){
// 		String str = new String();
// 	  BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
// 	  System.out.print("���������ڵ�Ӣ�ĵ���ǰ�����ĸ���ĸ����");
// 	  try{
// 		  str = bufIn.readLine();
// 	  }catch(IOException e){
// 		  e.printStackTrace();
// 	  }finally{
// 		  try{
// 			  bufIn.close();
// 		  }catch(IOException e){
// 			  e.printStackTrace();
// 		  }
// 	  }
// 	  week(str);
// 	}
// 	private static void week(String str){
// 		int n = -1;
// 		if(str.trim().equalsIgnoreCase("Mo") || str.trim().equalsIgnoreCase("Mon") || str.trim().equalsIgnoreCase("Mond"))
// 		  n = 1;
// 		if(str.trim().equalsIgnoreCase("Tu") || str.trim().equalsIgnoreCase("Tue") || str.trim().equalsIgnoreCase("Tues"))
// 		  n = 2; 
// 		if(str.trim().equalsIgnoreCase("We") || str.trim().equalsIgnoreCase("Wed") || str.trim().equalsIgnoreCase("Wedn"))
// 		  n = 3;
// 		if(str.trim().equalsIgnoreCase("Th") || str.trim().equalsIgnoreCase("Thu") || str.trim().equalsIgnoreCase("Thur"))
// 		  n = 4; 
// 		if(str.trim().equalsIgnoreCase("Fr") || str.trim().equalsIgnoreCase("Fri") || str.trim().equalsIgnoreCase("Frid"))
// 		  n = 5;
// 		if(str.trim().equalsIgnoreCase("Sa") || str.trim().equalsIgnoreCase("Sat") || str.trim().equalsIgnoreCase("Satu"))
// 		  n = 2; 
// 		if(str.trim().equalsIgnoreCase("Su") || str.trim().equalsIgnoreCase("Sun") || str.trim().equalsIgnoreCase("Sund"))
// 		  n = 0; 
// 		switch(n){
// 			case 1:
// 			  System.out.println("����һ");
// 			  break;
// 			case 2:
// 			  System.out.println("���ڶ�");
// 			  break;
// 			case 3:
// 			  System.out.println("������");
// 			  break;
// 			case 4:
// 			  System.out.println("������");
// 			  break;
// 			case 5:
// 			  System.out.println("������");
// 			  break;
// 			case 6:
// 			  System.out.println("������");
// 			  break;
// 			case 0:
// 			  System.out.println("������");
// 			  break;
// 			default:
// 			  System.out.println("��������");
// 			  break;
// 		}
// 	}
// }
// ������27��
// ��Ŀ����100֮�ڵ�����
// public class Prog27{
// 	public static void main(String[] args){
// 		int n = 100;
// 		System.out.print(n+"���ڵ�������");
// 		for(int i=2;i<n+1;i++){
// 			if(isPrime(i))
// 			  System.out.print(i+" ");
// 		}
// 	}
// 	//������
// 	private static boolean isPrime(int n){
// 		boolean flag = true;
// 		for(int i=2;i<Math.sqrt(n)+1;i++)
// 			if(n%i==0){
// 			  flag = false;
// 			  break;
// 			}
// 		return flag;
// 	}
// }
// ������28��
// ��Ŀ����10������������
// �����������������ѡ�񷨣����Ӻ�9���ȽϹ����У�ѡ��һ����С�����һ��Ԫ�ؽ����� �´����ƣ����õڶ���Ԫ�����8�����бȽϣ������н�����
// public class Prog28{
// 	public static void main(String[] args){
// 		int[] a = new int[]{31,42,21,50,12,60,81,74,101,93};
// 		for(int i=0;i<10;i++)
// 			for(int j=0;j<a.length-i-1;j++)
// 				if(a[j]>a[j+1]){
// 					int temp = a[j];
// 					a[j] = a[j+1];
// 					a[j+1] = temp;
// 				}
// 		for(int i=0;i<a.length;i++)
// 		  System.out.print(a[i]+" ");
// 	}
// }
// ������29��
// ��Ŀ����һ��3*3����Խ���Ԫ��֮��
// �������������˫��forѭ�����������ά���飬�ٽ�a[i][i]�ۼӺ������
// public class Prog29{
// 	public static void main(String[] args){
// 		int[][] a = new int[][] {{100,2,3,},{4,5,6},{17,8,9}};
// 		matrSum(a);
// 	}
// 	private static void matrSum(int[][] a){
// 		int sum1 = 0;
// 		int sum2 = 0;
// 		for(int i=0;i<a.length;i++)
// 		  for(int j=0;j<a[i].length;j++){
// 		  	if(i==j) sum1 += a[i][j];
// 		  	if(j==a.length-i-1) sum2 += a[i][j];
// 		  }
// 		System.out.println("����Խ���֮�ͷֱ��ǣ�"+sum1+"��"+sum2);
// 	}
// }
// ������30��
// ��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
// ��������������жϴ����Ƿ�������һ������Ȼ���ٿ��ǲ����м�����������������Ԫ��֮����������κ���һ��λ�á�
// import java.util.Scanner;
// public class Prog30{
// 	public static void main(String[] args){
// 		int[] A = new int[]{0,8,7,5,9,1,2,4,3,12};
// 		int[] B = sort(A);
// 		print(B);
// 		System.out.println();
//         System.out.print("������10���������飺");
// 		Scanner scan = new Scanner(System.in);		
// int a = scan.nextInt();
// scan.close();
// 		int[] C = insert(a,B);
// 		print(C);
// 	}
// 	//ѡ������
// 	private static int[] sort(int[] A){
// 		int[] B = new int[A.length];
// 		for(int i=0;i<A.length-1;i++){
// 			int min = A[i];
// 			for(int j=i+1;j<A.length;j++){
// 				if(min>A[j]){
// 					int temp = min;
// 					min = A[j];
// 					A[j] = temp;
// 				}
// 				B[i] = min;
// 			}
// 		}
// 		B[A.length-1] = A[A.length-1];
// 		return B;
// 	}
// 	//��ӡ
// 	private static void print(int[] A){
// 		for(int i=0;i<A.length;i++)
// 		  System.out.print(A[i]+" ");
// 	}
// 	//��������
// 	private static int[] insert(int a,int[] A){
// 		int[] B = new int[A.length+1];
// 		for(int i=A.length-1;i>0;i--)
// 		  if(a>A[i]){
// 		  	B[i+1] = a;
// 		    for(int j=0;j<=i;j++)
// 		      B[j] = A[j];
// 		      for(int k=i+2;k<B.length;k++)
// 		        B[k] = A[k-1];
// 		      break;
// 		  }
// 		return B;
// 	}
// }
// ������31��
// ��Ŀ����һ���������������
// ����������õ�һ�������һ��������
// public class Prog31{
// 	public static void main(String[] args){
// 		int[] A = new int[]{1,2,3,4,5,6,7,8,9,};
// 		print(A);
// 		System.out.println();
// 		int[] B = reverse(A);
// 		print(B);
// 	}
// 	private static int[] reverse(int[] A){
// 		for(int i=0;i<A.length/2;i++){
// 			int temp = A[A.length-i-1];
// 			A[A.length-i-1] = A[i];
// 			A[i] = temp;
// 		}
// 		return A;
// 	}
// 	private static void print(int[] A){
// 		for(int i=0;i<A.length;i++)
// 		  System.out.print(A[i]+" ");
// 	}
// }
// ������32��
// ��Ŀ��ȡһ������a���Ҷ˿�ʼ��4��7λ��
// ��������������������ǣ�
// (1)��ʹa����4λ��
// (2)����һ����4λȫΪ1,����ȫΪ0����������~(~0<<4)
// (3)��������߽���&���㡣
// import java.util.Scanner;
// public class Prog32{
// 	public static void main(String[] msg){
// 		//����һ��������
// 		Scanner scan = new Scanner(System.in);
// 		long l = scan.nextLong();
// 		scan.close();
// 		//���½�ȡ�ַ�
// 		String str = Long.toString(l);
// 		char[] ch = str.toCharArray();
// 		int n = ch.length;
// 		if(n<7)
// 		  System.out.println("�������С��7λ��");
// 		else
// 		  System.out.println("��ȡ��4~7λ���֣�"+ch[n-7]+ch[n-6]+ch[n-5]+ch[n-4]);
// 		}	  
// }
// ������33��
// ��Ŀ����ӡ����������Σ�Ҫ���ӡ��10������ͼ��
// ���������
//         1 
//        1 1 
//      1 2 1 
// 1 3 3 1 
//  1 4 6 4 1 
// 1 5 10 10 5 1 
// public class Prog33{
// 	public static void main(String[] args){
// 		int[][] n = new int[10][21];
// 		n[0][10] = 1;
// 		for(int i=1;i<10;i++)
// 		  for(int j=10-i;j<10+i+1;j++)
// 		    n[i][j] = n[i-1][j-1]+n[i-1][j+1];
// 		for(int i=0;i<10;i++){
// 			for(int j=0;j<21;j++){
// 				if(n[i][j]==0)
// 				  System.out.print("   ");
// 				else{
// 			    if(n[i][j]<10)
// 			      System.out.print("  "+n[i][j]);//�ո�Ϊ��������Ҫ
// 			    else if(n[i][j]<100)
// 			      System.out.print(" "+n[i][j]);
// 			      else
// 			        System.out.print(n[i][j]);
// 			  }
// 			}
// 			System.out.println();
// 		}
// 	}
// }
// ������34��
// ��Ŀ������3����a,b,c������С˳�������
// �������������ָ�뷽����
// import java.util.Scanner;
// public class Prog34{
// 	public static void main(String[] args){
// 		System.out.print("������3������");
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
// 		int a = scan.nextInt();
// 		int b = scan.nextInt();
// 		int c = scan.nextInt();
// 		scan.close();
// 		if(a<b){
// 			int t = a;
// 			a = b;
// 			b = t;
// 		}
// 		if(a<c){
// 			int t = a;
// 			a = c;
// 			c = t;
// 		}
// 		if(b<c){
// 			int t = b;
// 			b = c;
// 			c = t;
// 		}
// 		System.out.println(a+" "+b+" "+c);
// 	}
// }
// ������35��
// ��Ŀ���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
// import java.util.Scanner;
// public class Prog35{
// 	public static void main(String[] args){
// 		System.out.print("������һ������");
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
// 		int[] a = new int[50];
// 		int m = 0;
// 		while(scan.hasNextInt()){
// 			a[m++] = scan.nextInt();
// 		}
// 		scan.close();
// int[] b = new int[m];
// 		for(int i=0;i<m;i++)
// 		  b[i] = a[i];
// 		for(int i=0;i<b.length;i++)
// 			for(int j=0;j<b.length-i-1;j++)
// 				if(b[j]<b[j+1]){
// 					int temp = b[j];
// 					b[j] = b[j+1];
// 					b[j+1] = temp;
// 				}
// 		for(int i=0;i<b.length;i++)
// 		  System.out.print(b[i]+" ");

// 	}
// }
// ������36��
// ��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����
// import java.util.Scanner;
// public class Prog36{
// 	public static void main(String[] args){
// 		final int N = 10;
// 		System.out.print("������10���������飺");
// 		Scanner scan = new Scanner(System.in);
// 		int[] a = new int[N];
// 		for(int i=0;i<a.length;i++)
// 		  a[i] = scan.nextInt();
// 		System.out.print("������һ��С��10������");
// 		int m = scan.nextInt();
// 		scan.close();
// 		int[] b = new int[m];
// 		int[] c = new int[N-m];
// 		for(int i=0;i<m;i++)
// 		  b[i] = a[i];
// 		for(int i=m,j=0;i<N;i++,j++)
// 		  c[j] = a[i];
// 		for(int i=0;i<N-m;i++)
// 		  a[i] = c[i];
// 		for(int i=N-m,j=0;i<N;i++,j++)
// 		  a[i] = b[j];
// 		for(int i=0;i<a.length;i++)
// 		  System.out.print(a[i]+" ");
// 	}
// }
// ������37��
// ��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
// import java.util.Scanner;
// public class Prog37{
// 	public static void main(String[] args){
// 		System.out.print("������һ��������");
// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();
// 		scan.close();
// 		//�������������ʶĳ���Ƿ���Ȧ��
// 		boolean[] isIn = new boolean[n];
// 		for(int i=0;i<isIn.length;i++)
// 		  isIn[i] = true;
// 		//����Ȧ������������������
// 		int inCount = n;
// 		int countNum = 0;
// 		int index = 0;
// 		while(inCount>1){
// 			if(isIn[index]){
// 				countNum++;
// 				if(countNum==3){
// 					countNum = 0;
// 					isIn[index] = false;
// 					inCount--;
// 				}
// 			}
// 			index++;
// 			if(index==n)
// 			  index = 0;
// 		}
// 		for(int i=0;i<n;i++)
// 		  if(isIn[i])
// 		    System.out.println("���µ��ǣ�"+(i+1));
// 	}
// }
// ������38��
// ��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�
// import java.util.Scanner;
// public class Prog38{
// 	public static void main(String[] args){
// 		System.out.print("������һ���ַ���");
// 		Scanner scan = new Scanner(System.in).useDelimiter("\\n");
// 		String strIn = scan.next();
// 		scan.close();
// 		char[] ch = strIn.toCharArray();
// 		System.out.println(strIn+"��"+(ch.length-1)+"���ַ�");
// 	}
// }
// ������39��
// ��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú���1/1+1/3+...+1/n(����ָ�뺯��) 
// import java.util.Scanner;
// public class Prog39{
// 	public static void main(String[] args){
// 		System.out.print("������һ��������");
// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();
// 		scan.close();
// 		if(n%2==0)
// 		  System.out.println("�����"+even(n));
// 		else
// 		  System.out.println("�����"+odd(n));
// 	}
// 	//����
// 	static double odd(int n){
// 		double sum = 0;
// 		for(int i=1;i<n+1;i+=2){
// 			sum += 1.0/i;
// 		}
// 		return sum;
// 	}
// 	//ż��
// 	static double even(int n){
// 		double sum = 0;
// 		for(int i=2;i<n+1;i+=2){
// 			sum += 1.0/i;
// 		}
// 		return sum;
// 	}
// }
// ������40��
// ��Ŀ���ַ�������
// public class Prog40{
// 	public static void main(String[] args){
// 		String[] str = {"abc","cad","m","fa","f"};
// 		for(int i=str.length-1;i>=1;i--){
// 			for(int j=0;j<=i-1;j++){
// 				if(str[j].compareTo(str[j+1])<0){
// 					String temp = str[j];
// 					str[j] = str[j+1];
// 					str[j+1] = temp;
// 				}
// 			}
// 		}
// 		for(String subStr:str)
// 		  System.out.print(subStr+" ");
// 	}
// }
// ������41��
// ��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
// public class Prog41{
// 	public static void main(String[] args){
// 		int n;
// 		n = fun(0);
// 		System.out.println("ԭ����"+n+"������");
// 	}
// 	private static int fun(int i){
// 		if(i==5)
// 		  return 1;
// 		else
// 		  return fun(i+1)*5+1;
// 	}
// }
// ������42��
// ��Ŀ��809*??=800*??+9*??+1 
// ����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ����
// public class Prog42{
// 	public static void main(String[] args){
// 		int n = 0;
// 		boolean flag = false;
// 		for(int i=10;i<100;i++)
// 		  if(809*i==800*i+9*i+1){
// 		  	flag = true;
// 		  	n = i;
// 		  	break;
// 		  }
// 		if(flag)
// 		  System.out.println(n);
// 		else
// 		  System.out.println("�޷���Ҫ�������");
// 	}
// }
// ������43��
// ��Ŀ����0��7������ɵ�����������
// public class Prog43{
// 	public static void main(String[] args){
// 		int count = 0;
// 		//������������ɵ���
// 		int n = 8;
// 		//һλ��
// 		count = n/2;
// 		//��λ��
// 		count += (n-1)*n/2;
// 		//��λ��
// 		count += (n-1)*n*n/2;
// 		//��λ��
// 		count += (n-1)*n*n*n/2;
// 		//��λ��
// 		count += (n-1)*n*n*n*n/2;
// 		//��λ��
// 		count += (n-1)*n*n*n*n*n/2;
// 		//��λ��
// 		count += (n-1)*n*n*n*n*n*n/2;
// 		System.out.println("0-7������ɵ�����������"+count);
// 	}
// }
// ������44��
// ��Ŀ��һ��ż�����ܱ�ʾΪ��������֮�͡�
// import java.util.Scanner;
// public class Prog44{
// 	public static void main(String[] args){
// 		System.out.print("������һ��ż����");
// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();
// 		scan.close();
// 		if(n%2!=0){
// 		  System.out.println("������Ĳ���ż����");
// 		  return;
// 		}
// 		twoAdd(n);
// 	}
// 	//ż���ֽ�Ϊ����֮��
// 	private static void twoAdd(int n){
// 		for(int i=2;i<n/2+1;i++){
// 			if(isPrime(i)&&isPrime(n-i)){
// 				System.out.println(n+"="+(i)+"+"+(n-i));
// 				break;
// 			}
// 		}
// 	}
// 	//�ж�����
// 	private static boolean isPrime(int m){
// 		boolean flag = true;
// 		for(int i=2;i<Math.sqrt(m)+1;i++){
// 			if(m%i==0){
// 				flag = false;
// 				break;
// 			}
// 		}
// 		return flag;
// 	}
// }
// ������45��
// ��Ŀ���ж�һ�������ܱ�����9���� 
// import java.util.Scanner;
// public class Prog45{
// 	public static void main(String[] args){
// 		System.out.print("������һ������");
// 	  Scanner scan = new Scanner(System.in);
// 	  long l = scan.nextLong();
// 	  long n = l;
// 	  scan.close();
// 	  int count = 0;
// 	  while(n>8){
// 		  n /= 9;
// 		  count++;
// 	  }
// 	  System.out.println(l+"�ܱ�"+count+"��9������");
// 	}
// }
// ������46�� 
// ��Ŀ�������ַ������ӳ���
// public class Prog46{
// 	public static void main(String[] args){
// 		String str1 = "lao lee";
// 	  String str2 = "ţ��";
// 	  String str = str1+str2;
// 	  System.out.println(str);
// 	}
// }
// ������47��
// ��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
// import java.util.Scanner;
// public class Prog47{
// 	public static void main(String[] args){
// 		System.out.print("������7������(1-50)��");
// 		Scanner scan = new Scanner(System.in);
// 		int n1 = scan.nextInt();
// 		int n2 = scan.nextInt();
// 		int n3 = scan.nextInt();
// 		int n4 = scan.nextInt();
// 		int n5 = scan.nextInt();
// 		int n6 = scan.nextInt();
// 		int n7 = scan.nextInt();
// 		scan.close();
// 		printStar(n1);
// 		printStar(n2);
// 		printStar(n3);
// 		printStar(n4);
// 		printStar(n5);
// 		printStar(n6);
// 		printStar(n7);
// 	}
// 	static void printStar(int m){
// 		System.out.println(m);
// 		for(int i=0;i<m;i++)
// 		  System.out.print("*");
// 		System.out.println();
// 	}
// }
// ������48��
// ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
// public class Prog48{
// 	public static void main(String[] args){
// 		int n = 1234;
// 		int[] a = new int[4];
// 		for(int i=3;i>=0;i--){
// 		  a[i] = n%10;
// 		  n /= 10;
// 		}
// 		for(int i=0;i<4;i++)
// 		  System.out.print(a[i]);
// 		System.out.println();
// 		for(int i=0;i<a.length;i++){
// 		  a[i] += 5;
// 		  a[i] %= 10;
// 		}
// 		int temp1 = a[0];
// 		a[0] = a[3];
// 		a[3] = temp1;
// 		int temp2 = a[1];
// 		a[1] = a[2];
// 		a[2] = temp2;
// 		for(int i=0;i<a.length;i++)
// 		  System.out.print(a[i]);
// 	}
// }
// ������49��
// ��Ŀ�������ַ������Ӵ����ֵĴ��� 
// public class Prog49{
// 	public static void main(String[] args){
// 		String str = "I come from County DingYuan Province AnHui.";
// 		char[] ch = str.toCharArray();
// 		int count = 0;
// 		for(int i=0;i<ch.length;i++){
// 			if(ch[i]==' ')
// 			  count++;
// 		}
// 		count++;
// 		System.out.println("����"+count+"���ִ�");
// 	}
// }
// ������50��
// ��Ŀ�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����ѧ���ţ����������ſγɼ����������ƽ���ɼ�����ԭ�е����ݺͼ������ƽ����������ڴ����ļ�"stud"�С�
// import java.io.*;
// public class Prog50{
// 	//����ѧ��ģ��
// 	String[] number = new String[5];
// 	String[] name = new String[5];
// 	float[][] grade = new float[5][3];
// 	float[] sum = new float[5];
// 	public static void main(String[] args) throws Exception{
// 		Prog50 stud = new Prog50();
// 		stud.input();
// 		stud.output();
// 	}
// 	//����ѧ�š��������ɼ�
// 	void input() throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		//¼��״̬��ʶ
// 		boolean isRecord = true;
// 		while(isRecord){
// 			try{
// 			  for(int i=0;i<5;i++){
// 				  System.out.print("������ѧ�ţ�");
// 				  number[i] = br.readLine();
// 				  System.out.print("������������");
// 				  name[i] = br.readLine();
// 				  for(int j=0;j<3;j++){
// 					  System.out.print("�������"+(j+1)+"�ſγɼ���");
// 					  grade[i][j] = Integer.parseInt(br.readLine());
// 				  }
// 				  System.out.println();
// 				  sum[i] = grade[i][0]+grade[i][1]+grade[i][2];
// 			  }
// 			    isRecord = false;
// 		    }catch(NumberFormatException e){
// 			     System.out.println("������һ�����֣�");
// 		  }
// 		}
// 	}
// 	//����ļ�
// 	void output() throws IOException{
// 		FileWriter fw = new FileWriter("E://java50//stud.txt");
// 		BufferedWriter bw = new BufferedWriter(fw);	
// 		bw.write("No.  "+"Name  "+"grade1  "+"grade2  "+"grade3  "+"average");
// 		bw.newLine();
// 		for(int i=0;i<5;i++){
// 		  bw.write(number[i]);
// 		  bw.write("  "+name[i]);
// 		  for(int j=0;j<3;j++)
// 		    bw.write("  "+grade[i][j]);
// 		  bw.write("  "+(sum[i]/5)); 
// 		  bw.newLine();
// 		}
// 		bw.close();
// 	}
// }