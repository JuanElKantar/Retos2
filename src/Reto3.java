public class Reto3 {  /*definimos clase */
    public static void main(String[] args) {  /*definimos main */
        
        String[][] teclado = {
            {"Esc ","F1 ","F2 ","F3 ","F4 ","F5 ","F6 ","F7 ","F8 ","F9 ","F10 ","F11 ","F12 ","Impr ","Bloq ","pause "},
            {"°","1","2","3","4","5","6","7","8","9","0","'?","¡¿","Borrar","Insert","Inicio","Re pag","Bloqnum","/","*","-"},
            {"Tab","Q","W","E","R","T","Y","U","I","O","P","¨´","+","Enter","Supr","Fin","Av pag","7","8","9","+"},
            {"Bloq Mayús","A","S","D","F","G","H","J","K","L","Ñ","{","}"," "," "," ","4","5","6"," "},
            {"Shift","<> ","Z","X","C","V","B","N","M",",",".","-"," ","Shift"," ","↑"," ","1","2","3",""," "},
            {"Ctrl","WIN","Alt"," "," "," ","ESPACIO "," "," ","Alt Gr","Win","Sel","Ctrl","←","↓","→","0",".","intro"},
        };


        for(int i=0; i<teclado.length; i++){
            for(int j=0; j<teclado[i].length; j++){
                System.out.print(teclado[i][j]+"\t");
                
            }

            System.out.println("");
            System.out.println("");
    }
}
}