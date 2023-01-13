public class Calculator {
    void nothing()
    {

    }
    static int sumOfNumbers(int a, int b)
    {
        int s = 0;
        s = a + b;
        return s;
    }

    static double divide(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("Nie da sie");
        }
        return (double) a/b;
    }

    static int los(int a,int b)
    {
        int los = 0;
        los = (int) Math.random()*a+b;
        return los;
    }

    static String szyfr(String slowo)
    {
        String szyfr = "";
        //int l = (int) Math.sqrt(slowo.length());
        int i = 1;
        while(i*i < slowo.length())
        {
            i++;
        }
        int d = slowo.length();
        for(int x = d; x < i * i; x++)
        {
            slowo = slowo + " ";
        }

        for(int k = 0; k < i; k++)
        {
            for(int j = k; j < slowo.length(); j = j + i)
            {
                szyfr = szyfr+slowo.charAt(j);
            }
        }

        return szyfr;
    }
}
