package cts.restaurant.adapter.main;

import cts.restaurant.adapter.bar.ISoftBar;
import cts.restaurant.adapter.bar.SoftBar;
import cts.restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import cts.restaurant.adapter.bucatarie.AdapterRestaurant;
import cts.restaurant.adapter.bucatarie.Bucatarie;
import cts.restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, float totalNota){
        restaurant.printeazaNota(totalNota);
    }
    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Studio");
//        bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("Marian");
//        bucatarie.printeazaNota(350);

//        Main.imprimare(bar, 230);
        Main.imprimare(bucatarie, 300);

        AdapterRestaurant adapter = new AdapterRestaurant("Studio");
        Main.imprimare(adapter, 450);


        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecte, 500);
    }
}
