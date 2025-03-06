package ru.project.iakkov;
import com.google.common.base.Joiner;

public class HelloOtus {
    public static void main(String[] args) {
        String result = Joiner.on(", ").skipNulls().join("Привет", null, "Otus", "Java");
        System.out.println(result);
    }
}
