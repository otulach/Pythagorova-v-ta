package cz.xelfi.pythagorovaveta;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;
import net.java.html.json.ModelOperation;
import net.java.html.json.OnPropertyChange;
@Model(className = "Data", targetId = "", instance = true, properties = {
    @Property(name = "a", type = double.class),
    @Property(name = "b", type = double.class)
})
final class DataModel {
    /**
     * Called when the page is ready.
     */
    static void onPageLoad() {
        Data ui = new Data();
        ui.applyBindings();
    }
    @ComputedProperty(write = "nastavc") 
    static double c(double a,double b){
        return Math.sqrt(a * a + b * b);
    }
    static void nastavc(Data d, double c){
        double a = d.getA();
        d.setB(Math.sqrt(c * c - a * a));
    }
}
