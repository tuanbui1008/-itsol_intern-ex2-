package Model;

import java.io.Serializable;
import java.util.Objects;

public class OldCar extends Car implements Serializable {
    private int actionDuration;

    public OldCar() {
    }


    public int getActionDuration() {
        return actionDuration;
    }

    public void setActionDuration(int actionDuration) {
        this.actionDuration = actionDuration;
    }

    @Override
    public String toString() {
        return "OldCar{" +
                "actionDuration=" + actionDuration +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldCar oldCar = (OldCar) o;
        return actionDuration == oldCar.actionDuration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionDuration);
    }
}
