/*
 Desarrollar un programa que dados dos grupos (Grupo A – Grupo B) 
cada uno con 10 estudiantes y una nota final de la materia por 
estudiante, determinar:
- El promedio general de cada grupo.
- El promedio general de ambos grupos.
- El grupo con mejor promedio.
 */
package vectores;
public class Ejercicio2 {
public static void main(String[] args) {  
    String grupoA[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
    String grupoB[] = {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"};
    float notasA[] = {1,5,7,3,2,7,9,2,1,4}; 
    float notasB[] = {6,2,8,4,7,2,0,1,5,7};
    float promedio = 0, promediototal, promedioA = 0, promedioB = 0;
    for (int i = 0; i < notasA.length;i++){
        promedioA = (notasA[i] + (promedioA)/notasA.length);
    }   System.out.println("Promedio del Grupo A: "+promedioA);
    for (int i = 0; i < notasB.length;i++){
        promedioB = (notasB[i] + (promedioB)/notasB.length);
    }   System.out.println("Promedio del Grupo B: "+promedioB);
    promediototal = (promedioA+promedioB)/2;
    System.out.println("El promedio general es de: "+promediototal);
   if(promedioA > promedioB){
       System.out.println("El grupo con mejor promedio es el grupo A con un promedio de: "+promedioA);
   }else{
       System.out.println("El grupo con mejor promedio es el grupo B con un promedio de: "+promedioB);
   }    
} 
}
