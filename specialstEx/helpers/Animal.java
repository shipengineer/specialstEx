package specialstEx.helpers;

import java.util.List;
import java.text.SimpleDateFormat;

public abstract class Animal {
    private String name;
    private typeEnum type;
    private kindEnum kind;
    protected SimpleDateFormat birthDate;
    private List<String> commands;

    public Animal(String name, specialstEx.helpers.typeEnum type, specialstEx.helpers.kindEnum kind,
            SimpleDateFormat birthDate,
            List<String> commands) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.birthDate = birthDate;
        this.commands = commands;

    }

    public String getCommands() {
        return String.join(", ", commands);
    }

    public void addCommand(String newCommand) {
        this.commands.add(newCommand);
        System.out.println("Команда " + newCommand + " добавлена");
    }

    public String getKind() {
        return this.kind.toString();
    }

    public String getType() {
        return this.type.toString();
    }

    public String getName() {
        return this.name;
    }

    public SimpleDateFormat getBirthDate() {
        return this.birthDate;
    }

    public void switchKind() {
        if (this.kind == kindEnum.HOME) {
            this.kind = kindEnum.WORK;
            System.out.println("Класс изменен на рабочее животное");
        } else {
            this.kind = kindEnum.HOME;
            System.out.println("Класс изменен на домашнее животное");
        }

    }

    public void print() {
        System.out.println("" + this.name + this.kind + this.type + this.birthDate + this.getCommands());
    }

    public String writeElement() {
        return ("" + this.name + this.kind + this.type + this.birthDate + this.getCommands());
    }
}
