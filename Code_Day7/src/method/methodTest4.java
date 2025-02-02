package method;

public class methodTest4 {
    public static void main(String[] args) {
        //定义一个方法copyOfRange(int[]arr,int from,int to)
        //将arr数组中从from索引开始，到to结束的数据复制到新的数组中，返回新数组并且遍历
        //定义需要被拷贝的数组
        int[]arr={1,2,3,4,5,6,7,8,9,0};
        //调用方法
        int []copyArr=copyOfRange(arr,3,7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    public static int[] copyOfRange (int[]arr,int from,int to){
        //定义一个新的数组
        int []newArr=new int[to-from];//动态定义数组
        //定义新数组的索引,从零开始
        int index=0;
        //开始拷贝
        for (int i = from; i < to; i++) {
            //from开始,to结束
            newArr[index]=arr[i];
            //执行一次，索引加一
            index++;
        }
        return newArr;

    }

}
