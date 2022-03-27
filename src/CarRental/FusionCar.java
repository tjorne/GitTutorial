package CarRental;

public class FusionCar extends AFuelCar
{
    public FusionCar(String regNr, String make, String model, int doors, int kmPrLiter)
    {
        super(regNr, make, model, doors, kmPrLiter);
    }

    @Override
    String getFuelType()
    {
        return null;
    }

    @Override
    public int getRegistrationFee()
    {
        return 0;
    }
}
