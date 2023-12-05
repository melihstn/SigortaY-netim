import java.time.LocalDate;

public class ResidenceInsurance extends Insurance {


    public ResidenceInsurance(int insurancePrice) {
        super(insurancePrice);
    }

    @Override
    public double calculate() {
        return(this.getInsurancePrice()*0.07);
    }
}
