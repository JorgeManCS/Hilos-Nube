/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nube;

/**
 *
 * @author JorgeManuel
 */
public class MainThread {
    public static void main(String[] args) {
                //En el array indico la cantidad de archivos, y cuanto tarda en descargarlos
		Usuario usuario1 = new Usuario("USUARIO 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Usuario usuario2 = new Usuario("USUARIO 2", new int[] { 1, 3, 5, 1, 1, 8, 12 });

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		ServidorThread servidor1 = new ServidorThread("SERVIDOR-1", usuario1, initialTime);
		ServidorThread servidor2 = new ServidorThread("SERVIDOR-2", usuario2, initialTime);

		servidor1.start();
		servidor2.start();
	}
}
