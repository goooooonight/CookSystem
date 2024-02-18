package task03;


public class Chef {
    //调用菜品的烹饪、上菜的方法
    public void cookAndServe(Dish dish){
        dish.cook();
        dish.serve();
    }
}
