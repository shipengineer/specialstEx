package specialstEx.workPets;

import java.util.Date;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Camell extends Animal {
    public Camell(String name, Date birthDate, List<String> commands) {
        super(name, typeEnum.CAMELL, kindEnum.WORK, birthDate, commands);
    }
}
