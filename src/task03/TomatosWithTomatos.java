package task03;

public class TomatosWithTomatos implements Dish{
    //菜名
    private String name;
    //配料
    private String distribution;
    //烹饪时间
    private int cookTime;

    public TomatosWithTomatos() {
    }

    public TomatosWithTomatos(String name, String distribution, int cookTime) {
        this.name = name;
        this.distribution = distribution;
        this.cookTime = cookTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }


    //重写的cook烹饪方法和serve上菜方法
    @Override
    public void cook(){
        System.out.println("配料是"+this.getDistribution()+"的番茄类菜品："+this.getName()+" 开始烹饪，烹饪时间为："+this.getCookTime()+"min");
    }

    @Override
    public void serve(){
       System.out.println("番茄类菜品："+this.getName()+" 上菜完成");
    }
}
