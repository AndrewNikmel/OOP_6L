package solid;

import solid.srp.models.Order;
import solid.srp.models.SaveToJson;
import solid.srp.models.input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        input input = new input();
        Order order = input.inputFromConsole();
        SaveToJson saveToJson = new SaveToJson("order.json", order);
        saveToJson.save();
    }
}
