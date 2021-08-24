import java.util.*;

public class Demo {
    public static void main(String[] args) {
         aaa();
//         bbb(3);
//        ccc();
    }

    //1-100,找出能被3整除，被5整除，同时被3和5整除的数，剔除这3组数中重复的数据
    public static void aaa(){
        ArrayList  list15 = new ArrayList();
        ArrayList  list5 = new ArrayList();
        ArrayList  list3= new ArrayList();
        for(int i=1;i<=100;i++){
            if(i%15==0){
                list15.add(i);
            }else if(i%5==0&&i%3!=0){
                list5.add(i);
            }else if(i%3==0&&i%5!=0){
                list3.add(i);
            }
        }
        for (int i=0;i<list15.size();i++){
            System.out.println("被15整除"+list15.get(i));
        }
        for (int i=0;i<list5.size();i++){
            System.out.println("被5整除"+list5.get(i));
        }
        for (int i=0;i<list3.size();i++){
            System.out.println("被3整除"+list3.get(i));
        }
    }

    //给定数据"aa","bb","cc","dd","44","aa","44","bb"，找出重复次数最高的前N组数据，如前3组最高："aa","bb","44"
    public static void bbb(int x ){
        String[] a = new String[]{"aa","bb","cc","dd","44","aa","44","bb"};
        HashMap<String, Integer> map = new HashMap();
        for (int i=0;i<a.length;i++){
            if (!map.containsKey(a[i])){
                map.put(a[i],1);
            }else{
                map.put(a[i],map.get(a[i])+1);
            }
        }
        System.out.println(map);
        ArrayList list = new ArrayList();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
    }

    //冒泡排序
    public static void ccc(){
        int a[] = {9,8,5,4,1,4};
        int i,j,x ;
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int m = a[j];
                    a[j] = a[j+1];
                    a[j+1] = m;
                    for(x=0;x<a.length;x++) {
                        System.out.print(a[x]);
                    }
                    System.out.println("\n");
                }
            }
        }
//        for(x=0;x<a.length;x++) {
//            System.out.println(a[x]);
//        }
    }
}
