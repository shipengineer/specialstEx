public abstract class Animal {
    public Animal(String name, String type, String kind, Date birthDate) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.birthDate = birthDate;

    }

    public getKind(){
        return this.kind;
    }

    public getType(){
        return this.type;
    }

    public getName(){
        return this.name;
    }

    public getBirthDate(){
        return this.birthDate;
    }

    public getAge(){
        return new Date().getFullYear() - this.birthDate.getFullYear();
    }

    public setKind(kind){
        this.kind = kind;
    }

    public setType(type){
        this.type = type;
    }

    public setName(name){
        this.name = name;
    }

}
