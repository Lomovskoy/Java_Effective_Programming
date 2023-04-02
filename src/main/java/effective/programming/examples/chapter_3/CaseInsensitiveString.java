package effective.programming.examples.chapter_3;

import java.util.Objects;

// Нарушение симметричности!
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // Нарушение симметричности!
    @Override
    public boolean equals(Object o) {

        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);

        if (o instanceof String) // Одностороннее взаимодействие!
            return s.equalsIgnoreCase((String) o);

        return false;

    }

    /* Чтобы устранить эту проблему,
        просто удалите неудачную попытку взаимодействия с классом String из метода equals.
        После этого можете рефакторизовать метод в один оператор return:
    */

//    @Override public boolean equals(Object o)
//    {
//        return o instanceof CaseInsensitiveString &&
//                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
//    }

}
