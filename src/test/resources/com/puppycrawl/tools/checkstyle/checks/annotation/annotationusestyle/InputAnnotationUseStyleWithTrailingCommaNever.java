package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;
//this file compiles in eclipse 3.4 but not with Sun's JDK 1.6.0.11

/* Config:
 * closingParens = ignore
 * elementStyle = ignore
 * trailingArrayComma = NEVER
 */
public class InputAnnotationUseStyleWithTrailingCommaNever
{
    @SuppressWarnings({"common",}) // violation
    public void foo() {


        @SuppressWarnings({"common","foo",}) // violation
        Object o = new Object() {

            @SuppressWarnings(value={"common",}) // violation
            public String toString() {

                @SuppressWarnings(value={"leo","herbie",}) // violation
                final String pooches = "leo.herbie";

                return pooches;
            }
        };
    }

    @Test4(value={"foo",}, more={"bar",}) // violation
    /**

    */
    enum P {

        @Pooches4(tokens={Pooches4.class,},other={1,}) // violation
        L,

        /**

        */
        Y;
    }

}

@interface Test4 {
    String[] value();
    String[] more() default {};
}

@interface Pooches4 {

    Class<?>[] tokens();
    int[] other();
}
