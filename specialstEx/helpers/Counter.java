package specialstEx.helpers;

public class Counter {
    Integer value;

    public Counter() {
        this.value = 0;
    }

    public void add() {
        this.value = this.value + 1;
    }

    public int getCount() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
