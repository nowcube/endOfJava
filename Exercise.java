import java.util.*;
public class Exercise {
    public static void main(String[] args){
        System.out.println("====================");
        System.out.println("数学计算能力系统");
        System.out.println();
        System.out.println("学号：2020202020"+"\t"+"姓名：啊吧啊吧");
        System.out.println();
        System.out.println("1--加法"+"\t"+"2--减法"+"\t"+"3--乘法"+"\t"+"4--除法"+"\t"+"0--退出");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int id;
        id=sc.nextInt();
        switch (id) {
            case 0:
                System.exit(0);
            case 1:
                do {
                    Random random1 = new Random();
                    int r1_1 = random1.nextInt(50);
                    int r2_1 = random1.nextInt(50);
                    if(r1_1==0 || r2_1==0){
                        r1_1+=1;
                        r2_1+=1;
                    }
                    int answer1;
                    System.out.println("=================");
                    System.out.println(r1_1 + "+" + r2_1 + "=?");
                    System.out.print("请输入您的答案：");
                    do {
                        Scanner sc1 = new Scanner(System.in);
                        answer1 = sc1.nextInt();
                        if (answer1 == -1) {
                            System.exit(0);
                        }
                        if (r1_1 + r2_1 != answer1) {
                            System.out.println("错误！");
                            System.out.print("请重新输入：");
                        }
                    } while (r1_1 + r2_1 != answer1);
                    System.out.println("正确！");
                } while (true);

            case 2:
                do{
                    Random random2 = new Random();
                    int r1_2 = random2.nextInt(50);
                    int r2_2 = random2.nextInt(50);
                    if(r1_2==0 || r2_2==0){
                        r1_2+=1;
                        r2_2+=1;
                    }
                    if (r1_2 < r2_2) {
                        int r = r1_2;
                        r1_2 = r2_2;
                        r2_2 = r;
                    }
                    int answer2;
                    System.out.println("=================");
                    System.out.println(r1_2 + "-" + r2_2 + "=?");
                    System.out.print("请输入您的答案：");
                    do {
                        Scanner sc2 = new Scanner(System.in);
                        answer2 = sc2.nextInt();
                        if (answer2 == -1) {
                            System.exit(0);
                        }
                        if (r1_2 - r2_2 != answer2) {
                            System.out.println("错误！");
                            System.out.print("请重新输入：");
                        }
                    } while (r1_2 - r2_2 != answer2);
                    System.out.println("正确！");

                }while (true);

            case 3:
                do{
                    Random random3 = new Random();
                    int r1_3 = random3.nextInt(50);
                    int r2_3 = random3.nextInt(50);
                    if(r1_3==0 || r2_3==0){
                        r1_3+=1;
                        r2_3+=1;
                    }
                    int answer3;
                    System.out.println("=================");
                    System.out.println(r1_3 + "*" + r2_3 + "=?");
                    System.out.print("请输入您的答案：");
                    do {
                        Scanner sc3 = new Scanner(System.in);
                        answer3 = sc3.nextInt();
                        if (answer3 == -1) {
                            System.exit(0);
                        }
                        if (r1_3 * r2_3 != answer3) {
                            System.out.println("错误！");
                            System.out.print("请重新输入：");
                        }
                    } while (r1_3 * r2_3 != answer3);
                    System.out.println("正确！");
                }while(true);

            case 4:
                do{
                    Random random4 = new Random();
                    int r1_4;
                    int r2_4;
                    int r3;
                    do {
                        r1_4 = random4.nextInt(50);
                        r2_4 = random4.nextInt(50);
                        if(r1_4==0 || r2_4==0){
                            r1_4+=1;
                            r2_4+=1;
                        }
                        r3 = r1_4 * r2_4;
                    } while (r3 > 50);
                    int answer4;
                    System.out.println("=================");
                    System.out.println(r3 + "/" + r1_4 + "=?");
                    System.out.print("请输入您的答案：");
                    do {
                        Scanner sc4 = new Scanner(System.in);
                        answer4 = sc4.nextInt();
                        if (answer4 == -1) {
                            System.exit(0);
                        }
                        if (r3 / r1_4 != answer4) {
                            System.out.println("错误！");
                            System.out.print("请重新输入：");
                        }
                    } while (r3 / r1_4 != answer4);
                    System.out.println("正确！");
                }while (true);

        }
    }
}

