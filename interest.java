public class Interest {
    double p,t,r;
    Interest(double principal)
    {
        this.p=principal;
    }
}
class Simple extends Interest
{
    Simple(double principal,double time,double rate)
    {
        super(principal);
        this.t=time;
        this.r=rate;
    }
    double Calculate()
    {
        return (this.p*this.t*this.r)/100;
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
        return p+Math.pow((1+r),t);
    }
}