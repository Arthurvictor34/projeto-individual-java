
public class Equipamento {

     // atrbuidos do equipamento 
     private String NomeEquipamento;
     private float CustoEquipamento;
     private String CodigoIdentificação;
     private float CustoReparo;
     private String TipoEquipamento;

     public Equipamento(String NomeEquipamento, float CustoEquipamento, String CodigoIdentificação, float CustoReparo, String TipoEquipamento ){
          this.NomeEquipamento = NomeEquipamento;
          this.CustoEquipamento = CustoEquipamento;
          this.CodigoIdentificação = CodigoIdentificação;
          this.CustoReparo = CustoReparo;
          this.TipoEquipamento = TipoEquipamento;
          
     }
     
     public Equipamento(){

     }

     public void SetNomeEquipamento( String NovoEquipamento ){
          this.NomeEquipamento = NovoEquipamento;
     }

     public String GetNomeEquipamento(){
          return this.NomeEquipamento;
     }

     public void SetCustoEquipamento( float NovoCustoEquipamento ){
          this.CustoEquipamento = NovoCustoEquipamento;
     }

     public float GetCustoEquipamento(){
          return this.CustoEquipamento;
     }

     public void SetCodigoIdentificação( String NovoCodigoIdentificação ){
          this.CodigoIdentificação = NovoCodigoIdentificação;
     } 

     public String GetCodigoIdentificação(){
          return this.CodigoIdentificação;
     }

     public float SetCustoReparo( float NovoCustoReparo){
          this.CustoReparo = NovoCustoReparo;
     }

     public float GetCustoReparo(){
          return this.CustoReparo;
     }

     public void SetTipoEquipamento( String NovoTipoEquipamento){
          this.TipoEquipamento = NovoTipoEquipamento;
     }

     public String GetTipoEquipamento(){
          return this.TipoEquipamento;
     }
     
}
