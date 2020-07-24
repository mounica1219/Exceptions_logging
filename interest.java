public class Interest {
    double principal,time,rate;
     Interest(double principal)
     {
         this.principal=principal;
     }
}
class Simple extends Interest
{
    Simple(double principal,double time,double rate)
    {
        super(principal);
        this.time=time;
        this.rate=rate;
    }
    double Calculate()
    {
        return (this.principal*this.time*this.rate)/100;
    }
}
class Compound extends Simple
{
    Compound(double principal,double time,double rate)
    {
        super(principal,time,rate);
    }
    double Calculate()
    {
        return principal+Math.pow((1+rate),time);
    }
}