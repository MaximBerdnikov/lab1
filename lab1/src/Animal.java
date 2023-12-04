public abstract class Animal {

    private String Name;
    public String Name1(){
        return Name;
    }
    int rdist;
    int sdist;
    public void run(int rdist){
        this.rdist=rdist;
    }
    public void swim(int sdist){
        this.sdist=sdist;
    }
}
