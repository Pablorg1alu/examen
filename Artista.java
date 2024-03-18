package evf.javadoc.original;

public class Artista {
    String nombreArtista;
	//
    public Artista(String nombreArtista) {
	//Hola
        this.nombreArtista = nombreArtista;
    }
    
    public String helloWorld() {
    	return "Hello World!!";
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
}


