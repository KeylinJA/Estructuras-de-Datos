
package estructurasproyecto;

/**
 *
 * @author Keylin
 */
public class Colas {
 
    private NodoColas frente;
    private NodoColas ultimo;

    public NodoColas getFrente() {
        return frente;
    }
    
    public void encola(NodoColas nuevoElemento){
        if(frente == null){
            frente = nuevoElemento;
            ultimo = nuevoElemento;
        }else{
            ultimo.setAtras(nuevoElemento);
            ultimo = nuevoElemento;
        }
        
    }
    
    public NodoColas atiende(){
        NodoColas aux = frente;
        if(frente != null){
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
}
