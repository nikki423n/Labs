public class Interest
{
    public static void main(String[] args)
    {
        double p, i;
        p = 1000.0;
        i = 0.05;
        p = p*(1.0+i)+i*(p+p*i)+i*(p*i+p*i*i);
        System.out.println("p=" +p);
    }
}