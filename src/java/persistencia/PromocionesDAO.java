package persistencia;

import entidades.Promocion;
import java.util.ArrayList;

public class PromocionesDAO {
    public static ArrayList obtener() {
       String promo="Cabañas, descuento del 50%, fin de semana";
       ArrayList miListado= new ArrayList();
       
       
       Promocion mipromo= new Promocion ("Cabañas" , "50% de descuento");
       Promocion mipromo2= new Promocion ("Empanadas" , "30% de descuento");
       Promocion mipromo3= new Promocion ("Donas" , "3x2");
       
       miListado.add(mipromo);
       miListado.add(mipromo2);
       miListado.add(mipromo3);
       
       
       return miListado;
        
    }
}
