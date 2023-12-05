import java.time.LocalDate;

public abstract class Insurance {

    String insuranceName;
    Double insurancePrice;
    LocalDate startDate;
    LocalDate finishDate;
    public abstract double calculate();

    public Insurance(int insurancePrice) {

        this.insurancePrice = (double) insurancePrice;
        this.startDate = LocalDate.now();
        this.finishDate = startDate.plusYears(1);
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }
}
