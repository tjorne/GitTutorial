package CarRental;

public class GasolineCar extends AFuelCar
{
    public GasolineCar(String regNr, String make, String model, int doors, int kmPrLiter)
    {
        super(regNr, make, model, doors, kmPrLiter);
    }

    @Override
    String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee()
    {
        var kml = this.getKmPrLiter();
        if (kml < 5)
        {
            return 10470;
        }
        else if (kml < 10)
        {
            return 5500;
        }
        else if (kml < 15)
        {
            return 2340;
        }
        else if (kml < 20)
        {
            return 1050;
        }
        else
        {
            return 330;
        }
    }
}
