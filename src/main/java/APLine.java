public class APLine
{
  private int a, b, c;
  private double slope;
  public APLine(int one, int two, int three)
  {
    a=one;
    b=two;
    c=three;
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
