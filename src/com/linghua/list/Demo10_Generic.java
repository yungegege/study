package com.linghua.list;

/**
 * 泛型类
 * @param <Q>
 */
public class Demo10_Generic<Q>{
    private Q q;

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    /**
     * 泛型方法，可以用类的泛型也可以自己有泛型
     */
    public<T> void play(T t){
        System.out.println(t+"在玩jj");
    }

    /**
     * 静态泛型方法，必须有自己的泛型
     */
    public static<W> void study(W w){
        System.out.println(w);
    }

    @Override
    public String toString() {
        return "Demo10_Generic{" +
                "q=" + q +
                '}';
    }
}
