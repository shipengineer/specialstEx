package specialstEx.homePets;

import java.util.Date;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Dog extends Animal {
    public Dog(String name, Date birthDate, List<String> commands) {
        super(name, typeEnum.DOG, kindEnum.HOME, birthDate, commands);
    }
}
