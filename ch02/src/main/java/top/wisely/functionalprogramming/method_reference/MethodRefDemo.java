package top.wisely.functionalprogramming.method_reference;


import top.wisely.functionalprogramming.Gender;
import top.wisely.functionalprogramming.Person;
import top.wisely.functionalprogramming.custom_function.TriFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MethodRefDemo {

    public static void main(String[] args) {

        constructorRef();
        staticMethodRef();
        instanceMethodRef();
        instanceMethodOfArbitraryObjectOfType();
    }

    /**
     * 构造器方法引用
     */
    public static void constructorRef() {
        //无参数构造：构造器不接收参数，返回值为新建的Person对象，符合Supplier函数接口的定义。
        // 使用基于Lambda表达式的Supplier函数接口的实现与“方法引用”是等同的。
        Supplier<Person> emptyConstructor = Person::new;
        //和上一句的代码是等价的
        Supplier<Person> emptyConstructorLambda = () -> new Person();
        Person person1 = emptyConstructor.get();
        Person person1Lambda = emptyConstructorLambda.get();
        //一个参数构造：构造器接收一个参数，返回值为新建的Person对象，符合Function接口的定义。
        // 同样，使用基于Lambda表达式的Function接口实现与方法引用是等同的。
        Function<String, Person> nameConstructor = Person::new;
        Function<String, Person> nameConstructorLambda = name -> new Person(name);
        Person person2 = nameConstructor.apply("wyf");
        Person person2Lambda = nameConstructorLambda.apply("wyf");
        //两个参数构造：构造器接收两个参数，返回值为新建的Person对象，符合BiFunction接口的定义。
        // 同样，使用基于Lambda表达式的BiFunction接口实现与方法引用是等同的。
        BiFunction<String, Gender, Person> nameAndGenderConstructor = Person::new;
        BiFunction<String, Gender, Person> nameAndGenderConstructorLambda = (name, gender) -> new Person(name, gender);
        Person person3 = nameAndGenderConstructor.apply("www", Gender.FEMALE);
        Person person3Lambda = nameAndGenderConstructorLambda.apply("www", Gender.FEMALE);
        //三个参数构造：构造器接收三个参数，返回值为新建的Person对象，符合我们自定义的TriFunction接口的定义。
        // 同样，使用基于Lambda表达式的TriFunction接口实现与方法引用是等同的。
        TriFunction<String, Gender, Integer, Person> allConstructor = Person::new;
        TriFunction<String, Gender, Integer, Person> allConstructorLambda = (name, gender, weight) -> new Person(name, gender, weight);
        Person person4 = allConstructor.apply("www", Gender.FEMALE, 110);
        Person person4Lambda = allConstructorLambda.apply("www", Gender.FEMALE, 110);
    }

    /**
     * 静态方法引用是使用方法引用的方式调用类的静态方法，格式为“类名::静态方法”。
     */
    public static void staticMethodRef() {
        IntFunction<String> intToStringFunction = Integer::toString;
        IntFunction<String> intToStringFunLambda = i -> Integer.toString(i);
        System.out.println(intToStringFunction.apply(123));
        System.out.println(intToStringFunLambda.apply(123));
    }

    /**
     * 实例方法引用是使用方法引用的方式来调用实例对象的方法，格式为“实例对象名::实例方法”。
     */
    public static void instanceMethodRef() {
        Person person = new Person("www", Gender.FEMALE, 80);
        Consumer<String> walkConsumer = person::walk;
        walkConsumer.accept("黄山");
    }

    /**
     * 引用特定类的任意对象的方法的格式为“类型名::实例方法”。
     */
    public static void instanceMethodOfArbitraryObjectOfType() {
        List<Person> people = Arrays.asList(new Person("wyf", Gender.MALE, 100),
                new Person("www", Gender.FEMALE, 80),
                new Person("foo", Gender.FEMALE, 90));
        people.forEach(Person::sayName);
        people.forEach(person -> person.sayName());
    }
}