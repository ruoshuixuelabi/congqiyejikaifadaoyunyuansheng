package top.wisely.functionalprogramming.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;

import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreamDemo {
    public static void main(String[] args) throws IOException {
        //从普通值获取：Stream.of。
        Stream<String> singleStringStream = Stream.of("wyf");
        Stream<String> stringStream = Stream.of("www", "wyf", "foo", "bar");
        //空Stream：Stream.empty。
        Stream<String> emptyStringStream = Stream.empty();
        //从空值中获取：Stream.ofNullable。
        String str1 = "wyf";
        String str2 = null;
        //等同于Stream.of
        Stream<String> str1Stream = Stream.ofNullable(str1);
        //等同于Stream.empty
        Stream<String> str2Stream = Stream.ofNullable(str2);
        //从数组中获取：Arrays.stream。
        Integer[] numArray = {1, 2, 3, 4, 5};
        Stream<Integer> numStream = Arrays.stream(numArray);
        //来自文件：Files类的静态方法。
        String filePathStr = "/Users/wangyunfei/Documents/MyBook/book/Souce_Code/functional-programming/src/main/java/top/wisely/functionalprogramming/stream/test.txt";
        Path path = Paths.get(filePathStr);
        //返回一个字符串行的Stream
        Stream<String> lineStream = Files.lines(path);
        //来自集合类：Collection、List和Set。
        Collection<String> collection = Arrays.asList("www", "wyf", "foo", "bar");
        Stream<String> collectionStream = collection.stream();
        //使用建造者模式（builder pattern）构建：Stream.builder。
        Stream<String> streamBuilder = Stream.<String>builder().add("www").add("wyf").add("foo").add("bar").build();
        //Stream.generate接收一个Supplier函数接口作为参数，且产生的Stream是无限的，使用时请限制数量。
        Stream<String> generatedStream = Stream.generate(() -> "wyf").limit(10);
        //Stream.iterate接收的第一个参数是起始值，第二个参数是UnaryOperator，产生的Stream是无限的，需要限制数量。
        Stream<Integer> iteratedStream = Stream.iterate(20, n -> n + 1).limit(5);//20,21,22,23,24
        //原始数据类型的Stream（只包含某类原始数据类型的Stream）：IntStream、LongStream和DoubleStream的静态方法。
        IntStream intStream = IntStream.range(1, 5); //开始包含，结束不包含
        LongStream longStreamClosed = LongStream.rangeClosed(1, 5);//开始包含，结束包含
        DoubleStream doubleStream = new Random().doubles(3);
        //来自字符串。
        IntStream intStream1 = "wyf".chars();
        //来自Optional
        Optional<String> nameOptional = Optional.of("wyf");
        Stream<String> stringOptionalStream = nameOptional.stream();
    }
}