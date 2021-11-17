
package estructurasproyecto;

/**
 *
 * @author Keylin
 */
public class ListaSimple {
    
    private NodoSimple cabeza;
//    
//    public void insertar(Persona p){
//       if(cabeza == null){
//           cabeza = new Nodo(p);
//       }else if(p.getId()<cabeza.getDato().getId()){
//           NodoSimple aux = new NodoSimple(p);
//           aux.setNext(cabeza);
//           cabeza = aux;
//       }else if(cabeza.getNext() == null){
//           cabeza.setNext(new Nodo(p));
//       }else{
//           NodoSimple aux = cabeza;
//           while(aux.getNext()!=null && aux.getNext().getDato().getId() < p.getId()){
//               aux = aux.getNext();
//           }
//           NodoSimple temp = new Nodo(p);
//           temp.setNext(aux.getNext());
//           aux.setNext(temp);
//       }
//    public boolean existe(int id) {

//        boolean siExiste = false;
//
//        if (cabeza != null) {
//            Nodo aux = cabeza;
//
//            while (aux != null && aux.getDato().getId() < id) {
//                aux = aux.getNext();
//            }
//            siExiste = (aux != null && aux.getDato().getId() == id);
//        }
//        return siExiste;
//    }
//
//    public void modifica(Persona p) {
//
//        if (cabeza != null) {
//            Nodo aux = cabeza;
//
//            while (aux != null && aux.getDato().getId() < p.getId()) {
//                aux = aux.getNext();
//            }
//            if (aux != null && aux.getDato().getId() == p.getId()) {
//                aux.getDato().setNombre(p.getNombre());
//            }
//        }}
//
//    
//
//    public void elimina(int id) {
//
//        if (cabeza != null) {
//            if (cabeza.getDato().getId() == id) {
//                cabeza = cabeza.getNext();
//            } else {
//                Nodo aux = cabeza;
//
//                while (aux.getNext() != null && aux.getNext().getDato().getId() < id) {
//                    aux = aux.getNext();
//                }
//
//                if (aux.getNext() != null && aux.getNext().getDato().getId() == id) {
//                    aux.setNext(aux.getNext().getNext());
//                }
//            }
//        }
//    }
//
//    public Persona extrae(int id) {
//        Persona p = null;
//        
//        if (cabeza != null) {
//            if (cabeza.getDato().getId() == id) {
//                p = cabeza.getDato();
//                cabeza = cabeza.getNext();
//            } else {
//                Nodo aux = cabeza;
//                while (aux.getNext() != null && aux.getNext().getDato().getId() < id) {
//                    aux = aux.getNext();
//                }
//                if (aux.getNext() != null && aux.getNext().getDato().getId() == id) {
//                    p = aux.getNext().getDato();
//                }
//                aux.setNext(aux.getNext().getNext());
//            }
//        }
//
//        return p;
//    }
    
//   public Persona extraePorNombre(String nombre) {
//        Persona p = null;
//        if (cabeza != null) {
//            if (cabeza.getDato().getNombre().equals(nombre)) {
//                p = cabeza.getDato();
//                cabeza = cabeza.getNext();
//            } else {
//                Nodo aux = cabeza;
//                while (aux.getNext() != null && !aux.getNext().getDato().getNombre().equals(nombre)) {
//                    aux = aux.getNext();
//                }
//                if (aux.getNext() != null && aux.getNext().getDato().getNombre().equals(nombre)) {
//                    p = aux.getNext().getDato();
//                    aux.setNext(aux.getNext().getNext());
//                }
//            }
//        }
//
//        return p;
//    }
//
//    @Override
//    public String toString() {
//        NodoSimple aux = cabeza;
//        String s = "-----Lista:-----\n";
//        while(aux!=null){
//            s+= aux + "\n";
//            aux = aux.getNext();
//        }
//        s+= "------FIN------";
//        return s;
//    }
//    
//    public int cantidadElementos(){
//        NodoSimple aux = cabeza;
//        int cantidadNodos = 0;
//        while(aux != null){
//            cantidadNodos = cantidadNodos+1;
//            aux = aux.getNext();
//        }
//        return cantidadNodos;
//    }
//    
//    public int cantidadElementosRecursivo(NodoSimple aux){
//        if(aux == null){
//            return 0;
//        }else{
//            return 1 + cantidadElementosRecursivo(aux.getNext());
//        }
//    }
//
//    public NodoSimple getCabeza() {
//        return cabeza;
//    }
}
