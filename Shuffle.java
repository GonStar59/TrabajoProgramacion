public class Shuffle{
  public static void main(String[] args){
    int n=6;
    int[] posicion=new int[n]; // 0 para la general 1 para la mesa y mas de 1 para las manos
     int[][] mano1=new int[2][2];
     int[][] mano2=new int[2][2];
     int[][] mano3=new int[2][2];
     int[][] mano4=new int[2][2];
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
     
     mano1[posicion[2]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
     mano1[posicion[2]][1]=baraja[posicion[0]][1];
     posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
     posicion[2]++;
     mano1[posicion[2]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
     mano1[posicion[2]][1]=baraja[posicion[0]][1];
     posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
     posicion[2]++;
     mirar(baraja);
     System.out.println("Te daria a elegir "); 
     //mirar(mano);
        dibujar(mesa);
        System.out.println("Mano: ");
        dibujar(mano1);

        mesa[posicion[1]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
        mesa[posicion[1]][1]=baraja[posicion[0]][1];
        posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
        posicion[1]++; 
        mesa[posicion[1]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
        mesa[posicion[1]][1]=baraja[posicion[0]][1];
        posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
        posicion[1]++; 
        mesa[posicion[1]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
        mesa[posicion[1]][1]=baraja[posicion[0]][1];
        posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
        posicion[1]++;       
      System.out.println("Te daria a elegir "); 
     //mirar(mano);
        dibujar(mesa);
        System.out.println("Mano: ");
        dibujar(mano1);

        mesa[posicion[1]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
        mesa[posicion[1]][1]=baraja[posicion[0]][1];
        posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
        posicion[1]++;       
      System.out.println("Te daria a elegir "); 
     //mirar(mano);
        dibujar(mesa);
        System.out.println("Mano: ");
        dibujar(mano1);

        mesa[posicion[1]][0]=baraja[posicion[0]][0];//saca una carta de la baraja u se la da a la mano
        mesa[posicion[1]][1]=baraja[posicion[0]][1];
        posicion[0]++;//añade 1 al contador para sacar despues la siguiente carta
        posicion[1]++;       
      System.out.println("Te daria a elegir "); 
     //mirar(mano);
        dibujar(mesa);
        System.out.println("Mano: ");
        dibujar(mano1);

        System.out.println("Te daria a elegir "); 
        System.out.println("Te daria el gandor"); 
        
  }
  
  public static void mirar(int[][] baraja){
  for (int i = 0; i < baraja.length; i++) {
            for (int j = 0; j < baraja[i].length; j++) {
                System.out.print(baraja[i][j] + " ");
            }
            System.out.println();
        }
  
  }
  public static int[][] barajar(int[][] baraja){
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
  
  public static void dibujar(int[][] mano){
    System.out.println("\n\n");
    int alt=9, lo=5;
    int n=mano.length;
    for(int j=0;j<=alt;j++){
      for(int i=0;i<(lo*n);i++){
        if(j==0||j==alt){ 
          if(i%5==0){
            System.out.print("\t\t***");
          }else{
            System.out.print("***");
          }  
        }else{
          if(i%5==0){
            System.out.print("\t\t*  ");
          }else if (i%5==4) {
            System.out.print("  *"); 
          }else if((i%5==1&&j==1)||(i%5==3&&j==8)){
            dibujarAux(mano, i/5);
          
          }else{
            System.out.print("   ");
          }
        }
      }
      System.out.println("");
    }
    System.out.println("\n\n");
  }
  public static void dibujarAux(int[][] mano,int pos){
    String rojo = "\u001B[31m";
    String limpiar = "\u001B[0m";
   switch (mano[pos][0]) {
    case 1 : System.out.print("1 ");break;
    case 2 : System.out.print("2 ");break;
    case 3 : System.out.print("3 ");break;
    case 4 : System.out.print("4 ");break;
    case 5 : System.out.print("5 ");break;
    case 6 : System.out.print("6 ");break;
    case 7 : System.out.print("7 ");break;
    case 8 : System.out.print("8 ");break;
    case 9 : System.out.print("9 ");break;
    case 10 : System.out.print("10");break;
    case 11 : System.out.print("J ");break;
    case 12 : System.out.print("Q ");break;
    case 13 : System.out.print("K ");break;
  
    default : System.out.print(" ");break;
   }

   switch (mano[pos][1]) {
    case 1 : System.out.print(rojo+"H"+limpiar);break;
    case 2 : System.out.print(rojo+"D"+limpiar);break;
    case 3 : System.out.print("P");break;
    case 4 : System.out.print("T");break;
   
    default : System.out.print("  ");break;
   }
  }
}