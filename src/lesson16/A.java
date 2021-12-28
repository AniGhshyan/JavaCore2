package lesson16;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface A {
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno{
        String str();
        int val();
    }
}
