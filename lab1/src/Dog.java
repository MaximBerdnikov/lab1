public class Dog extends  Animal{
    private String Name;
    public static int count=0;
    public Dog(){
        count++;
    }
    public Dog(String name){
        this();
        Name=name;
    }
    public static int getCount(){
        return count;
    }
    @Override public String Name1(){
        return Name;
    }
    @Override public void run(int rdist){
        this.rdist=rdist;
        if(rdist<=500)
        {
            System.out.println(Name +" пробежала " + rdist + " м");
        }
        else
        {
            System.out.println(Name +" не может пробежать больше 500 м");
        }
    }
    @Override public void swim(int sdist){
        this.sdist=sdist;
        if(sdist<=10)
        {
            System.out.println(Name +" проплыла " + sdist + " м");
        }
        else
        {
            System.out.println(Name +" не может проплыть больше 10 м");
        }
    }
}
