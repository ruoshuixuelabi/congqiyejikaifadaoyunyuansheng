package top.wisely.functionalprogramming.optional;
import java.util.Optional;
/**
 * Optional的案例演示
 * @author mzk
 */
public class CreateOptionalDemo {
    public static void main(String[] args) {
        //Optional.emtpty()：获得空的Optional
        Optional<String> emptyOptional = Optional.empty();
        //Optional.of(参数)：包含非null值的Optional。
        String str = "wyf";
        Optional<String> nonNullOptional = Optional.of(str);
        //Optional.ofNullable(参数)：包含null值的Optional。
        // 若参数不为null，则返回包含参数的Optional；若参数为null，则返回空的Optional。
        String str1 = "wyf";
        String str2 = null;
        Optional<String> nullableOptional1 = Optional.ofNullable(str1);
        Optional<String> nullableOptional2 = Optional.ofNullable(str2);
        System.out.println(emptyOptional.equals(nullableOptional2));
    }
}