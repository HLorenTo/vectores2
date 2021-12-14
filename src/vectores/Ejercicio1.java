/*
Desarrollar un programa que por medio de un vector de tipo float 
permita almacenar el peso de 5 personas para posteriormente:
- Determinar el promedio del peso de las 5 personas.
- Determinar cuántas personas superar el promedio del peso.
- Determinar cuántas personas son inferiores al promedio del peso.
 */
package vectores;
public class Ejercicio1 {
    public static void main(String[] args) {
        float peso [] = new float [5];
        int prom = (100/peso.length);
        peso [0] = (float) 40.7;
        peso [1] = (float) 50.6;
        peso [2] = (float) 51.4;
        peso [3] = (float) 58.7;
        peso [4] = (float) 54.9;
        float promedio = 0;
        int min =0;
        int max =0;
        for (int i = 0; i < peso.length; i++){
            //promedio = (peso[i]*5/[i]);
            promedio = (peso[i] * (prom)/100)+ promedio;
                                             }
        System.out.println("El promedio de pesos es "+promedio+ " Kg" );    
            for (int i = 0; i < peso.length; i++)
            {
                if (peso[i]< promedio)
                {
                    min++;
                }
                else
                {
                    max++;
                }
            }
                System.out.println  ("Personas debjo del promedio   "+min);
                System.out.println("Personas por encima del promedio "+ max);    
            }
    }

                 

