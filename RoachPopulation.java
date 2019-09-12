public class RoachPopulation
{
    private double population;
    public RoachPopulation(double pop)
    {
        population = pop;
    }
    public void spray(double percent)
    {
        population = population*percent;
    }
    public double getRoaches()
    {
        return population;
    }
    public void breed()
    {
        population = 2*population;
    }
}