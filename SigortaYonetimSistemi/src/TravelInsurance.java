import java.time.LocalDate;

public class TravelInsurance extends Insurance{


    public TravelInsurance(int insurancePrice) {
        super(insurancePrice);
    }

    @Override
    public double calculate() {
        return(this.getInsurancePrice()*0.03);
    }
}
