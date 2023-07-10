package specialstEx.workPets;

import java.text.SimpleDateFormat;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Donkey extends Animal {
    public Donkey(String name, SimpleDateFormat birthDate, List<String> commands) {
        super(name, typeEnum.DONKEY, kindEnum.WORK, birthDate, commands);
    }
}
