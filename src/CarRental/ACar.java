package CarRental;

public abstract class ACar implements ICar
{
    protected String regNr;
    protected String make;
    protected String model;
    protected int doors;

    public ACar(String regNr, String make, String model, int doors)
    {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.doors = doors;
    }

    @Override
    public String getRegistrationNumber() { return this.regNr; }

    @Override
    public String getMake() { return this.make; }

    @Override
    public String getModel() { return this.model; }

    @Override
    public int getNumberOfDoors() { return this.doors; }
}
