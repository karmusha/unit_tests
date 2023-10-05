public class Calculator {
    public static int calculation(int firstOperand,int secondOperand, char operator) {
        int result;
        switch(operator) {
            case'+':
                result = firstOperand + secondOperand;
                break;
            case'-':
                result = firstOperand - secondOperand;
                break;
            case'*':
                result = firstOperand * secondOperand; 
                break;
            case'/':
                if(secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
        } else {
            throw new ArithmeticException("Division by zero is not possible");
        } default:
            throw new IllegalStateException("Unexpected value operator:" + operator);
        }
        
        return result;
    }

    public static float calculateDiscount(float sum, int percent) {
        float res = 0;
        try {
            res = sum - (sum * percent);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return res;
    }
    // В классе Calculator создайте метод calculateDiscount,
    // который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
    // Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    // Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
    // Не забудьте написать тесты для проверки этого поведения.
}
