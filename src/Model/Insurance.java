package Model;

import java.io.Serializable;

public class Insurance implements Serializable {
    private String nameInsurance;
    private String insuranceType;

    public Insurance() {
    }

    public Insurance(String nameInsurance, String insuranceType) {
        this.nameInsurance = nameInsurance;
        this.insuranceType = insuranceType;
    }

    public String getNameInsurance() {
        return nameInsurance;
    }

    public void setNameInsurance(String nameInsurance) {
        this.nameInsurance = nameInsurance;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "nameInsurance='" + nameInsurance + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }
}
