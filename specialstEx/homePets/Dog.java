package specialstEx.homePets;

import java.text.SimpleDateFormat;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Dog extends Animal {
    public Dog(String name, SimpleDateFormat birthDate, List<String> newCommands) {
        super(name, typeEnum.DOG, kindEnum.HOME, birthDate, newCommands);
    }
}
