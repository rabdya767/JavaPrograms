import java.lang.annotation.*;

/**
 * @Retention(RetentionPolicy.SOURCE) 
 * 
 * @Documented 
 * 
 * @Repeatable(MyAnno.class)
 *
 */
@Target(value = { ElementType.LOCAL_VARIABLE, ElementType.METHOD })

@interface MyAnno {
    String name();

    String project();

    String date() default "today";

    float Version() default 12f;
}

class annot2 {

    int data;

    @MyAnno(name = "RABDYA", project = "HTMS")
    public static void main(String[] args) {
        @MyAnno(name = "RABDYA", project = "HTMS")
        int x = 10;
        System.out.println(x);
    }
}