package calculator5;
/**
 * @author ShiryaevAK
 */
/*
Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)
 */
public class DivisionByZeroException7 extends Exception{

    @Override
    public String getMessage() {
        return "В знаменателе указан ноль. Деление на ноль невозможно.";
    }
}
