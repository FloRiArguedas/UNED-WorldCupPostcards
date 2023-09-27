//Floricela Arguedas - Proyecto#1 | Programación Intermedia 00824

package proyecto_1_floricela;

/**
 *
 * @author Flory
 */
public class Postal {
    //Atributos de la clase postal
    private String categoria;
    private String codigo;
    private int costo;
    

//Constructor sobrecargado

public Postal ( String pcategoria, String pcodigo, int pcosto){
    
    this.categoria= pcategoria;
    this.codigo= pcodigo;
    this.costo= pcosto;
}

// Establecer/ Obtener - SET/GET para manipular la información de las postales

public String getcategoria(){
    return this.categoria;
}

public void setcategoria (String categoria){
    this.categoria = categoria;
}

public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public int getCosto() {
    return costo;
}

public void setCosto(int costo) {
    this.costo = costo;
}

}
