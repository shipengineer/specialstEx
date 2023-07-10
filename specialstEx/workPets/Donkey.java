package specialstEx.workPets;

import java.util.Date;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Donkey extends Animal {
    public Donkey(String name, Date birthDate, List<String> commands) {
        super(name, typeEnum.DONKEY, kindEnum.WORK, birthDate, commands);
    }
}
