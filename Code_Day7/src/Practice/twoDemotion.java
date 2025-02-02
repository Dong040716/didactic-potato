package Practice;

public class twoDemotion {
    public static void main(String[] args) {
        //二维数组
        //第一季度 22 64 44
        //第二季度 77 33 88
        //第三季度 25 45 65
        //第三季度 11 66 99
        //求出每个季度的营业额和全年的总营业额
        int [][]arr={ //定义一个二维数组
                {22,64,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum=0;//定义每年的营业总额
        for (int i = 0; i < arr.length; i++) {
            int seasonSum=0;//定义每个季度的营业总额
            for (int j = 0; j < arr[i].length; j++) {
                seasonSum=seasonSum+arr[i][j]; //求得每个季度的营业额
            }
            System.out.println("第"+(i+1)+"个季度的营业总额是:"+seasonSum);
            yearSum=yearSum+seasonSum;
        }
        System.out.println("今年的年度营业额是"+yearSum);
    }
}
