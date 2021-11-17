
package estructurasproyecto;

/**
 *
 * @author Keylin
 */
public class Pilas {
    
    private NodoPilas top;
    
    public void push(NodoPilas ElementoNuevo){
        ElementoNuevo.setAbajo(top);
        top = ElementoNuevo;
    }

    public NodoPilas getTop() {
        return top;
    }
    
    
    
    public NodoPilas pop(){
        NodoPilas aux = top;
        if(PilaVacia()){
            System.out.println("No hay elementos en la pila");
        }else{
            top = top.getAbajo();
            aux.setAbajo(null);
        }
        return aux;
    }
    
    public boolean PilaVacia(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
}
