/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exepciones;

/**
 *
 * @author Arai
 */
public class SerieDuplicada extends RuntimeException {

    /**
     * Creates a new instance of <code>SerieDuplicada</code> without detail
     * message.
     */
    public SerieDuplicada() {
    }

    /**
     * Constructs an instance of <code>SerieDuplicada</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SerieDuplicada(String msg) {
        super(msg);
    }
}
