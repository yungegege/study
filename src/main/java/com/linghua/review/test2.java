package review;

public class test2 implements Comparable<test2>{

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        test2 test2 = (test2) o;

        return name != null ? name.equals(test2.name) : test2.name == null;
    }


    /**
     * 缓冲池中，包含以下这些：
     boolean values true and false
     all byte values
     short values between -128 and 127
     int values between -128 and 127
     char in the range \u0000 to \u007F
     * @param args
     */
    public static void main(String[] args){

        Integer i = new Integer(2);
        Integer j = new Integer(2);
        System.out.println(i==2);
        System.out.println(i.equals(2));
        System.out.println(i==j);
        System.out.println(i.equals(j));

        System.out.println("-----------------------------------------");
        //valueOf() 方法的实现比较简单，就是先判断值是否在缓存池中，如果在的话就直接使用缓存池的内容。
        //Integer 缓存池的大小默认为 -128~127。
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);   // true
        Integer z1 = Integer.valueOf(1234);
        Integer k1 = Integer.valueOf(1234);
        System.out.println(z1 == k1);   // false

        int m = Integer.valueOf(1234);
        int n = Integer.valueOf(1234);
        System.out.println(m == n);   // true
        System.out.println("-----------------------------------------");

        String a = new String("lalala");
        String b = new String("lalala");
        System.out.println(a=="lalala");
        System.out.println(a.equals("lalala"));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



    }

    @Override
    public int compareTo(test2 o) {
        return 0;
    }
}
