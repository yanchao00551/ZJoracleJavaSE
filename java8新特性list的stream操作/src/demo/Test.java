package demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @PackageName:demo
 * @ClassName:Test
 * @Description:
 * @author: 悟空
 * @date: 2021/3/21 16:03
 * @email: 10947@163.com
 */
public class Test {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"zhang3",18));
        users.add(new User(2L,"li4",29));
        users.add(new User(3L,"wang5",36));
        users.add(new User(4L,"zhang6",32));
        //stream流操作 将流中的一个值转换成一个新的值
        List<Long> ids = users.stream().map(User::getId).collect(Collectors.toList());
        List<Integer> ages = users.stream().map(User::getAge).collect(Collectors.toList());
        //求出所有人年龄总和
        int count = ages.stream().reduce(0,(acc,item) -> acc + item).intValue();
        //求最大值和最小值
        Comparator<Integer> comparator = (o1,o2) -> o1.compareTo(o2);
        System.out.println("最大年龄：" + ages.stream().max(comparator).get());
        System.out.println("最小年龄：" + ages.stream().min(comparator).get());
        //筛选出年龄大于30
        List<User> l1 = users.stream().filter((value) -> value.getAge() > 30).collect(Collectors.toList());
        l1.forEach((value) -> System.out.println(value));
        //将list转成map
        Map<Long,User> map = users.stream().collect(Collectors.toMap(User::getId, a -> a,(k1, k2) -> k1));


        Set<Map.Entry<Long, User>> set = map.entrySet();
        Iterator<Map.Entry<Long,User>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry<Long,User> entry = itr.next();
            System.out.println("键：" + entry.getKey());
            System.out.println("值：" + entry.getValue());;
        }

        for(Long id:ids){
            System.out.println(id);
        }

        for(User list:users){
            System.out.println(list);
        }

        System.out.println("年龄总和：" + count);

    }
}
