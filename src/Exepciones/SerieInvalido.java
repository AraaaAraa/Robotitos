/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exepciones;

/**
 *
 * @author Arai
 */
public class SerieInvalido extends RuntimeException {

    /**
     * Creates a new instance of <code>SerieInvalido</code> without detail
     * message.
     */
    public SerieInvalido() {
    }

    /**
     * Constructs an instance of <code>SerieInvalido</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SerieInvalido(String msg) {
        super(msg);
    }
}
