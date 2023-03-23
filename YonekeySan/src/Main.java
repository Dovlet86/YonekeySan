public class Main
{
    public static void main(String[] args)
    {

        int i, san, yone, n;

        for (i = 2; i <= 500; i++) {
            yone = 0;
            for (san = 2; san <= i / 2; san++)
            {if (i % san == 0)
                {
                    yone = 1;
                    break;
                }
            }if (yone == 0)
                System.out.print(i+"\nyonekey\n");
        }
    }
}