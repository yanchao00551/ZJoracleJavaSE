import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ��ǰʱ��
		LocalDate localDate = LocalDate.now();
		//ָ����ʽ������
		DateTimeFormatter f = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		String s = localDate.format(f);
		System.out.println(s);
	}

}
