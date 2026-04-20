package hw6;

public class CalException extends Exception{ // 繼承 例外，知道這個是例外的類別

	public CalException(String message) {
		super(message); //使用super把訊息傳給父類別(Exception)
	}
}
