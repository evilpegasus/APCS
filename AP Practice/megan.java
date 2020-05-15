public class megan 
{
    //hello
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num == 0)
        {
            digitList.add(0);
        }
        while (num > 0)
        {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size(); i++)
        {
            if (digitList.get(i).intValue() >= digitList.get(i + 1).intValue())
            {
                return false;
            }
        }
        return true;
    }
}