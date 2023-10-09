import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CalculadoraSimples {
    private String n1,n2;
    private Double calculo;

    public Double getCalculo() {
        return calculo;
    }

    public void setCalculo(Double calculo) {
        this.calculo = calculo;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public void pergunta(){
        setN1(JOptionPane.showInputDialog(null, "digite um Numero", "Numero 1", 0));
        setN2(JOptionPane.showInputDialog(null, "Digite um segundo numero", "Numero 2", 0));

       if(Pattern.matches("\\d+", getN1()) && Pattern.matches("\\d+",getN2())){
        Double.parseDouble(getN1());
        Double.parseDouble(getN2());
       }else{
        JOptionPane.showMessageDialog(null, "Você digitou uma letra", "erro", 0);
       pergunta();
    }
    }

    public Double converteN1(){
        return Double.parseDouble(getN1());
    }

    public Double converteN2(){
        return Double.parseDouble(getN2());
    }

     public double fazerSoma(){
         setCalculo(converteN1() + converteN2());
         return getCalculo(); 
     }

     public double fazerSubtracao(){
         setCalculo(converteN1() - converteN2());
       return getCalculo();
     }

     public Double fazerDivisao(){
         try {
            setCalculo(converteN1()/converteN2());
            return getCalculo();
         } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Não é possivel dividir por 0", "Error",0);
            System.out.println("Teste");
            return fazerDivisao();
         }
        

     }

     public Double fazerMultiplicacao(){
        pergunta();
        setCalculo(converteN1()*converteN2());
        return getCalculo();
     }



}
