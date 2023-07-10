package specialstEx.homePets;

import java.util.Date;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Cat extends Animal {
    public Cat(String name, Date birthDate, List<String> commands) {
        super(name, typeEnum.CAT, kindEnum.HOME, birthDate, commands);
    }
}
