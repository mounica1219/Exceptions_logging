public class Construction {
    double area;
    String material;
    boolean fully;
    double total_cost;
    public Construction(String material_standard,double house_area,boolean fully_automated)
    {
        material=material_standard;
        area=house_area;
        fully=fully_automated;
    }


    double cost_calculation()
    {
        if(fully==false)
        {   System.out.println("if block starts");
            if(material.equals("standard"))
            {
                total_cost=1200*area;

            }
            else if(material.equals("above_standard"))
            {
                total_cost=1500*area;

            }
            else if(material.equals("high_standard"))
            {
                total_cost=1800*area;
            }
        }
        else
        {
            if(material.equals("high_standard"))
            {
                total_cost=2500*area;
            }
        }
        return total_cost;
    }
}