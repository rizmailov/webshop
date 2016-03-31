package ru.countrystuff.util;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.junit.Assert;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

/**
 * Created by RAMSES on 23.03.2016.
 */
public class TestsUtils {

    public static <T> void assertEquals(T o1, T o2) {
        Class<?> clazz = o1.getClass();
        if (List.class.isAssignableFrom(clazz)) {
            Assert.assertEquals(o1, o2);
            // check considering elements order
            List l1 = (List) o1;
            List l2 = (List) o2;
            assert l1.size() == l2.size() : "expected size " + l1.size() + ", actual " + l2.size();
            for (int i = 0; i < l1.size(); i++) {
                assertEquals(l1.get(i), l2.get(i));
            }
        } else if (Set.class.isAssignableFrom(clazz)) {
            Set s1 = (Set) o1;
            Set s2 = (Set) o2;
            assert s1.size() == s2.size();
            assert s1.containsAll(s2);
            for (final Object e1 : s1) {
                Object e2 = Iterables.find(s2, new Predicate() {
                    public boolean apply(Object e) {
                        return e.equals(e1);
                    }
                });
                assertEquals(e1, e2);
            }
        } else {
            Assert.assertEquals(o1, o2);
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    Object v1 = field.get(o1);
                    Object v2 = field.get(o2);
                    Assert.assertEquals(v1, v2);

                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
