/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nube;

/**
 *
 * @author JorgeManuel
 * Hilos relacionados con descargas de archivos en un servidor
 */
public class ServidorThread extends Thread{
    private String nombre;

	private Usuario usuario;

	private long initialTime;
        
// Constructor, getter & setter
        
	public ServidorThread(String nombre, Usuario usuario, long initialTime) {        

        this.nombre = nombre;
        this.usuario = usuario;
        this.initialTime = initialTime;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getInitialTime() {
        return initialTime;
    }

    
    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    
    //Lo que se encuentra en el metodo "run()" se va a ejecutar de forma secuencial en un hilo
    @Override
    public void run() {
        System.out.println("\nEL " + this.nombre + " COMIENZA A CARGAR ARCHIVOS DEL "
                + this.usuario.getNombre() + " EN EL TIEMPO: "
                //Calculamos el tiempo que ha transcurrido, y lo pasamos a segundos
                + (System.currentTimeMillis() - this.initialTime) / 1000+ "SEGUNDOS\n");
        
        for (int i = 0; i < this.usuario.getNumeroArchivos().length; i++) {
            this.tiempoEspera(usuario.getNumeroArchivos()[i]);
            System.out.println("ENVIANDO LOS ARCHIVOS " + (i + 1)
                    + " DEL " + this.usuario.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000+ "SEGUNDOS");
        }
        
        System.out.println("\nEL " + this.nombre + " HA TERMINADO DE PROCESAR "
                + this.usuario.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000+ "SEGUNDOS");
    }

	private void tiempoEspera(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
