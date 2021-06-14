package demo;

import lombok.*;

/**
 * @PackageName:demo
 * @ClassName:User
 * @Description:
 * @author: 悟空
 * @date: 2021/3/21 16:05
 * @email: 10947@163.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class User {
    private Long id;
    private String name;
    private Integer age;
}
