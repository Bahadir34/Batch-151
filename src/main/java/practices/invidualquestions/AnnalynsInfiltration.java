package practices.invidualquestions;

public class AnnalynsInfiltration
{
    public static void main(String[] args)
    {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;

    }


    public boolean canFastAttack(boolean knightIsAwake)
    {
        return knightIsAwake;
    }

    public boolean canSpy(boolean knightIsAwake , boolean archerIsAwake , boolean prisonerIsAwake)
    {
        return (!knightIsAwake && archerIsAwake && !prisonerIsAwake);
    }

    public boolean canSignalPrisoner(boolean archerIsAwake , boolean prisonerIsAwake)
    {
        return (!archerIsAwake && prisonerIsAwake);
    }
}
