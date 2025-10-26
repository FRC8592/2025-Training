package AC;

public class Marathon 
{
    public static void main(String[] args)
    {
        String[] names = {"Joe", "Annie", "Ayesha", "Chris", "Rene"};
        double[] marathonTime = {267,240,250,300,350};

        double bestTime = 1000000;
        double secondBestTime = 1000000;
        int bestTimeIndex = -1;
        int secondBestTimeIndex = -1;

        for (int i=0; i < marathonTime.length; i++)
        {
            if (marathonTime[i] < bestTime)
            {
                bestTime = marathonTime[i];
                bestTimeIndex = i;
            }
        }

        for (int i=0; i < marathonTime.length; i++)
        {
            if (marathonTime[i] < secondBestTime)
            {
                if (marathonTime[i] == bestTime)
                {
                    continue;
                }
                secondBestTime = marathonTime[i];
                secondBestTimeIndex = i;
            }
        }

        System.out.println("1st place is " + names[bestTimeIndex] + " with a time of " + bestTime + ", and 2nd place is " + names[secondBestTimeIndex] + " with a time of " + secondBestTime + "!");
    }

}
