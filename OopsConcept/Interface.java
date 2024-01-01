public class Interface{
    public static void main(String []args){
        queen a=new queen();
        a.moves();
    }
}
interface chessPlayer{
    void moves();
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,(diagonal in all 4direction)");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,(diagonal -by 1stepss)");
    }
}