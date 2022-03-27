package CarRental;

public abstract class AFuelCar extends ACar
{
    private final int kmPrLiter;

    public AFuelCar(String regNr, String make, String model, int doors, int kmPrLiter)
    {
        super(regNr, make, model, doors);
        this.kmPrLiter = kmPrLiter;
    }

    abstract String getFuelType(); // returns “Gasoline” or “Diesel”
    public int getKmPrLiter() { return this.kmPrLiter; }


    @Override
    public int getRegistrationFee()
    {
        return 0;
    }
}
