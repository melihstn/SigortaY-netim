import java.time.LocalDate;

public class CarInsurance extends Insurance {


    public CarInsurance(int insurancePrice) {
        super(insurancePrice);
    }

    @Override
    public double calculate() {
        return(this.getInsurancePrice()*0.03);
    }
}
