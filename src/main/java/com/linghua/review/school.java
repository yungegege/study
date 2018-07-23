package review;

import java.util.HashSet;
import java.util.Random;

public class school {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        school school = (school) o;

        return name != null ? name.equals(school.name) : school.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public static void main(String[] args){
        school s1 = new school();
        school s2 = new school();
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());

        HashSet<school> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set);


    }
}
