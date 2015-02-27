package main.java;

/**
 * Created with IntelliJ IDEA.
 * User: vjovanovic
 * Date: 5/13/13
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Implicits {
    Boolean boxed = true;
    boolean unboxed = boxed;
    boolean unboxed1 = boxed.booleanValue();

    unboxed == unboxed1
}
