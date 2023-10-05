import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[]args) {
        // // Проверка базового функционала с целыми числами:
        // if(8 != Calculator.calculation(2, 6, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if(0 != Calculator.calculation(2, 2, '-')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if(14 != Calculator.calculation(2, 7, '*')){
        //     throw new AssertionError("Ошибка в методе");
        // } 
        // if(2 != Calculator.calculation(100, 50, '/')){
        //     throw new AssertionError("Ошибка в методе");
        // }
        
        // Проверка базового функционала с целыми числами с использованием утверждений:
        // assert 8 == Calculator.calculation(2, 6, '+');
        // assert 0 == Calculator.calculation(2, 2, '-');
        // assert 14 == Calculator.calculation(2, 7, '*');
        // assert 2 == Calculator.calculation(100, 50, '/');

        // // Случаи с неправильными аргументами
        // // аргумент operator типа char, должен вызывать исключение, если он получает небазовые символы (+-*/)
        // try{
        //     Calculator.calculation(8, 4, '_');
        // } catch(IllegalStateException e){
        //     if(!e.getMessage().equals("Unexpected value operator: _")){
        //         throw new AssertionError("Ошибка в методе");
        //     }
        // }

        

    }
}
