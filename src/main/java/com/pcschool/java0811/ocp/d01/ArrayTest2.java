
package com.pcschool.java0811.ocp.d01;

public class ArrayTest2 {
    public static void main(String[] args) {
        //stock profit
        double[] stocks={ 7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        //bound profit
        double[] bounds={ 6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        
        Util _stock = new Util();
        Util _bound = new Util();
        
        _stock.values = stocks;
        _bound.values = bounds;
        
        System.out.printf("股票平均: %.3f 股票CV: %.3f\n", _stock.getAvg(), _stock.getCV());
        System.out.printf("公債平均: %.3f 公債CV: %.3f\n", _bound.getAvg(), _bound.getCV());
        
        
    }
}
