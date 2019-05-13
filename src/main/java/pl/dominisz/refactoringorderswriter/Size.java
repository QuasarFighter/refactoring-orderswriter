package pl.dominisz.refactoringorderswriter;

import java.util.Arrays;

public enum Size {
    NOT_APPLICABLE(-1, "Not applicable"),
    INVALID(0, "Invalid size"),
    XS(1, "XS"),
    S(2, "S"),
    M(3, "M"),
    L(4, "L"),
    XL(5, "XL"),
    XXL(6, "XXL")
    ;

    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    Size(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getNameForValue(int value){
        return getSizeForValue(value).name;
    }

    public static Size getSizeForValue(int value){
        return Arrays.stream(Size.values()).filter(x -> x.value == value).findFirst().orElse(INVALID);
    }
}
