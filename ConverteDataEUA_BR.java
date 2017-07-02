
public class ConverteDataEUA_BR {


	public String ConverteData(String dataCalendar)
	{
		String aux[] = dataCalendar.split("/");
		dataCalendar = aux[2] + "-" + aux[1] + "-" + aux[0];
		return dataCalendar;
	}

}
