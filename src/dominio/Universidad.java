
package dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class Universidad {

    private Facultad facultades[];

    public Universidad() {
        facultades=new Facultad[2];
        facultades[0]= new Facultad("Electricidad");
        facultades[1]= new Facultad("Computacion");
                
       
    }

}
