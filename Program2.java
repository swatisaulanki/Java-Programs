
class ProgramTwoComputer
{
    public void playMusic()
    {
        System.out.println("Music plying..");

    }
    public String getMePen(int cost)
    {
        if(cost>=10)
        {
            return "pen";
        }
        else{
            return "Nothing";
        }
    }
}

public class Program2
{
    public static void main(String args[])
    {
        ProgramTwoComputer obj= new ProgramTwoComputer();
         obj.playMusic();
        String str= obj.getMePen(10);
        System.out.println(str);
    }
}