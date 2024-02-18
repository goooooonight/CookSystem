package task02;

public class SautéCarrots extends Dish{
    //成本价
    private int costPrice;

    public SautéCarrots(String name, String distribution, int cookTime, int costPrice) {
        super(name, distribution, cookTime);
        this.costPrice = costPrice;
    }


    //摆盘的方法
    public void plating(){
        System.out.println("菜品："+this.getName()+"完成了摆盘");
    }
}
