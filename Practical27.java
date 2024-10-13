interface Soundable
{
    void animalSound();
}
class Practical27 implements Soundable
{
    public void animalSound()
    {
        System.out.println("Tiger Sound");
    }
    public static void main(String[] args) {
        Practical27 p = new Practical27();
        p.animalSound();
    }
}
/*
 * Output : tiger sound
 */