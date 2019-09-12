public class RoachTester
{
    public static void main(String[] args)
    {
        RoachPopulation roach = new RoachPopulation(10);
        roach.spray(.90);
        System.out.println("Roach population = " + roach.getRoaches());
    }
}
        