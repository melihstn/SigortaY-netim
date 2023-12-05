import java.time.LocalDate;

public class HealthInsurance extends Insurance {


    public HealthInsurance(int insurancePrice) {
        super(insurancePrice);
    }

    @Override
    public double calculate() {
        return(this.getInsurancePrice()*0.05);
    }
}
