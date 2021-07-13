import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取当前时间
		LocalDate localDate = LocalDate.now();
		//指定格式化规则
		DateTimeFormatter f = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		String s = localDate.format(f);
		System.out.println(s);
	}

}
