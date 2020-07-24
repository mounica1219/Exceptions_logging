import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {
    public static void main(String[] args)
    {
        final Logger log=LogManager.getLogger(Client.class);
        Scanner sc=new Scanner(System.in);
        log.info("Enter Principal amount:");
        double p = sc.nextDouble();
        log.info("Enter Time:");
        double t=sc.nextDouble();
        log.info("Enter rate of interest:");
        double r=sc.nextDouble();

        Compound c_obj= new Compound(p, t, r);
        Simple s_obj=new Simple(p, t, r);

        log.info("Simple Interest : "+s_obj.Calculate());
        log.info("Compound Interest : "+c_obj.Calculate());

        log.info("Enter area of house(In square feet):");
        double house_area=sc.nextInt();
        log.info("Is it fully_automated (true or false):");
        boolean fully_automated=sc.nextBoolean();
        log.info("Enter material:");
        String material_standard = sc.next();

        Construction obj2= new Construction(material_standard,house_area,fully_automated);

        log.info("Total Construction Cost : "+obj2.cost_calculation());
    }
}