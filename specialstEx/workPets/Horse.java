package specialstEx.workPets;

import java.util.Date;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Horse extends Animal {
    public Horse(String name, Date birthDate, List<String> commands) {
        super(name, typeEnum.HORSE, kindEnum.WORK, birthDate, commands);
    }
}
