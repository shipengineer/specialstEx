package specialstEx.workPets;

import java.text.SimpleDateFormat;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Horse extends Animal {
    public Horse(String name, SimpleDateFormat birthDate, List<String> commands) {
        super(name, typeEnum.HORSE, kindEnum.WORK, birthDate, commands);
    }
}
