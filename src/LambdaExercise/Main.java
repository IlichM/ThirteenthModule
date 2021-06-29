package LambdaExercise;

public class Main {
    public static void main(String[] args) {
        int value = 70;
        validate(value, (int value1) -> value >= 75);
    }

    private static void validate(int value, Validator validator) {
        System.out.println("Проверяем переданное значение согласно валидатору......");
        boolean isValid = validator.validate(value);
        if(isValid) {
            System.out.println("Отлично, значение верно!");
        } else {
            System.out.println("Упс! Значение неверно.");
        }
    }
}
