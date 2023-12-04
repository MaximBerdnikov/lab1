public class Tiger extends Animal {
    private String Name;
    public static int count=0;
    public Tiger(){
        count++;
    }

    public Tiger(String name){
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
        if(rdist<=600)
        {
            System.out.println(Name +" пробежал " + rdist + " м");
        }
        else
        {
            System.out.println(Name +" не может пробежать больше 600 м");
        }
    }
    @Override public void swim(int sdist){
        this.sdist=sdist;
        if(sdist<=20)
        {
            System.out.println(Name +" проплыл " + sdist + " м");
        }
        else
        {
            System.out.println(Name +" не может проплыть больше 20 м");
        }
    }

}
