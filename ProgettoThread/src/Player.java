public class Player extends Thread{
    private String nome;
    private int metri=0 ;


    public Player(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    @Override
    public void run(){
        for(int i =0 ;i<100;i++){
         metri++;
                System.out.println(nome+" ha percorso "+ metri + " metri");
                if(metri==100){
                    System.out.println(nome+ " HA FINITO LA GARA");
                }
        }
        
    }
    
}
