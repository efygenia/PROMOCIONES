package entidades;

public class Promocion {
   String nombre;
   String descripcion;
   
   public Promocion(String nombre, String descripcion) {
       setNombre(nombre);
       setDescripcion(descripcion);
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Promocion{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
}

