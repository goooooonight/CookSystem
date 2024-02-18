package task03;



public class Main {
    public static void main(String[] args) {
        //创建大厨对象
        Chef chef=new Chef();

        //分别创建两种菜品的对象
        Dish dish1=new TomatosWithTomatos("番茄炒西红柿","圣女果、白糖",8);
        Dish dish2=new SautéCarrots("爆炒胡萝卜","胡萝卜、盐",10);

        //调用分别调用两种菜品的cook、serve方法的方法
        chef.cookAndServe(dish1);
        chef.cookAndServe(dish2);
    }
}
