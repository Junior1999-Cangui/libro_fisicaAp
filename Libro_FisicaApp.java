
package libro_fisicaapp;

/**
 *
 * @author Junior Steven Cangui Toapanta
 */

class Libro_Fisica {
    
    // Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
        
    
    public Libro_Fisica(int pCodigo, String pTitulo,String pAutor, int pAnio_edicion){
      
       codigo=pCodigo;  
       titulo=pTitulo;
       autor=pAutor;
       anio_edicion=pAnio_edicion;
    }
    
    
    
    public int getCodigo(){
        return codigo;
    }  
    public void setCodigo(int codigo){    
        this. codigo = codigo; /* this puntero que invoca al atributo private codigo*/
    }    
    
    public String getAutor(){    
        return autor;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    
    public String getTitulo(){    
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAnio_edicion(){
        return anio_edicion;
    }
    public void setAnio_edicion(int anio_edicion){
        this.anio_edicion = anio_edicion;     
    }
    

    
     @Override
    public String toString(){
        return "El libro de físca titulado " +titulo+ "fue escrito por el autor " + autor+ " con CODIGO: "+codigo+" --> "
                + "se edito en el anio " +anio_edicion+ ".";
    }
}
 
    public class Libro_FisicaApp {
    
 
    public static void main(String[] args) {
        
        // Creamos los objetos
     
        Libro_Fisica libro1=new Libro_Fisica(0001, "Mecanica Vectorial para Ingenieros ESTATICA ", 2000);
        Libro_Fisica libro2=new Libro_Fisica(0002, "MOVIMIENTOS MRU Y MRUV ", 2003);
        Libro_Fisica libro3=new Libro_Fisica(0003, "CINEMATICA DE CUERPOS RIGIDOS ", 1999);
    
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
   
    }
}