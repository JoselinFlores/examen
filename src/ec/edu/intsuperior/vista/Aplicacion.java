/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.io.PrintStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {  
       BuscaTesoro() ;
             
        
          
     
    }
            
    public static void Contraseña1 () {
        Scanner sc = new Scanner(System.in);
       String Contraseña = "eureka";
       final int INTENTOS = 3;
       boolean acierto=false;
       String password;
        for (int i = 0; i <INTENTOS&&!acierto; i++) {
            System.out.println("Introduce una contraseña");
            password = sc.next();
            if (password.equals(Contraseña)){
                System.out.println("En hora buena acertaste"); 
                acierto=true;
            }
            
        }
       
       
       
        
        
    }
   
    public static void Minusculas () {
    for (char c='a'; c<='z'; c++) {
 System.out.println("El caracter " + (int)c + " es: " + c);
 }
 
        
        
    }
   
    public static void Factorial() {
            int n, f;
        String[] args = null;
             n = Integer.parseInt(args[0]);
             f = 1;
             for (int i = 2; i<=n; i++) {
             f *= i; // equivalente a f = f * i
             }
         System.out.print("El factorial de " + n);
         System.out.println(" es: " + f);
        }
        
    public static void Colores () {
System.out.print("\033[33m mandarina");
System.out.print("\033[32m hierba");
System.out.print("\033[31m tomate");
System.out.print("\033[37m sábanas");
System.out.print("\033[36m cielo");
System.out.print("\033[35m nazareno");
System.out.print("\033[34m mar");
}

    public static void Salidanumero() {
   System.out.printf("El número %d no tiene decimales.\n", 21);
   System.out.printf("El número %f sale con decimales.\n", 21.0);
   System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);

    }
    
    public static void Leenumeros() {
       String linea;
System.out.print("Por favor, introduce un número: ");
linea = System.console().readLine();
int primerNumero;
primerNumero = Integer.parseInt( linea );
System.out.print("introduce otro, por favor: ");
linea = System.console().readLine();
int segundoNumero;
segundoNumero = Integer.parseInt( linea );
int total;
total = (2 * primerNumero) + segundoNumero;
System.out.print("El primer número introducido es " + primerNumero);
System.out.println(" y el segundo es " + segundoNumero);
System.out.print("El doble del primer número más el segundo es ");
System.out.print(total);
}
    
    public static void Operadoreslogicos() {
        System.out.println("Adivina el número que estoy pensando.");
System.out.print("Introduce un número entre el 1 y el 100: ");
String linea = System.console().readLine();
int n = Integer.parseInt( linea );
if ((n < 1) || (n > 100)) {
System.out.println("El número introducido debe estar en el intervalo 1 - 100.");
System.out.print("Tienes otra oportunidad, introduce un número: ");
linea = System.console().readLine();
n = Integer.parseInt( linea );
}
if (n == 24) {
System.out.println("¡Enhorabuena!, ¡has acertado!");
} else {
System.out.println("Lo siento, ese no es el número que estoy pensando.");
        
    }
    }
    
    public static void CuentaPositivos() {
 System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
System.out.println("Para terminar, introduzca un número negativo.");
int numeroIntroducido = 0;
int cuentaNumeros = 0;
int suma = 0;
while (numeroIntroducido >= 0) {
numeroIntroducido = Integer.parseInt(System.console().readLine());
cuentaNumeros++; // Incrementa en uno la variable
suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
     
System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
}
}
    
    public static void Aleatorio() {
       System.out.println("Muestra un día de la semana al azar:");
int dia = (int)(Math.random()*7) + 1; // genera un número aleatorio
// entre el 1 y el 7
switch(dia) {
case 1:
System.out.println("lunes");
break;
case 2:
System.out.println("martes");
break;
case 3:
System.out.println("miércoles"); break;
case 4:
System.out.println("jueves");
break;
case 5:
System.out.println("viernes");
break;
case 6:
System.out.println("sábado");
break;
case 7:
System.out.println("domingo");
break;
default:
}
} 

    public static void BuscaTesoro() {
    // se definen constantes para representar el
// contenido de las celdas
final int VACIO = 0;
final int MINA = 1;
final int TESORO = 2;
final int INTENTO = 3;
int x;
int y;
int[][] cuadrante = new int[5][4];
// inicializa el array
for(x = 0; x < 4; x++) {
for(y = 0; y < 3; y++) {
cuadrante[x][y] = VACIO;
}
}
// coloca la mina
int minaX = (int)(Math.random() * 5);
int minaY = (int)(Math.random() * 4);
cuadrante[minaX][minaY] = MINA;
// coloca el tesoro
int tesoroX;
int tesoroY;
do {
tesoroX = (int)(Math.random() * 5);
tesoroY = (int)(Math.random() * 4);
} while ((minaX == tesoroX) && (minaY == tesoroY));
cuadrante[tesoroX][tesoroY] = TESORO;
// juego
System.out.println("¡BUSCA EL TESORO!");{
        
    }
boolean salir = false;
String c = "";
do {
// pinta el cuadrante
for(y = 3; y >= 0; y--) {
System.out.print(y + "|");
for(x = 0; x < 5; x++) {
if (cuadrante[x][y] == INTENTO) {
System.out.print("X ");
} else {
System.out.print(" ");
}
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");
// pide las coordenadas
System.out.print("Coordenada x: ");
x = Integer.parseInt(System.console().readLine());
System.out.print("Coordenada y: ");
y = Integer.parseInt(System.console().readLine());
// mira lo que hay en las coordenadas indicadas por el usuario
switch(cuadrante[x][y]) {
case VACIO:
cuadrante[x][y] = INTENTO;
break;
case MINA:
System.out.println("Lo siento, has perdido.");
salir = true;
break;
case TESORO:
System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
salir = true;
break;
default:
}
} while (!salir);
// pinta el cuadrante
for(y = 3; y >= 0; y--) {
System.out.print(y + " ");
for(x = 0; x < 5; x++) {
switch(cuadrante[x][y]) {
case VACIO:
c = " ";
break;
case MINA:
c = "* ";
break;
case TESORO:
c = "€ ";
break;
case INTENTO:
c = "X ";
break;
default:
}
System.out.print(c);
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");
    
        
    }

    
public static void Aleatorios() {
         System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
for (int i = 1; i <= 20; i++) {
System.out.print(((int)(Math.random()*11) + 50 ) + " ");
}
System.out.println();
}
     
     
    public static void Gato() {
 
 GatoSimple garfield = new GatoSimple("macho");
System.out.println("hola gatito");
garfield.maulla();
System.out.println("toma tarta");
garfield.come("tarta selva negra");
System.out.println("toma pescado, a ver si esto te gusta");
garfield.come("pescado");
GatoSimple tom = new GatoSimple("macho");
System.out.println("Tom, toma sopita de verduras");
tom.come("sopa de verduras");
GatoSimple lisa = new GatoSimple("hembra");
System.out.println("gatitos, a ver cómo maullás");
garfield.maulla();
tom.maulla();
lisa.maulla();
garfield.peleaCon(lisa);
lisa.peleaCon(tom);
tom.peleaCon(garfield);
}
     
     
    public static void cubo(){
    
Cubo cubito = new Cubo(2);
Cubo cubote = new Cubo(7);
System.out.println("Cubito: \n");
cubito.pinta();
System.out.println("\nCubote: \n");
cubote.pinta();
System.out.println("\nLleno el cubito: \n");
cubito.llena();
cubito.pinta();
System.out.println("\nEl cubote sigue vacío: \n");
cubote.pinta();
System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
cubito.vuelcaEn(cubote);
System.out.println("Cubito: \n");
cubito.pinta();
System.out.println("\nCubote: \n");
cubote.pinta();
System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito.\n");
cubote.vuelcaEn(cubito);
System.out.println("Cubito: \n");
cubito.pinta();
System.out.println("\nCubote: \n");
cubote.pinta();
} 

    
    public static void Arrays() {
Arrays.List<String> a = new ArrayList<String>();
System.out.println("Nº de elementos: " + a.size());
a.add("rojo");
a.add("verde");
a.add("azul");
System.out.println("Nº de elementos: " + a.size());
a.add("blanco");
System.out.println("Nº de elementos: " + a.size());
System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
System.out.println("El elemento que hay en la posición 3 es " + a.get(3));
}

    public static void ListaColores() {
 ArrayList<String> a = new ArrayList<String>();
a.add("rojo");
a.add("verde");
a.add("azul");
a.add("blanco");
a.add("amarillo");
a.add("blanco");
System.out.println("Contenido de la lista: ");
for(String color: a) {
System.out.println(color);
}
if (a.contains("blanco")) {
System.out.println("El blanco está en la lista de colores");
}
a.remove("blanco");
System.out.println("Contenido de la lista después de quitar la " +
"primera ocurrencia del color blanco: ");
for(String color: a) {
System.out.println(color);
}
a.remove(2);
System.out.println("Contenido de la lista después de quitar el " +
"elemento de la posición 2: ");
for(String color: a) {
System.out.println(color);
}
    }

    public static void TerminaCuandoEsImpar() {
int numero;
do {
System.out.print("Dime un número: ");
numero = Integer.parseInt(System.console().readLine());
if (numero % 2 == 0) {// comprueba si el número introducido es par
System.out.println("Qué bonito es el " + numero);
} else {
System.out.println("No me gustan los números impares, adiós.");
}
} while (numero % 2 == 0);
}

        
    public static void arrays () {
        int[] num = null;
num[0] = 8;
num[1] = 33;
num[2] = 200;
num[3] = 150;
num[4] = 11;
num[5] = 88;
num[6] = num[2] * 10;
num[7] = num[2] / 10;
num[8] = num[0] + num[1] + num[2];
num[9] = num[8];
System.out.println("El array num contiene los siguientes elementos:");
for (int i = 0; i < 10; i++) {
System.out.println(num[i]);
}
}

        
    public static void NotaAlumnos() {
       
 double[] nota = new double[4];
System.out.println("Para calcular la nota media necesito saber la ");
System.out.println("nota de cada uno de tus exámenes.");
for (int i = 0; i < 4; i++) {
System.out.print("Nota del examen nº " + (i + 1) + ": ");
nota[i] = Double.parseDouble(System.console().readLine());
}System.out.println("Tus notas son: ");
double suma = 0;
for (int i = 0; i < 4; i++) {
System.out.print(nota[i] + " ");
suma += nota[i];
}
System.out.println("\nLa media es " + suma / 4);
}
  
 // ejrecicios del examen......
   public static void ordena(int a, int b, int c){
        if(a>=b && a>+c){
            if(b>=c){
                System.out.println("Resultado: "+c+"<"+b+"<"+a);
            }else{
                System.out.println("Resultado: "+b+"<"+c+"<"+a);
            }
        }else if(b>=a && b>+c){
            if(a>=c){
                System.out.println("Resultado: "+c+"<"+a+"<"+b);
            }else{
                System.out.println("Resultado: "+a+"<"+c+"<"+b);
            }  
        }else{
            if(a>=b){
                System.out.println("Resultado: "+b+"<"+a+"<"+c);
            }else{
                System.out.println("Resultado: "+b+"<"+a+"<"+c);
            }
        }
    }
    public static void dado_aleatorio(int n){
        int contador = 0;
        boolean dado = false;
        Random randomico = new Random();
        while(dado == false){
            contador++;
            if(randomico.nextInt(6)+1== n){
                dado = true;
            }
        }
        System.out.println("Numero de veces lanzado el dado: "+contador);
    }
    public static void sumaProgresionGeometrica(){
        Scanner leer = new Scanner(System.in);
        double a,n,r,S=0;
        System.out.println("Suma de una Progresion Geometrica");
        System.out.println("a+ar+ar^2+ar^3+...+ar^n ");
        System.out.println("Ingrese el valor de a: ");
        a = leer.nextInt();
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt();
        System.out.println("Ingrese el valor de r: ");
        r = leer.nextInt();
        while(r==1){
            System.out.println("Error: El valor de r debe ser distinto de 1.");
            System.out.println("Ingrese el valor de r: ");
            r = leer.nextInt();
        }
        for(int i=0;i<=n;i++){
            S=S+a*Math.pow(r,i);
        }
        System.out.println("La suma de la progresion geometrica es:"+S);
        
    }

public static void menu(){
        Scanner leer=new Scanner(System.in);
        int op=0;
        do {
            System.out.println("Ingrese una opcion \n"
                    + "**********\n\n"
                    + "1.-ingrese contraseña\n"
                    + "2.-minusculas\n"
                    + "3.-Factorial\n"
                    + "4.-Colores\n"
                    + "5.-Salida numero\n"
                    + "6.-Leer numeros\n"
                    + "7.-Operadores logicos\n"
                    + "8.-Cuenta positivos\n"
                    + "9.-Aleatorio\n"
                    + "10.-Buscar Tesoro\n"
                    + "11.-Aleatorios\n"
                    + "12.-Gato\n"
                    + "13.-Cubo\n"
                    + "14.-Arrays \n"
                    + "15.-Lista colores\n"
                    + "16.-Termina cuando es impar\n"
                    + "17.-Arrays\n"
                    + "18.-Nota alumnos \n"
                    //EXAMEN
                    + "19.-Ordena \n"
                    + "20.-Dado Aleatorio\n"
                    + "21.-SumaProgresionGeometrica\n"
                    + "0.-Salir del Menu\n");
                    
        op=leer.nextInt();
        switch(op){
            case 1:
                Contraseña1();
                break;
            case 2:
                Minusculas();
                break;
            case 3:
                Factorial();
                break;
            case 4:
                Colores();
                break;
            case 5:
                Salidanumero();
                break;
            case 6:
                Leenumeros();
                break;
            case 7:
                Operadoreslogicos();
                break;
            case 8:
                CuentaPositivos();
                break;
            case 9:
               Aleatorio();
                break;
            case 10:
                BuscaTesoro();
                break;
            case 11:
                Aleatorios();
                break;
            case 12:
                Gato();
                break;
            case 13:
                cubo();
                break;
            case 14:
               arrays();
                break;
            case 15:
                ListaColores();
                break;    
            case 16:
                TerminaCuandoEsImpar();
                break;
            case 17:
                arrays();
                break;
            case 18:
                NotaAlumnos();
                break;
            case 19:
                ordena(0, 0, 0);
                break;
            case 20:
                dado_aleatorio(0);
                break;
            case 21:
                sumaProgresionGeometrica();
                break;
        }
                
                
                 } while(op!=0);
    }

    
        }

         


        
        
    
  
    
     
        
    

    
    