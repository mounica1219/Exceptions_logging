import java.util.Scanner;
public class Client {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter Time:");
        double t=sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double r=sc.nextDouble();

        Compound c_obj= new Compound(p, t, r);
        Simple s_obj=new Simple(p, t, r);

        System.out.println("Simple Interest : "+s_obj.Calculate());
        System.out.println("Compound Interest : "+c_obj.Calculate());

        System.out.println("Enter area of house(In square feet):");
        double house_area=sc.nextInt();
        System.out.println("Is it fully_automated (true or false):");
        boolean fully_automated=sc.nextBoolean();
        System.out.println("Enter material:");
        String material_standard = sc.next();

        Construction obj2= new Construction(material_standard,house_area,fully_automated);

        System.out.println("Total Construction Cost : "+obj2.cost_calculation());
    }
}