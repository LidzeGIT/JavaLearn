
package javaapplication83;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


public class JavaApplication83 {

  
    public static void main(String[] args) {
       
        DemoProperty demo = new DemoProperty();
        
        demo.getKProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("old " + oldValue + ",new " + newValue);
            }
        });
        demo.setK(0.7);
        
        DoubleProperty dp = new SimpleDoubleProperty(2.3);
        DoubleBinding db = new DoubleBinding() {
            {
                super.bind(demo.getKProperty(),dp);
            }
            @Override
            protected double computeValue() {
                System.out.println("!!");
                return demo.getK() + dp.get();
            }
        };
        System.out.println(db.get());
        
    }
    
}

class DemoProperty {
    
    private DoubleProperty k = new SimpleDoubleProperty();
    
    public double getK(){
        return k.get();
    }
    
    public void setK(double k){
        this.k.set(k);
    }
    
    public DoubleProperty getKProperty(){
        return k;
    }
    
}