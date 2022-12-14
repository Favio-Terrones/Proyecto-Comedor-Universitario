
package interfaces;

/**
 *
 * @author Favio
 */
public interface IColecciones {
    
    public boolean add(Object elemento);
    public int find(String codigo);
    public Object[][] getDatos();
    public boolean update(Object  elemento);
    public boolean remove(String id);
    public String[] getCabecera();
    
    public boolean isLleno();
    public void aumentarTamanho();
    public void moverElementos(int posicion) ;
    public boolean isVacio() ;
    
}
