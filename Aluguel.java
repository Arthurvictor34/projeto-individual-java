

public class Alugel {

     // atribuido de alugel do equipamento
     private double ValorAlugel;
     private String FormaPagamento;
     private String DataInicio; // a data em que foi alugada o equipamento
     private String DataFim; // data de devolução do equipamento
     private float ValorDiaria;
     private float ValorTotal;
     private String Status; // se o equipamento já está alugado ou disponivel

     public void SetValorAlugel( double NovoValorAlugel ){
          this.ValorAlugel = NovoValorAlugel;
     }
     
     public double GetValorAlugel(){
          return this.ValorAlugel;
     }

     public void SetFormaPagamento( String NovaFormaPagamento ){
          this.ValorFormaPagamento = NovaFormaPagamento;
     }
     
     public String GetFormaPagamento(){
          return this.FormaPagamento;
     }

     public void SetDataInicio( String NovaDataInicio ){
          this.DataInicio = NovaDataInicio;
     }
     
     public String GetDataInicio(){
          return this.DataInicio;
     }

     public void SetDataFim( String NovoDataFim ){
          this.ValorDataFim = NovoDataFim;
     }
     
     public String GetDataFim(){
          return this.DataFim;
     }

     public void SetValorDiaria( float NovoValorDiaria ){
          this.ValorDiaria = NovoValorDiaria;
     }
     
     public float GetValorDiaria(){
          return this.ValorDiaria;
     }

     public void SetValorTotal( float NovoValorTotal ){
          this.ValorTotal = NovoValorTotal;
     }
     
     public float GetValorTotal(){
          return this.ValorTotal;
     }

     public void SetStatus( String NovoStatus ){
          this.ValorDiaria = NovoStatus;
     }
     
     public String GetStatus(){
          return this.Status;
     }
}