package specialstEx.homePets;

import java.text.SimpleDateFormat;
import java.util.List;

import specialstEx.helpers.Animal;
import specialstEx.helpers.kindEnum;
import specialstEx.helpers.typeEnum;

public class Hamster extends Animal {
    public Hamster(String name, SimpleDateFormat birthDate, List<String> commands) {
        super(name, typeEnum.HAMSTER, kindEnum.HOME, birthDate, commands);
    }
}
