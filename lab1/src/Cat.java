public class Cat extends Animal{
    private String Name;
    public static int count=0;
    public Cat(){
        count++;
    }
    public Cat(String name){
        this();
        Name=name;
    }
    public static int getCount(){
        return count;
    }
    @Override     public String Name1(){
        return Name;
    }
    @Override public void run(int rdist){
        this.rdist=rdist;
        if(rdist<=200)
        {
            System.out.println(Name +" пробежал " + rdist + " м");
        }
        else
        {
            System.out.println(Name +" не может пробежать больше 200 м");
        }

    }
    @Override public void swim(int sdist){
        this.sdist=sdist;
        System.out.println("Кот не умеет плавать");
    }
}
