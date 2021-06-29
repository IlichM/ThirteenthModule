package LambdaExercise;

public class Validatorimpl implements Validator {

    @Override
    public boolean validate(int value) {
        return value >= 60;
    }
}
