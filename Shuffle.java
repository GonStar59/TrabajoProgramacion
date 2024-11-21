public class Shuffle{
  public static void main(String[] args){
     int[][] mano=new int[7][2];
     int[][] mesa=new int[5][2];
     int[][] baraja = {
            {1, 4}, {1, 1}, {1, 2}, {1, 3},  // As
            {2, 4}, {2, 1}, {2, 2}, {2, 3},  // 2
            {3, 4}, {3, 1}, {3, 2}, {3, 3},  // 3
            {4, 4}, {4, 1}, {4, 2}, {4, 3},  // 4
            {5, 4}, {5, 1}, {5, 2}, {5, 3},  // 5
            {6, 4}, {6, 1}, {6, 2}, {6, 3},  // 6
            {7, 4}, {7, 1}, {7, 2}, {7, 3},  // 7
            {8, 4}, {8, 1}, {8, 2}, {8, 3},  // 8
            {9, 4}, {9, 1}, {9, 2}, {9, 3},  // 9
            {10, 4}, {10, 1}, {10, 2}, {10, 3},  // 10
            {11, 4}, {11, 1}, {11, 2}, {11, 3},  // J
            {12, 4}, {12, 1}, {12, 2}, {12, 3},  // Q
            {13, 4}, {13, 1}, {13, 2}, {13, 3}   // K
        };
     baraja=barajar(baraja).clone();
     int posicion=0;
     mano[0][0]=baraja[posicion][0];//saca una carta de la baraja u se la da a la mano
     mano[0][1]=baraja[posicion][1];
     posicion++;//añade 1 al contador para sacar despues la siguiente carta
     mirar(baraja);
     System.out.println("Mano: ");
     mirar(mano);
        
  }
  
  public static void mirar(int[][] baraja){
  for (int i = 0; i < baraja.length; i++) {
            for (int j = 0; j < baraja[i].length; j++) {
                System.out.print(baraja[i][j] + " ");
            }
            System.out.println();
        }
  
  }
  public static int[][] barajar(int[][] baraja){// Barajar la baraja 
    int cambio,cambio2,n1,m1;
    for(int i=0;i<1000;i++){//intercambiara dos columnas alatorias del array
      n1=(int)(Math.random()*52);  //crea un numero aleatorio que sera una posicion del array baraja
      m1=(int)(Math.random()*52);  //crea un numero aleatorio que sera otra posicion del array baraja

      cambio=baraja[n1][0];
      cambio2=baraja[n1][1]; //Guarda los valores del primer array
      baraja[n1][0]=baraja[m1][0]; //Actualiza los valores del preimer array por los del segundo
      baraja[n1][1]=baraja[m1][1];
      baraja[m1][0]=cambio; //los valores guardados del primer array se pasan a l segundo
      baraja[m1][1]=cambio2;
    }
    return baraja;
  }
  public static int repartir(int[][] baraja,int contador){
    return baraja[contador][0]; 
  }
}


