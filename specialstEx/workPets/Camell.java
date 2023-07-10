package specialstEx.workPets;

import java.text.SimpleDateFormat;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Camell extends Animal {
    public Camell(String name, SimpleDateFormat birthDate, List<String> commands) {
        super(name, typeEnum.CAMELL, kindEnum.WORK, birthDate, commands);
    }
}
