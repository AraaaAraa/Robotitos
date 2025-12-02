/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exepciones;

/**
 *
 * @author Arai
 */
public class EnergiaIncorrecta extends RuntimeException {

    /**
     * Creates a new instance of <code>EnergiaIncorrecta</code> without detail
     * message.
     */
    public EnergiaIncorrecta() {
    }

    /**
     * Constructs an instance of <code>EnergiaIncorrecta</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EnergiaIncorrecta(String msg) {
        super(msg);
    }
}
