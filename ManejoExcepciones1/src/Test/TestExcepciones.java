/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Davidhernandezn
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
        resultado = 10/0; //ERROR POR DEFECTO *ENVOLVER LA LINEA*
        }catch(Exception e){
            //IMPRIMIR EXCEPTION SI HA OCURRIDO, HAY PILA DE EXECIONES
            e.printStackTrace(System.out);//indica que la salida se mande a consola
            System.out.println("Ocurrio error..");
        }
        //AL OCURRIR UNA EXCEPCION  MANTIENE SU VALOR INICIAL
        System.out.println("Resultado: "+resultado);
    }
}
