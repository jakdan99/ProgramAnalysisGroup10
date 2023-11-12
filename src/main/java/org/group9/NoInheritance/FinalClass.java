package org.group9.NoInheritance;

public class FinalClass {
    public int baz() {
        return 10;
    }

    public String foo() {
        return "foo";
    }

    public String foobaz() {
        return foo()+baz();
    }
}
