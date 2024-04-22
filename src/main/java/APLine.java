public class APLine
{
  private int a, b, c;
  private double slope;
  APLine(int 1, int 2, int 3)
  {
    a=1;
    b=2;
    c=3;
    slope = -((double)(a))/b;
  }
  public int getSlope()
  {
    return slope;
  }
  public boolean isOnLine(x,y)
  {
    if(a*x+b*y+c==0)
      return true;
    return false;
  }
}
