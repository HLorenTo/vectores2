package vectores;
public class Vectores {
    public static void main(String[] args) {
    String nombres [] = new String [4];
    nombres [0] = " Lorena";
    nombres [1] = " Julieth";
    nombres [2] = " Torres";
    nombres [3] = " Hernandez";
    for (int i = 0; i < nombres.length; i++)
    {
        System.out.println("Nombre "+i +" - " +nombres[i] );
    }
    /*
Desarrollar un programa que, mediante el uso de dos vectores,
permita almacenar las 5 notas de un estudiante para calcular su
promedio final, los valores para calcular el promedio se
encuentran en un vector a parte que contiene los porcentajes
asignados a cada nota.
    */
    double notas [] = new double [5];
    int porcentaje [] = {20, 10, 30, 20,20};
    notas [0] = 4.5;
    notas [1] = 3.5;
    notas [2] = 4.0;
    notas [3] = 3.3;
    notas [4] = 3.7;
    double promedio = 0;
    for (int i = 0; i<notas.length; i++){
        promedio = (notas[i] * (porcentaje [i])/100)+ promedio;
    }
    System.out.println("Promedio 1 final "+ Math.round(promedio));
    
    
    
    
    //DEFINIR LOS NOMBRES
    
    String nombresC [] = {"LORENA","JULIETH","JUAN","LUISA", "ANA", "LUIS"};
    //DEFINIR LA CADENA DEL ABCDARIO
    char caracteres [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                          'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                          'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    //NUMEROS PARA ASIGNAR AL ABCDARIO
    int numeros []     = {1,2,3,4,5,6,7,8,9,10,11,
                         12,13,14,15,16,17,18,19,
                         20,21,22,23,24,25,26,27};
    //DECLARA VARIABLE PARA ADMINISTRAR EL CICLO WHILE
    int x = 0;
    //DECLARA LA VARIABLE PARA ALMACENAR LOS NOMBRES PERO EN VALORES NUMERICOS
    String nombreA = "";
    //SE RECORRE EL VECTOR DE LOS NOMBRES CON EL USO DE WHILE
    while (x<5)
    {
    //CON EL PRIMER FOR SE RECORRERA LOS CARACTERES DE CADA NOMBRE    
    //nombreC[x] REPRESENTA EL VALOR DE UN NOMBRE DETERMINADO POR LA
        //ITERACION DEL COLI WHILE
        for(int j = 0; j < nombresC[x].length(); j++ )
        {
    //CON EL SEGUNDO FOR SE RECORRERA LOS CARACTERES DEL ABCDARIO        
            for (int k = 0; k < caracteres.length; k++)
            {
    //SE UTILIZA IN CONDICIONAL PARA DETERMINAR QUE CARACTER DEL NOMBRE
    // LE EQUIVALE AL NUMERO YA PREESTABLECIDO
    // NOMBRE[x].CHARTAT(J) REPRESENTA LOS CARACTERES DEL NOMBRE QUE SE
    // SE ENCUENTRA EN ITERACION, PREMITE RECORRER LOS CARACTERES DE UN
    //STRIN POR MEDIO DE UN INDICE
    // CARACTERES [K] REPRESENTA LOS CARACTERES DEFINIDOS EN EL VECTOR
    // DEL ABCDARIO
                if (nombresC [x].charAt(j) == caracteres[k])
                {
    //LA OPERACION DE CONCATENACION QUE REPRESENTA EL FUNCIONAMIENTO 
    //CORRECTO DEL EJERCICIO:
                    nombreA = nombreA+numeros[k]; 
                }
            }
        }
        
     nombresC [x]    = nombreA;
        System.out.println(nombresC[x]);
    //SE REINICIA LA VARIABLE PARA SEGUIR CON LA PROXIMA ITERACION
        nombreA = "";
        x++;
    }
    }
    
    
}
