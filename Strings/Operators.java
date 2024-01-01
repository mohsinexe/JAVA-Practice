import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println(new Integer(56) + "" + new ArrayList<>());

        String ans = (new Integer(56) + "" + new ArrayList<>());
        System.out.println(ans);

        // System.out.println(new Integer() + new ArrayList<>());                                      Error

        // It throws an error because There is a rule for + operator in java. It says that there should be at least one object of Type String.
        // 2nd rule is + operator is defined to primitives.

        // operators is giving us more functionalities and hence it is called as operators ovrloading. (+ operator concatenate more than 1 String)

        // In java operator overloading is not supported for some software engineering consideration.
        // In C++ operator overloading is supported, So in C++ you can modify what the plus operator is doing in C++. You can also do it in Python.
        // But this result in poor code. Thats why java dont support it. exception are Strings.

        
    }
}
