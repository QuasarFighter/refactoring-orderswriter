package pl.dominisz.refactoringorderswriter;

import java.util.Arrays;

public enum Color {
    NO_COLOR(0, "no_color"),
    BLUE(1, "blue"),
    RED(2, "red"),
    YELLOW(3, "yellow");

    private int value;
    private String name;

    Color(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static String getNameForValue(int value){
        return getColorForValue(value).name;
    }

    public static Color getColorForValue(int value){
        for(Color color : Color.values()){
            if(color.value == value){
                return color;
            }
        }
        return NO_COLOR;
    }
}
