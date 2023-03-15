package practices.invidualquestions;

public class Lasagna
{

    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method

        Lasagna lasagna = new Lasagna();



    public int expectedMinutesInOven()
    {
        return 40;
    }

    public int remainingMinutesInOven(int remainedTime)
    {
        return (40 - remainedTime);
    }

    public int preparationTimeInMinute(int numOfLayers)
    {
        return (numOfLayers * 2);
    }

    public int totalTimeInMinutes(int numOfLayers , int spendingTimeInOven)
    {
        return ((numOfLayers * 2) + spendingTimeInOven);
    }
}
