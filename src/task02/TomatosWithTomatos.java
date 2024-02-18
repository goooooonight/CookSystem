package task02;

public class TomatosWithTomatos extends Dish{
    //番茄含量
    private int tomatosContent;

    public TomatosWithTomatos(String name, String distribution, int cookTime, int tomatosContent) {
        super(name, distribution, cookTime);
        this.tomatosContent= tomatosContent;
    }


    //展示菜品的方法
    public void show(){
        System.out.println("现在展示的菜品是："+this.getName());
    }
}
