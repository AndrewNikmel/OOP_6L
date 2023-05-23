package solid.dip;

import java.util.List;

public class DisplayReport implements Reportable{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Вывод на экран");
    }
}
