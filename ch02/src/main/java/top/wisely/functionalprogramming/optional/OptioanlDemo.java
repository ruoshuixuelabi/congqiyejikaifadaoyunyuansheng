package top.wisely.functionalprogramming.optional;

import java.util.Optional;


public class OptioanlDemo {
    public static void main(String[] args) {
//        checkPresenceDemo();
//        conditionalDemo();
//        orElseDemo();
//        getDemo();
//        filterDemo();
        mapDemo();
    }

    /**
     * 检查值是否存在或为空：存在检查使用isPresent；为空检查使用isEmpty。
     */
    private static void checkPresenceDemo() {
        String str1 = "wyf";
        String str2 = null;
        Optional<String> nullableOptional1 = Optional.ofNullable(str1);
        Optional<String> nullableOptional2 = Optional.ofNullable(str2);
        System.out.println(nullableOptional1.isPresent());
        System.out.println(nullableOptional2.isEmpty());
    }

    /**
     * 条件运算：ifPresent，在满足数据存在的条件下，可执行自己处理语句。
     */
    private static void conditionalDemo() {
        Optional<String> nullableOptional1 = Optional.ofNullable("wyf");
        Optional<String> nullableOptional2 = Optional.ofNullable(null);
        nullableOptional1.ifPresent(System.out::println);
        nullableOptional2.ifPresent(System.out::println);

    }

    /**
     * 默认值：设置当Optional为空时的默认值；
     * orElseGet的参数是一个Supplier函数接口，它不指定默认值，而是使用函数接口实现算提供的值。
     */
    private static void orElseDemo() {
        Optional<String> nullableOptional1 = Optional.ofNullable("wyf");
        Optional<String> nullableOptional2 = Optional.ofNullable(null);
        //nullableOptional1不为空，所以name1依然是wyf，不需要使用orElse设置的默认值www。
        String name1 = nullableOptional1.orElse("www");
        //nullableOptional2为空，所以name2使用的是orElse设置的默认值www。
        String name2 = nullableOptional2.orElse("www");
        //nullableOptional1不为空，所以name3依然是wyf，不需要使用orElseGet中Lambda表达值返回的wwwFromOrElseGet。
        String name3 = nullableOptional1.orElseGet(() -> "wwwFromOrElseGet");
        //nullableOptional2为空，所以 name2使用的是 orElseGet中Lambda表达值返回的wwwFromOrElseGet。
        String name4 = nullableOptional2.orElseGet(() -> "wwwFromOrElseGet");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }

    /**
     * 获得值：只有当Optional不为null时get方法才能获得包含的数据。
     */
    private static void getDemo() {
        Optional<String> nameOptional = Optional.of("wyf");
        //获得Optional中包含的name字符串
        String name = nameOptional.get();
        System.out.println(name);
    }

    /**
     * 数据过滤：可以使用filter方法对数据进行过滤。
     */
    private static void filterDemo() {
        Optional<String> nameOptional = Optional.of("wyf");
        //通过filter方法看Optional中包含的数据是否符合name  -> name.equals("wyf")这个Predicate的实现，当前是符合的，所以运算的isWyf为true。
        boolean isWyf = nameOptional.filter(name -> name.equals("wyf")).isPresent();
        System.out.println(isWyf);
    }

    /**
     * 转换处理：可以通过map和flatMap方法对数据进行转换处理。
     */
    private static void mapDemo() {
        Optional<String> nameOptional = Optional.of("wyf");
        //将Optional中包含的数据wyf处理成为"Hello"+name，并获得这个值。
        String hello = nameOptional.map(name -> "Hello " + name).get();
        System.out.println(hello);
    }
}