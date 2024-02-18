package task02;

public class Dish {
    //菜名
    private String name;
    //配料
    private String distribution;
    //烹饪时间
    private int cookTime;

    public Dish() {
    }

    public Dish(String name, String distribution, int cookTime) {
        this.name = name;
        this.distribution=distribution;
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

    //煮菜方法
    public void cook(){
        System.out.println("配料是"+this.getDistribution()+"的菜品："+this.getName()+" 开始烹饪，烹饪时间为："+this.getCookTime()+"min");
    }

    //上菜方法
    public void serve(){
        System.out.println("菜品："+this.getName()+" 上菜完成");
    }
}
