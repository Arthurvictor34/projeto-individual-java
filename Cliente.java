

public class Cliente {

     // atribuidos de identificação 
     
     private String Nome;
     private String Sobrenome;
     private int Celular;
     private String CPF;
     private int Idade;

     public void Setnome( String NovoNome ){
          this.Nome = NovoNome;
     }

     public String Getnome(){
          return this.Nome;
     }

     public void SetSobrenome( String NovoSobrenome){
          this.Sobrenome = NovoSobrenome;
     }

     public String GetSobrenome(){
          return this.Sobrenome;
     }

     public void setCelular( int NovoCelular ){
          this.Celular = NovoCelular;
     }

     public int GetCelular(){
          return this.Celular;
     }

     public void SetCPF( String NovoCPF ){
          this.CPF = NovoCPF;
     }

     public String GetCPF(){
          return this.CPF;
     }

     public void SetIdade( int NovaIdade ){
          this.Idade = NovaIdade;
     }

     public int GetIdade(){
          return this.Idade;
     }
}



